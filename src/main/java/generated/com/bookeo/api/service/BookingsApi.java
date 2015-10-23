package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.BookingsList;
import java.util.Date;
import generated.com.bookeo.api.model.Booking;
import generated.com.bookeo.api.model.Customer;
import generated.com.bookeo.api.model.PaymentsList;
import generated.com.bookeo.api.model.Payment;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class BookingsApi {
  private ApiClient apiClient;

  public BookingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Retrieve bookings
   * Retrieve existing bookings\n The result is limited by the permissions of the apiKey.\n &lt;p/&gt;\n It is possible to filter by time booked and/or time of the last change.\n To filter by time booked, the parameters startTime and endTime are required.\n To filter by last time changed, the parameters lastUpdatedStartTime and lastUpdatedEndTime are required.\n It is possible to filter by both at the same time. At least one of the two filters must be used.\n &lt;p/&gt;\n It is further possible to filter by product id.
   * @param startTime if specified, only include bookings that start on or after this time. If specified, endTime must be specified as well.
   * @param endTime if specified, only include bookings that start on or before this time. If specified, startTime  must be specified as well. The maximum allowed interval is 31 days.
   * @param lastUpdatedStartTime if specified, only include bookings that were last changed (or created) on or after this time. If specified, lastUpdatedEndTime must be specified as well.
   * @param lastUpdatedEndTime if specified, only include bookings that were last changed (or created) on or before this time. If specified, lastUpdatedStartTime  must be specified as well.  The maximum allowed interval is 31 days.
   * @param productId if not specified, include bookings for all products. If specified, include only bookings for this product
   * @param includeCanceled if true, canceled bookings are included. If false, only bookings that are not canceled are included
   * @param expandCustomer if true, the full details of the customer are included (provided the application has read permission over the customer)
   * @param expandParticipants if true, full details of the participants are included (provided the application has read permission over the participant)
   * @param itemsPerPage maximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return BookingsList
   */
  public BookingsList bookingsGet (Date startTime, Date endTime, Date lastUpdatedStartTime, Date lastUpdatedEndTime, String productId, Boolean includeCanceled, Boolean expandCustomer, Boolean expandParticipants, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/bookings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedStartTime", lastUpdatedStartTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedEndTime", lastUpdatedEndTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "includeCanceled", includeCanceled));
    
    queryParams.addAll(apiClient.parameterToPairs("", "expandCustomer", expandCustomer));
    
    queryParams.addAll(apiClient.parameterToPairs("", "expandParticipants", expandParticipants));
    
    queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    TypeRef returnType = new TypeRef<BookingsList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new booking
   * When creating a booking for a product of type \&quot;fixed\&quot; or \&quot;fixedCourse\&quot;, the eventId is required. eventIds are obtained by calling /availability/slots or /availability/matchingSlots .\n When creating a booking for a product of type \&quot;flexibleTime\&quot;, you can either specify the eventId or the startTime (in which case you can optionally specify the endTime. If no endTime is specified, Bookeo will automatically calculate the duration based on the options chosen)
   * @param booking 
   * @param previousHoldId if specified, deletes the hold with the given id
   * @param notifyUsers 
   * @param notifyCustomer 
   * @param sendCustomerReminders 
   * @param sendCustomerThankyou 
   * @return void
   */
  public void bookingsPost (Booking booking, String previousHoldId, Boolean notifyUsers, Boolean notifyCustomer, Boolean sendCustomerReminders, Boolean sendCustomerThankyou) throws ApiException {
    Object postBody = booking;
    
    // verify the required parameter 'booking' is set
    if (booking == null) {
       throw new ApiException(400, "Missing the required parameter 'booking' when calling bookingsPost");
    }
    

    // create path and map variables
    String path = "/bookings".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "previousHoldId", previousHoldId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyCustomer", notifyCustomer));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sendCustomerReminders", sendCustomerReminders));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sendCustomerThankyou", sendCustomerThankyou));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Retrieve a booking
   * Retrieve a booking by its booking number
   * @param bookingNumber 
   * @param expandCustomer if true, the full details of the customer are included (provided the application has read permission over the customer)
   * @param expandParticipants if true, full details of the participants are included (provided the application has read permission over the participant)
   * @return Booking
   */
  public Booking bookingsBookingNumberGet (String bookingNumber, Boolean expandCustomer, Boolean expandParticipants) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberGet");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "expandCustomer", expandCustomer));
    
    queryParams.addAll(apiClient.parameterToPairs("", "expandParticipants", expandParticipants));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    TypeRef returnType = new TypeRef<Booking>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update an existing booking
   * 
   * @param booking 
   * @param bookingNumber 
   * @param notifyUsers 
   * @param notifyCustomer 
   * @return void
   */
  public void bookingsBookingNumberPut (Booking booking, String bookingNumber, Boolean notifyUsers, Boolean notifyCustomer) throws ApiException {
    Object postBody = booking;
    
    // verify the required parameter 'booking' is set
    if (booking == null) {
       throw new ApiException(400, "Missing the required parameter 'booking' when calling bookingsBookingNumberPut");
    }
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberPut");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyCustomer", notifyCustomer));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Cancel a booking
   * Cancel a booking. Cancelled bookings remain in the system, but no longer show up in the calendar or take up seats.
   * @param bookingNumber 
   * @param notifyUsers if true, notification emails and SMS are sent to authorized users
   * @param notifyCustomer if true, a notification email is sent to the customer
   * @param applyCancellationPolicy if true, the default cancellation policy is applied. This may cause a charge on the credit card on file, if a cancellation fee is due
   * @param trackInCustomerHistory if true, the cancellation will be tracked in the customer&#39;s stats
   * @param cancelRemainingSeries if true, and this booking is part of a recurring series, all following bookings will be cancelled as well
   * @param reason an optional reason that explains why the booking was cancelled
   * @return void
   */
  public void bookingsBookingNumberDelete (String bookingNumber, Boolean notifyUsers, Boolean notifyCustomer, Boolean applyCancellationPolicy, Boolean trackInCustomerHistory, Boolean cancelRemainingSeries, String reason) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberDelete");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyUsers", notifyUsers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "notifyCustomer", notifyCustomer));
    
    queryParams.addAll(apiClient.parameterToPairs("", "applyCancellationPolicy", applyCancellationPolicy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "trackInCustomerHistory", trackInCustomerHistory));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cancelRemainingSeries", cancelRemainingSeries));
    
    queryParams.addAll(apiClient.parameterToPairs("", "reason", reason));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Retrieve the customer associated with a booking
   * Retrieve the customer associated with a booking.
   * @param bookingNumber 
   * @return Customer
   */
  public Customer bookingsBookingNumberCustomerGet (String bookingNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberCustomerGet");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}/customer".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    TypeRef returnType = new TypeRef<Customer>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get the payments received for a booking
   * Get a list of all payments received for a booking. Only payments for which the apiKey has at least read permission will be included
   * @param bookingNumber 
   * @param itemsPerPage .\nmaximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return PaymentsList
   */
  public PaymentsList bookingsBookingNumberPaymentsGet (String bookingNumber, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberPaymentsGet");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}/payments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNavigationToken", pageNavigationToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    TypeRef returnType = new TypeRef<PaymentsList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Add a payment to a booking
   * Create a payment record associated with a booking
   * @param apiPayment 
   * @param bookingNumber 
   * @return void
   */
  public void bookingsBookingNumberPaymentsPost (Payment apiPayment, String bookingNumber) throws ApiException {
    Object postBody = apiPayment;
    
    // verify the required parameter 'apiPayment' is set
    if (apiPayment == null) {
       throw new ApiException(400, "Missing the required parameter 'apiPayment' when calling bookingsBookingNumberPaymentsPost");
    }
    
    // verify the required parameter 'bookingNumber' is set
    if (bookingNumber == null) {
       throw new ApiException(400, "Missing the required parameter 'bookingNumber' when calling bookingsBookingNumberPaymentsPost");
    }
    

    // create path and map variables
    String path = "/bookings/{bookingNumber}/payments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookingNumber" + "\\}", apiClient.escapeString(bookingNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
