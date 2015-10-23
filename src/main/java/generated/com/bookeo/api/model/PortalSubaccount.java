package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.
 **/
@ApiModel(description = "Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class PortalSubaccount   {
  
  private String id = null;
  private String name = null;

  
  /**
   * The unique id for this subaccount [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique id for this subaccount [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The unique account name [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique account name [read-only]")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortalSubaccount {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
