package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.CustomersList;
import java.util.Date;
import generated.com.bookeo.api.model.Customer;
import generated.com.bookeo.api.model.BookingsList;
import generated.com.bookeo.api.model.LinkedPersonList;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class CustomersApi {
  private ApiClient apiClient;

  public CustomersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Retrieve customers
   * Get a list of customers.
   * @param currentMembers if true, include customers that are current members. this is the default
   * @param currentNonMembers if true, include customers that are not current members. this is the default
   * @param createdSince if present, only include customers created since the given time
   * @param searchField a field on which to apply the search filter. Used only if searchText is specified
   * @param searchText the text to search for. If not present, all customers are returned
   * @param itemsPerPage number of items per page.\nmaximum: 100
   * @param pageNavigationToken if present, continues navigation after a previous call. pageNavigationToken is included in the response of the first call, if there are more results than itemsPerPage
   * @param pageNumber 
   * @return CustomersList
   */
  public CustomersList customersGet (Boolean currentMembers, Boolean currentNonMembers, Date createdSince, String searchField, String searchText, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/customers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "currentMembers", currentMembers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "currentNonMembers", currentNonMembers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "createdSince", createdSince));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchField", searchField));
    
    queryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));
    
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
    
    TypeRef returnType = new TypeRef<CustomersList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new customer
   * 
   * @param customer 
   * @return void
   */
  public void customersPost (Customer customer) throws ApiException {
    Object postBody = customer;
    
    // verify the required parameter 'customer' is set
    if (customer == null) {
       throw new ApiException(400, "Missing the required parameter 'customer' when calling customersPost");
    }
    

    // create path and map variables
    String path = "/customers".replaceAll("\\{format\\}","json");

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
  
  /**
   * Delete a person linked to a customer
   * 
   * @param customerid 
   * @param id 
   * @return void
   */
  public void customersCustomeridLinkedpeopleIdDelete (String customerid, String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'customerid' is set
    if (customerid == null) {
       throw new ApiException(400, "Missing the required parameter 'customerid' when calling customersCustomeridLinkedpeopleIdDelete");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersCustomeridLinkedpeopleIdDelete");
    }
    

    // create path and map variables
    String path = "/customers/{customerid}/linkedpeople/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "customerid" + "\\}", apiClient.escapeString(customerid.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Retrieve a customer
   * Retrieve a customer by its id
   * @param id 
   * @return Customer
   */
  public Customer customersIdGet (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdGet");
    }
    

    // create path and map variables
    String path = "/customers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
   * Update an existing customer
   * 
   * @param customer 
   * @param id 
   * @return void
   */
  public void customersIdPut (Customer customer, String id) throws ApiException {
    Object postBody = customer;
    
    // verify the required parameter 'customer' is set
    if (customer == null) {
       throw new ApiException(400, "Missing the required parameter 'customer' when calling customersIdPut");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdPut");
    }
    

    // create path and map variables
    String path = "/customers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Delete a customer
   * Delete a customer.\n Please note it is not possible to delete customers that have bookings in the future, and that are not cancelled.\n If your application needs to delete a customer with future bookings, make sure to cancel all future bookings for that customer first.
   * @param id 
   * @return void
   */
  public void customersIdDelete (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdDelete");
    }
    

    // create path and map variables
    String path = "/customers/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Check a customer&#39;s password
   * The customer&#39;s email address is the \&quot;username\&quot; used by Bookeo to authenticate customers.\n So to authenticate a customer your application would typically use GET /customers to search for customers with a given email address, and then GET /customers/{id}/authenticate to authenticate.\n Remember that there may be duplicate customer records with the same email address, ex. due to duplicate importing or manual record creation.
   * @param id 
   * @param password remember to use URL encoding
   * @return void
   */
  public void customersIdAuthenticateGet (String id, String password) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdAuthenticateGet");
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
       throw new ApiException(400, "Missing the required parameter 'password' when calling customersIdAuthenticateGet");
    }
    

    // create path and map variables
    String path = "/customers/{id}/authenticate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "password", password));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Retrieve a customer&#39;s bookings
   * Get a customer&#39;s bookings.
   * @param id 
   * @param beginDate if specified, only bookings on or after this date will be included
   * @param endDate if specified, only bookings on or before this date will be included
   * @param expandParticipants if true, full details of the participants are included (provided the application has read permission over the participant)
   * @param itemsPerPage .\nmaximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return BookingsList
   */
  public BookingsList customersIdBookingsGet (String id, Date beginDate, Date endDate, Boolean expandParticipants, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdBookingsGet");
    }
    

    // create path and map variables
    String path = "/customers/{id}/bookings".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
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
   * Get the people linked to a customer
   * 
   * @param id 
   * @param itemsPerPage maximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return LinkedPersonList
   */
  public LinkedPersonList customersIdLinkedpeopleGet (String id, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling customersIdLinkedpeopleGet");
    }
    

    // create path and map variables
    String path = "/customers/{id}/linkedpeople".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    
    TypeRef returnType = new TypeRef<LinkedPersonList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
