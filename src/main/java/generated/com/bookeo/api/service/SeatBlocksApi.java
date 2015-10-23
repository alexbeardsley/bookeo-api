package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.SeatBlocksList;
import java.util.Date;
import generated.com.bookeo.api.model.ResourceBlock;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class SeatBlocksApi {
  private ApiClient apiClient;

  public SeatBlocksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SeatBlocksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Retrieve seat blocks
   * Retrieve existing seat blocks\n The result is limited by the permissions of the apiKey.\n &lt;p/&gt;\n It is possible to filter by time blocked and/or time of the last change.\n To filter by time blocked, the parameters startTime and endTime are required.\n To filter by last time changed, the parameters lastUpdatedStartTime and lastUpdatedEndTime are required.\n It is possible to filter by both at the same time. At least one of the two filters must be used.\n &lt;p/&gt;\n It is further possible to filter by product id.
   * @param startTime if specified, only include blocks that start on or after this time. If specified, endTime must be specified as well.
   * @param endTime if specified, only include blocks that start on or before this time. If specified, startTime  must be specified as well. The maximum allowed interval is 31 days.
   * @param lastUpdatedStartTime if specified, only include blocks that were last changed (or created) on or after this time. If specified, lastUpdatedEndTime must be specified as well.
   * @param lastUpdatedEndTime if specified, only include blocks that were last changed (or created) on or before this time. If specified, lastUpdatedStartTime  must be specified as well.  The maximum allowed interval is 31 days.
   * @param productId if specified, only include blocks for this product. If not specified, include blocks for any product
   * @param itemsPerPage maximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return SeatBlocksList
   */
  public SeatBlocksList seatblocksGet (Date startTime, Date endTime, Date lastUpdatedStartTime, Date lastUpdatedEndTime, String productId, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/seatblocks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedStartTime", lastUpdatedStartTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedEndTime", lastUpdatedEndTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    
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
    
    TypeRef returnType = new TypeRef<SeatBlocksList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new seat block
   * \&quot;blocks\&quot; a given number of seats, so that they&#39;re not available for booking.
   * @param block 
   * @return void
   */
  public void seatblocksPost (ResourceBlock block) throws ApiException {
    Object postBody = block;
    
    // verify the required parameter 'block' is set
    if (block == null) {
       throw new ApiException(400, "Missing the required parameter 'block' when calling seatblocksPost");
    }
    

    // create path and map variables
    String path = "/seatblocks".replaceAll("\\{format\\}","json");

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
   * Retrieve a block
   * Retrieve a block by its id
   * @param id 
   * @return ResourceBlock
   */
  public ResourceBlock seatblocksIdGet (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling seatblocksIdGet");
    }
    

    // create path and map variables
    String path = "/seatblocks/{id}".replaceAll("\\{format\\}","json")
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
    
    TypeRef returnType = new TypeRef<ResourceBlock>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update an existing block
   * Updates an existing seat block
   * @param block 
   * @param id 
   * @return void
   */
  public void seatblocksIdPut (ResourceBlock block, String id) throws ApiException {
    Object postBody = block;
    
    // verify the required parameter 'block' is set
    if (block == null) {
       throw new ApiException(400, "Missing the required parameter 'block' when calling seatblocksIdPut");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling seatblocksIdPut");
    }
    

    // create path and map variables
    String path = "/seatblocks/{id}".replaceAll("\\{format\\}","json")
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
   * Delete a block
   * 
   * @param id 
   * @return void
   */
  public void seatblocksIdDelete (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling seatblocksIdDelete");
    }
    

    // create path and map variables
    String path = "/seatblocks/{id}".replaceAll("\\{format\\}","json")
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
