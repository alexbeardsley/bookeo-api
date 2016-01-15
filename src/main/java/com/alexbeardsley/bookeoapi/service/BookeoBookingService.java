package com.alexbeardsley.bookeoapi.service;

import com.alexbeardsley.bookeoapi.service.exception.GenericApiException;
import com.bookeo.api.model.BookingsList;
import com.bookeo.api.request.ApiException;
import com.bookeo.api.service.BookingsApi;

import java.util.Date;
import java.util.Map;

public class BookeoBookingService implements BookingService {
    protected BookingsApi bookingApi;

    public BookeoBookingService(BookingsApi bookeoBookingApi) {
        this.bookingApi = bookeoBookingApi;
    }

    @Override
    public BookingsList getBookingsBetweenDates(Date startDate, Date endDate) {
        try {
            return bookingApi.bookingsGet(startDate, endDate, null, null, null, null, null, null, null, null, null);
        } catch (ApiException e) {
            throw new GenericApiException(e);
        }
    }

    @Override
    public BookingsList getBookingsBetweenDates(Date startDate, Date endDate, int itemsPerPage) {

        try {
            return bookingApi.bookingsGet(startDate, endDate, null, null, null, null, null, null, itemsPerPage, null, null);
        } catch (ApiException e) {
            throw new GenericApiException(e);
        }
    }

    @Override
    public BookingsList getBookingsBetweenDatesForProduct(String productId, Date startDate, Date endDate) {
        return null;
    }

    @Override
    public BookingsList getBookingsBetweenDatesForProduct(String productId, Date startDate, Date endDate, int itemsPerPage) {
        return null;
    }

    @Override
    public BookingsList nextPage(Pagination pagination) {
        return getPreviousBookingResultsForPage(pagination, pagination.getPageNumber() + 1);
    }

    @Override
    public BookingsList previousPage(Pagination pagination) {
        return getPreviousBookingResultsForPage(pagination, pagination.getPageNumber() - 1);
    }

    @Override
    public BookingsList atPage(Pagination pagination, int pageNumber) {
        return getPreviousBookingResultsForPage(pagination, pageNumber);
    }

    private BookingsList getPreviousBookingResultsForPage(Pagination pagination, int pageNumber) {
        Pagination pageRequest = new Pagination(pagination.getItemsPerPage(), pageNumber, pagination.getPageNavigationToken());
        try {
            return bookingApi.bookingsGet(null, null, null, null, null, null, null, null, null, pageRequest.getPageNavigationToken(), pageRequest.getPageNumber());
        } catch (ApiException e) {
            throw new GenericApiException(e);
        }
    }
}
