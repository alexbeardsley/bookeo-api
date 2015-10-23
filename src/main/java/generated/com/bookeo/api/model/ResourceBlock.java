package generated.com.bookeo.api.model;

import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a block over a number of seats
 **/
@ApiModel(description = "Represents a block over a number of seats")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class ResourceBlock   {
  
  private String id = null;
  private String eventId = null;
  private String productId = null;
  private String reason = null;
  private Integer numSeats = null;
  private Date creationTime = null;
  private String creationAgent = null;
  private Date lastChangeTime = null;
  private String lastChangeAgent = null;

  
  /**
   * The unique id [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique id [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The id of the event
   **/
  @ApiModelProperty(required = true, value = "The id of the event")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  
  /**
   * The id of the product this seat block is for
   **/
  @ApiModelProperty(required = true, value = "The id of the product this seat block is for")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * The reason of this block
   **/
  @ApiModelProperty(value = "The reason of this block")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * The number of seats reserved\n The special value -1 indicates \"all available seats left\".
   **/
  @ApiModelProperty(required = true, value = "The number of seats reserved\n The special value -1 indicates \"all available seats left\".")
  @JsonProperty("numSeats")
  public Integer getNumSeats() {
    return numSeats;
  }
  public void setNumSeats(Integer numSeats) {
    this.numSeats = numSeats;
  }

  
  /**
   * The time when the block was created [read-only]
   **/
  @ApiModelProperty(required = true, value = "The time when the block was created [read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The person that created the block [read-only]
   **/
  @ApiModelProperty(required = true, value = "The person that created the block [read-only]")
  @JsonProperty("creationAgent")
  public String getCreationAgent() {
    return creationAgent;
  }
  public void setCreationAgent(String creationAgent) {
    this.creationAgent = creationAgent;
  }

  
  /**
   * The time when the block was last updated. If the block was never changed after creation, this field is not present. [read-only]
   **/
  @ApiModelProperty(value = "The time when the block was last updated. If the block was never changed after creation, this field is not present. [read-only]")
  @JsonProperty("lastChangeTime")
  public Date getLastChangeTime() {
    return lastChangeTime;
  }
  public void setLastChangeTime(Date lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  
  /**
   * The person who last updated this block. If the block was never changed after creation, this field is not present. [read-only]
   **/
  @ApiModelProperty(value = "The person who last updated this block. If the block was never changed after creation, this field is not present. [read-only]")
  @JsonProperty("lastChangeAgent")
  public String getLastChangeAgent() {
    return lastChangeAgent;
  }
  public void setLastChangeAgent(String lastChangeAgent) {
    this.lastChangeAgent = lastChangeAgent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceBlock {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  eventId: ").append(eventId).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  numSeats: ").append(numSeats).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("  creationAgent: ").append(creationAgent).append("\n");
    sb.append("  lastChangeTime: ").append(lastChangeTime).append("\n");
    sb.append("  lastChangeAgent: ").append(lastChangeAgent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
