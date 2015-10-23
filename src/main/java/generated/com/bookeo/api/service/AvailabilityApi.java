package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.MatchingSlotsSearchParameters;
import generated.com.bookeo.api.model.MatchingSlotList;
import java.util.Date;
import generated.com.bookeo.api.model.SlotList;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class AvailabilityApi {
  private ApiClient apiClient;

  public AvailabilityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AvailabilityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Find available slots matching given search parameters
   * Create a search for available slots that match the given search parameters.\n Note that there are two different searches possible, /availability/slots and /availability/matchingslots (this endpoint).\n The former simply shows the number of available seats for each available slot. The latter (this one) takes as input the participant numbers, and shows the slots that are available for those numbers, and an estimate of the price.\n Parameters include product code, number of people and options.\n The response contains a \&quot;Location\&quot; header, which can be invoked to navigate the results of the search.
   * @param search 
   * @param itemsPerPage .\nmaximum: 300
   * @return void
   */
  public void availabilityMatchingslotsPost (MatchingSlotsSearchParameters search, Integer itemsPerPage) throws ApiException {
    Object postBody = search;
    
    // verify the required parameter 'search' is set
    if (search == null) {
       throw new ApiException(400, "Missing the required parameter 'search' when calling availabilityMatchingslotsPost");
    }
    

    // create path and map variables
    String path = "/availability/matchingslots".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "itemsPerPage", itemsPerPage));
    

    

    

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
   * Navigate results of a matching slots search
   * 
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return MatchingSlotList
   */
  public MatchingSlotList availabilityMatchingslotsPageNavigationTokenGet (String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'pageNavigationToken' is set
    if (pageNavigationToken == null) {
       throw new ApiException(400, "Missing the required parameter 'pageNavigationToken' when calling availabilityMatchingslotsPageNavigationTokenGet");
    }
    

    // create path and map variables
    String path = "/availability/matchingslots/{pageNavigationToken}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "pageNavigationToken" + "\\}", apiClient.escapeString(pageNavigationToken.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "pageNumber", pageNumber));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    TypeRef returnType = new TypeRef<MatchingSlotList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get information about the availability of a product
   * Performs a basic search to find available slots and number of seats in each.\n Note that there are two different searches possible, /availability/slots (this endpoint) and /availability/matchingslots .\n The former simply shows the number of available seats for each available slot. The latter takes as input the participant numbers, and shows the slots that are available for those numbers, and an estimate of the price.\n /availability/slots cannot be used for products of type flexibleTime . For those products, use /availability/matchingslots .
   * @param productId the product code (see /availability/products). Required unless pageNavigationToken is used. Note that the product must be of type \&quot;fixed\&quot; or \&quot;fixedCourse\&quot;. For products of type \&quot;flexibleTime\&quot;, use /availability/matchingslots instead.
   * @param startTime the start time to search from. Required unless pageNavigationToken is used.
   * @param endTime the end time to search to. Required unless pageNavigationToken is used. The maximum date range in a single call is 31 days.
   * @param itemsPerPage .\nmaximum: 300
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return SlotList
   */
  public SlotList availabilitySlotsGet (String productId, Date startTime, Date endTime, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/availability/slots".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
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
    
    TypeRef returnType = new TypeRef<SlotList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
