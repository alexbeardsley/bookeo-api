package com.alexbeardsley.bookeoapi;

import com.alexbeardsley.bookeoapi.service.BookeoBookingService;
import com.bookeo.api.model.Booking;
import com.bookeo.api.model.BookingsList;
import com.bookeo.api.model.PaginationInfo;
import com.bookeo.api.request.ApiException;
import com.bookeo.api.service.BookingsApi;
import idv.popcorny.builder.Builder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookingServiceTests {
    private final String APPLICATION_SECRET_KEY = "ABC123";
    private BookeoBookingService service;

    @Mock
    private BookingsApi apiClient;

    @Before
    public void setup() {
        service = new BookeoBookingService(apiClient);
    }

    @Test
    public void testBookingBetweenDates() throws ApiException {
        Date d = new Date();
        when(apiClient.bookingsGet(eq(d), eq(d), any(Date.class), any(Date.class), anyString(), anyBoolean(),
                anyBoolean(), anyBoolean(), anyInt(), anyString(), anyInt()))
                .thenReturn(Builder.of(new BookingsList())
                        .with(BookingsList::setInfo, new PaginationInfo())
                        .withList(BookingsList::setData, (bookings, collectionBuilder) -> collectionBuilder
                                .add(Builder.of(new Booking())
                                        .with(Booking::setBookingNumber, "12345")
                                        .with(Booking::setStartTime, d)
                                        .with(Booking::setEndTime, d)
                                        .build()))
                        .build());
        List<Booking> bookings = service.getBookingsBetweenDates(d, d).getData();
        verify(apiClient, times(1)).bookingsGet(eq(d), eq(d), any(Date.class), any(Date.class), anyString(), anyBoolean(),
                anyBoolean(), anyBoolean(), anyInt(), anyString(), anyInt());
        assertNotNull(bookings);
        assertEquals(1, bookings.size());
        assertEquals("12345", bookings.iterator().next().getBookingNumber());
        assertEquals(d, bookings.iterator().next().getStartTime());
        assertEquals(d, bookings.iterator().next().getEndTime());
    }
}