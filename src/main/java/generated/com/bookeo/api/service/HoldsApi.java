package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.Booking;
import generated.com.bookeo.api.model.Hold;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class HoldsApi {
  private ApiClient apiClient;

  public HoldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HoldsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a temporary hold to finalize the booking
   * Performs a final check of the booking, and reserves required resources/seats to allow finalization of the booking process (ex. process payment).\n The returned object also contains the updated price calculations.\n Normally your application should have no more than one hold in place during a customer booking process.\n Make sure to not leave many holds around. In any case, holds are deleted automatically after a fixed time from creation.\n Note that when creating a hold, the customer field of the booking can be missing, in which case Bookeo will assume a default customer coming from the same country as the account.
   * @param booking 
   * @param holdDurationSeconds the required seats/resources will be reserved for the specified time, ensuring that they cannot be taken by other bookings during this time. The hold cannot be for more than 10 minutes.
   * @param previousHoldId if a previous hold was created during the same session with the customer, it will be automatically removed and replaced by the new one.
   * @return void
   */
  public void holdsPost (Booking booking, Integer holdDurationSeconds, String previousHoldId) throws ApiException {
    Object postBody = booking;
    
    // verify the required parameter 'booking' is set
    if (booking == null) {
       throw new ApiException(400, "Missing the required parameter 'booking' when calling holdsPost");
    }
    

    // create path and map variables
    String path = "/holds".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "holdDurationSeconds", holdDurationSeconds));
    
    queryParams.addAll(apiClient.parameterToPairs("", "previousHoldId", previousHoldId));
    

    

    

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
   * Retrieve a hold previously generated
   * 
   * @param id 
   * @return Hold
   */
  public Hold holdsIdGet (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling holdsIdGet");
    }
    

    // create path and map variables
    String path = "/holds/{id}".replaceAll("\\{format\\}","json")
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
    
    TypeRef returnType = new TypeRef<Hold>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a temporary hold
   * Delete a temporary hold previously created.\n Note that you can also delete a hold when creating a new hold (ex. when the customer goes back in the booking process and selects a different time), or when creating a booking (i.e. when the customer checks out), without having to make a separate call to this endpoint.
   * @param id 
   * @return void
   */
  public void holdsIdDelete (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling holdsIdDelete");
    }
    

    // create path and map variables
    String path = "/holds/{id}".replaceAll("\\{format\\}","json")
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
  
}
