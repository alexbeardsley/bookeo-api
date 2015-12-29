package com.alexbeardsley.bookeoapi.service;

import com.bookeo.api.model.BookingsList;
import com.bookeo.api.request.ApiException;
import com.bookeo.api.service.BookingsApi;

import java.util.Date;

public class BookeoBookingService implements BookingService {
    protected BookingsApi bookingApi;

    public BookeoBookingService(BookingsApi bookeoBookingApi) {
        this.bookingApi = bookeoBookingApi;
    }

    @Override
    public BookingsList getBookingsBetweenDates(Date startDate, Date endDate) throws ApiException {
        return bookingApi.bookingsGet(startDate, endDate, null, null, null, null, null, null, null, null, null);
    }

    @Override
    public BookingsList nextPage(Pagination pagination) throws ApiException {
        return getPreviousBookingResultsForPage(pagination, pagination.getPageNumber() + 1);
    }

    @Override
    public BookingsList previousPage(Pagination pagination) throws ApiException {
        return getPreviousBookingResultsForPage(pagination, pagination.getPageNumber() - 1);
    }

    @Override
    public BookingsList atPage(Pagination pagination, int pageNumber) throws ApiException {
        return getPreviousBookingResultsForPage(pagination, pageNumber);
    }

    private BookingsList getPreviousBookingResultsForPage(Pagination pagination, int pageNumber) throws ApiException {
        Pagination pageRequest = new Pagination(pagination.getItemsPerPage(), pageNumber, pagination.getPageNavigationToken());
        return bookingApi.bookingsGet(null, null, null, null, null, null, null, null, null, pageRequest.getPageNavigationToken(), pageRequest.getPageNumber());
    }
}
