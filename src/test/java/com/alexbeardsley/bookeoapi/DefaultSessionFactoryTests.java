package com.alexbeardsley.bookeoapi;

import com.alexbeardsley.bookeoapi.session.BookeoSession;
import com.alexbeardsley.bookeoapi.session.DefaultBookeoSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSessionFactoryTests {
    private final String APPLICATION_SECRET_KEY = "ABC123";
    private DefaultBookeoSessionFactory factory;

    @Before
    public void setup() {
        factory = new DefaultBookeoSessionFactory(APPLICATION_SECRET_KEY);
    }

    @Test
    public void testGetSession() {
        BookeoSession session = factory.getSession("testApiKey");
        assertNotNull(session);
        assertNotNull(session.bookings());
        assertNotNull(session.customers());
        assertNotNull(session.holds());
        assertNotNull(session.payments());
        assertNotNull(session.resourceBlocks());
        assertNotNull(session.seatBlocks());
        assertNotNull(session.settings());
        assertNotNull(session.subAccounts());
        assertNotNull(session.webhooksApi());
    }
}
