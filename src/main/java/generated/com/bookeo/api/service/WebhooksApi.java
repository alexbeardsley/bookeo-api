package generated.com.bookeo.api.service;

import generated.com.bookeo.api.request.ApiException;
import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.request.Configuration;
import generated.com.bookeo.api.request.Pair;
import generated.com.bookeo.api.request.TypeRef;

import generated.com.bookeo.api.model.*;

import java.util.*;

import generated.com.bookeo.api.model.WebhooksList;
import generated.com.bookeo.api.model.Webhook;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List all webhooks
   * Retrieve all the webhooks for this api key
   * @return WebhooksList
   */
  public WebhooksList webhooksGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/webhooks".replaceAll("\\{format\\}","json");

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
    
    TypeRef returnType = new TypeRef<WebhooksList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new webhook
   * Note that if an existing webhook for the same domain and type was already set for this api key, it will be automatically replaced by this new webhook.\n In other words, there can be only one webhook for each combination of domain and type, for an API key.\n So to upgrade an existing webhook URL, simply create a new one with the same domain and type, but a different URL.\n\n For webhook with domain \&quot;bookings\&quot; and type \&quot;deleted\&quot;, the notification will be sent whether the booking is canceled or completely deleted.\n Users can delete bookings by, for example, deleting their associated customer.\n Also note that these \&quot;bookings\&quot; \&quot;deleted\&quot; notifications are sent even for bookings in the past.
   * @param webhook 
   * @return void
   */
  public void webhooksPost (Webhook webhook) throws ApiException {
    Object postBody = webhook;
    
    // verify the required parameter 'webhook' is set
    if (webhook == null) {
       throw new ApiException(400, "Missing the required parameter 'webhook' when calling webhooksPost");
    }
    

    // create path and map variables
    String path = "/webhooks".replaceAll("\\{format\\}","json");

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
   * Retrieve a webhook
   * Retrieve a webhook
   * @param webhookId 
   * @return Webhook
   */
  public Webhook webhooksWebhookIdGet (String webhookId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
       throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksWebhookIdGet");
    }
    

    // create path and map variables
    String path = "/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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
    
    TypeRef returnType = new TypeRef<Webhook>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a webhook
   * Delete a webhook
   * @param webhookId 
   * @return void
   */
  public void webhooksWebhookIdDelete (String webhookId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
       throw new ApiException(400, "Missing the required parameter 'webhookId' when calling webhooksWebhookIdDelete");
    }
    

    // create path and map variables
    String path = "/webhooks/{webhookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

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
