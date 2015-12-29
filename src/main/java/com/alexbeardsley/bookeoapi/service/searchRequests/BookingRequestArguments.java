package com.alexbeardsley.bookeoapi.service.searchRequests;

import java.util.Date;
import java.util.Optional;

public class BookingRequestArguments {

    public static class Builder {
        private Optional<Date> startDate;
        private Optional<Date> endDate;
        private Optional<Date> lastUpdatedStartDate;
        private Optional<Date> lastUpdatedEndDate;
        private Optional<String> productId;
        private Optional<Boolean> includeCanceled;
        private Optional<Boolean> expandCustomer;
        private Optional<Boolean> expandParticipants;
        private Optional<Integer> itemsPerPage;
    }
}
