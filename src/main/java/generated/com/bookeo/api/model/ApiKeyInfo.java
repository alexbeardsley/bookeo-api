package generated.com.bookeo.api.model;

import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Provides detailed information about the API Key being used.
 **/
@ApiModel(description = "Provides detailed information about the API Key being used.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class ApiKeyInfo   {
  
  private String accountId = null;
  private List<String> permissions = new ArrayList<String>();
  private Date creationTime = null;

  
  /**
   * The unique identifier of the business (Bookeo account) that has installed this key.\n If the application is uninstalled, and then installed again for the same business, the api key would change, but the businessId would not. [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the business (Bookeo account) that has installed this key.\n If the application is uninstalled, and then installed again for the same business, the api key would change, but the businessId would not. [read-only]")
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyInfo {\n");
    
    sb.append("  accountId: ").append(accountId).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
