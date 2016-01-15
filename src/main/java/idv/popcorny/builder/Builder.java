package idv.popcorny.builder;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * https://github.com/alexbeardsley/BuilderMonad
 */
public class Builder<T> {
    private T value;

    private Builder(T value) {
        this.value = value;
    }

    public T build() {
        return value;
    }

    public static <T> Builder<T> of(T value) {
        return new Builder<>(value);
    }

    public static <T> Builder<T> of(T value, Consumer<T> initFunc) {
        return new Builder<>(value)
                .init(initFunc);
    }

    public Builder<T> init(Consumer<T> initFunc) {
        initFunc.accept(value);
        return this;
    }

    public <V> Builder<T> with(BiConsumer<T, V> setter, V v) {
        setter.accept(value, v);
        return this;
    }

    public <V> Builder<T> with(BiConsumer<T, V> setter, V v, BiConsumer<V, Builder<V>> initFunc) {
        setter.accept(value, v);
        initFunc.accept(v, Builder.of(v));
        return this;
    }

    public <V> Builder<T> withCollection(
            BiConsumer<T, Collection<V>> setter,
            Collection<V> v,
            Consumer<CollectionBuilder<V>> initFunc)
    {
        setter.accept(value, v);
        initFunc.accept(CollectionBuilder.of(v));
        return this;
    }

    public <V> Builder<T> withList(
            BiConsumer<T, List<V>> setter,
            List<V> v,
            BiConsumer<List<V>, CollectionBuilder<V>> initFunc)
    {
        setter.accept(value, v);
        initFunc.accept(v, CollectionBuilder.of(v));
        return this;
    }

    public <V> Builder<T> withList(
            BiConsumer<T, List<V>> setter,
            BiConsumer<List<V>, CollectionBuilder<V>> initFunc)
    {
        List<V> v = new ArrayList<>();
        setter.accept(value, v);
        initFunc.accept(v, CollectionBuilder.of(v));
        return this;
    }

    public <K, V> Builder<T> withMap(
            BiConsumer<T, Map<K, V>> setter,
            Map<K, V> v,
            BiConsumer<Map<K, V>, MapBuilder<K, V>> initFunc)
    {
        setter.accept(value, v);
        initFunc.accept(v, MapBuilder.of(v));
        return this;
    }
    public <K, V> Builder<T> withMap(
            BiConsumer<T, Map<K, V>> setter,
            BiConsumer<Map<K, V>, MapBuilder<K, V>> initFunc)
    {
        Map<K, V> v = new HashMap<>();
        setter.accept(value, v);
        initFunc.accept(v, MapBuilder.of(v));
        return this;
    }
}