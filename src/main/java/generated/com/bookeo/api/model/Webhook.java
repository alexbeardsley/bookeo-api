package generated.com.bookeo.api.model;

import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Webhook   {
  
  private String id = null;
  private String url = null;
  public enum DomainEnum {
     bookings,  seatblocks,  resourceblocks,  customers,  payments, 
  };
  private DomainEnum domain = null;
  public enum TypeEnum {
     created,  updated,  deleted, 
  };
  private TypeEnum type = null;
  private Date blockedTime = null;
  private String blockedReason = null;

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The URL that Bookeo will request when an event triggers the webhook.\n The protocol must be https
   **/
  @ApiModelProperty(required = true, value = "The URL that Bookeo will request when an event triggers the webhook.\n The protocol must be https")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * What type of object this webhook applies to
   **/
  @ApiModelProperty(required = true, value = "What type of object this webhook applies to")
  @JsonProperty("domain")
  public DomainEnum getDomain() {
    return domain;
  }
  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  
  /**
   * What type of operation triggers this webhook
   **/
  @ApiModelProperty(required = true, value = "What type of operation triggers this webhook")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * If this field is present, it indicates that the webhook was blocked at this time.\n The blockedReason will indicate the reason for the block. Typically, a webhook gets blocked when too many consecutive notifications are dropped due to repeat conection errors.\n Once a webhook is blocked, no more notifications will be sent to it. Your application will need to fix the cause of the block, and then create a new webhook. [read-only]
   **/
  @ApiModelProperty(value = "If this field is present, it indicates that the webhook was blocked at this time.\n The blockedReason will indicate the reason for the block. Typically, a webhook gets blocked when too many consecutive notifications are dropped due to repeat conection errors.\n Once a webhook is blocked, no more notifications will be sent to it. Your application will need to fix the cause of the block, and then create a new webhook. [read-only]")
  @JsonProperty("blockedTime")
  public Date getBlockedTime() {
    return blockedTime;
  }
  public void setBlockedTime(Date blockedTime) {
    this.blockedTime = blockedTime;
  }

  
  /**
   * The reason why the webhook was blocked. [read-only]
   **/
  @ApiModelProperty(value = "The reason why the webhook was blocked. [read-only]")
  @JsonProperty("blockedReason")
  public String getBlockedReason() {
    return blockedReason;
  }
  public void setBlockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  blockedTime: ").append(blockedTime).append("\n");
    sb.append("  blockedReason: ").append(blockedReason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
