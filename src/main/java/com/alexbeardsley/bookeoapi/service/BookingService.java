package com.alexbeardsley.bookeoapi.service;

import com.bookeo.api.model.BookingsList;
import com.bookeo.api.request.ApiException;

import java.util.Date;

public interface BookingService {
    BookingsList getBookingsBetweenDates(Date startDate, Date endDate) throws ApiException;
    BookingsList nextPage(Pagination pagination) throws ApiException;
    BookingsList previousPage(Pagination pagination) throws ApiException;
    BookingsList atPage(Pagination pagination, int pageNumber) throws ApiException;
}
