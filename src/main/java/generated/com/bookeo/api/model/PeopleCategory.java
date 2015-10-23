package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class PeopleCategory   {
  
  private String name = null;
  private String id = null;
  private Integer numSeats = null;

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
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
   * How many seats a unit of this category actually takes. Ex a category \"Family\" may take up 4 seats. [read-only]
   **/
  @ApiModelProperty(required = true, value = "How many seats a unit of this category actually takes. Ex a category \"Family\" may take up 4 seats. [read-only]")
  @JsonProperty("numSeats")
  public Integer getNumSeats() {
    return numSeats;
  }
  public void setNumSeats(Integer numSeats) {
    this.numSeats = numSeats;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleCategory {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numSeats: ").append(numSeats).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
