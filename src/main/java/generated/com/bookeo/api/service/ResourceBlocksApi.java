package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.ResourceBlocksList;
import java.util.Date;
import generated.com.bookeo.api.model.ResourceBlock;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class ResourceBlocksApi {
  private ApiClient apiClient;

  public ResourceBlocksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResourceBlocksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Retrieve resource blocks
   * Retrieve existing resource blocks\n The result is limited by the permissions of the apiKey.\n &lt;p/&gt;\n It is possible to filter by time blocked and/or time of the last change.\n To filter by time blocked, the parameters startTime and endTime are required.\n To filter by last time changed, the parameters lastUpdatedStartTime and lastUpdatedEndTime are required.\n It is possible to filter by both at the same time. At least one of the two filters must be used.\n &lt;p/&gt;\n It is further possible to filter by resource.
   * @param startTime if specified, only include blocks that start on or after this time. If specified, endTime must be specified as well.
   * @param endTime if specified, only include blocks that start on or before this time. If specified, startTime  must be specified as well. The maximum allowed interval is 31 days.
   * @param lastUpdatedStartTime if specified, only include blocks that were last changed (or created) on or after this time. If specified, lastUpdatedEndTime must be specified as well.
   * @param lastUpdatedEndTime if specified, only include blocks that were last changed (or created) on or before this time. If specified, lastUpdatedStartTime  must be specified as well.  The maximum allowed interval is 31 days.
   * @param resourceId if specified, only include blocks that affect this resource
   * @param itemsPerPage maximum: 100
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return ResourceBlocksList
   */
  public ResourceBlocksList resourceblocksGet (Date startTime, Date endTime, Date lastUpdatedStartTime, Date lastUpdatedEndTime, String resourceId, Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/resourceblocks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedStartTime", lastUpdatedStartTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "lastUpdatedEndTime", lastUpdatedEndTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resourceId", resourceId));
    
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
    
    TypeRef returnType = new TypeRef<ResourceBlocksList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new resource block
   * \&quot;blocks\&quot; time for one or more resources, so that they&#39;re not available for booking.\n A resource block must be for at least one resource, but it can block more than one.\n When setting the resources in the block, only the id is required.
   * @param block 
   * @return void
   */
  public void resourceblocksPost (ResourceBlock block) throws ApiException {
    Object postBody = block;
    
    // verify the required parameter 'block' is set
    if (block == null) {
       throw new ApiException(400, "Missing the required parameter 'block' when calling resourceblocksPost");
    }
    

    // create path and map variables
    String path = "/resourceblocks".replaceAll("\\{format\\}","json");

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
  public ResourceBlock resourceblocksIdGet (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdGet");
    }
    

    // create path and map variables
    String path = "/resourceblocks/{id}".replaceAll("\\{format\\}","json")
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
   * A resource block must be for at least one resource, but it can block more than one.\n When setting the resources in the block, only the id is required.
   * @param block 
   * @param id 
   * @return void
   */
  public void resourceblocksIdPut (ResourceBlock block, String id) throws ApiException {
    Object postBody = block;
    
    // verify the required parameter 'block' is set
    if (block == null) {
       throw new ApiException(400, "Missing the required parameter 'block' when calling resourceblocksIdPut");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdPut");
    }
    

    // create path and map variables
    String path = "/resourceblocks/{id}".replaceAll("\\{format\\}","json")
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
  public void resourceblocksIdDelete (String id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling resourceblocksIdDelete");
    }
    

    // create path and map variables
    String path = "/resourceblocks/{id}".replaceAll("\\{format\\}","json")
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
