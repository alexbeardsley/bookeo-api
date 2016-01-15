package com.alexbeardsley.bookeoapi.service;

import com.bookeo.api.model.BookingsList;
import com.bookeo.api.request.ApiException;

import java.util.Date;
import java.util.Map;

public interface BookingService {
    BookingsList getBookingsBetweenDates(Date startDate, Date endDate);
    BookingsList getBookingsBetweenDates(Date startDate, Date endDate, int itemsPerPage);
    BookingsList getBookingsBetweenDatesForProduct(String productId, Date startDate, Date endDate);
    BookingsList getBookingsBetweenDatesForProduct(String productId, Date startDate, Date endDate, int itemsPerPage);
    BookingsList nextPage(Pagination pagination);
    BookingsList previousPage(Pagination pagination);
    BookingsList atPage(Pagination pagination, int pageNumber);

}
