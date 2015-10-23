package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.PortalSubaccountsList;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class SubaccountsApi {
  private ApiClient apiClient;

  public SubaccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubaccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List all subaccounts in the portal
   * Retrieve all the webhooks for this api key
   * @param itemsPerPage maximum: 300
   * @param pageNavigationToken 
   * @param pageNumber 
   * @return PortalSubaccountsList
   */
  public PortalSubaccountsList subaccountsGet (Integer itemsPerPage, String pageNavigationToken, Integer pageNumber) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/subaccounts".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<PortalSubaccountsList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new API Key for this application to access a subaccount
   * Install this application in a subaccount.\n Note that the API key used in this call must be that of the portal manager account. The application installed in the subaccount will be the same as this one, with the same permissions.\n If this application was already installed in the subaccount, its API key will be replaced by the one created in this call.
   * @param subaccountId the id of the subaccount where to install this application
   * @return void
   */
  public void subaccountsSubaccountIdApikeysPost (String subaccountId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'subaccountId' is set
    if (subaccountId == null) {
       throw new ApiException(400, "Missing the required parameter 'subaccountId' when calling subaccountsSubaccountIdApikeysPost");
    }
    

    // create path and map variables
    String path = "/subaccounts/{subaccountId}/apikeys".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "subaccountId" + "\\}", apiClient.escapeString(subaccountId.toString()));

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
   * Delete the API Key for this application from a subaccount
   * Uninstall this application from a subaccount.
   * @param subaccountId 
   * @param apiKey 
   * @return void
   */
  public void subaccountsSubaccountIdApikeysApiKeyDelete (String subaccountId, String apiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'subaccountId' is set
    if (subaccountId == null) {
       throw new ApiException(400, "Missing the required parameter 'subaccountId' when calling subaccountsSubaccountIdApikeysApiKeyDelete");
    }
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
       throw new ApiException(400, "Missing the required parameter 'apiKey' when calling subaccountsSubaccountIdApikeysApiKeyDelete");
    }
    

    // create path and map variables
    String path = "/subaccounts/{subaccountId}/apikeys/{apiKey}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "subaccountId" + "\\}", apiClient.escapeString(subaccountId.toString()))
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()));

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
