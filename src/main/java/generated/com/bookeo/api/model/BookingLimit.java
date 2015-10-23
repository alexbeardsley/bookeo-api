package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class BookingLimit   {
  
  private String peopleCategoryId = null;
  private Integer min = null;
  private Integer max = null;

  
  /**
   * If not present, this limit represents the limit for the total number of people in the booking.\n If present, this limit represents how many people in the given category can be included in a single booking.\n To obtain a list of people categories for an account, call /settings/peoplecategories [read-only]
   **/
  @ApiModelProperty(value = "If not present, this limit represents the limit for the total number of people in the booking.\n If present, this limit represents how many people in the given category can be included in a single booking.\n To obtain a list of people categories for an account, call /settings/peoplecategories [read-only]")
  @JsonProperty("peopleCategoryId")
  public String getPeopleCategoryId() {
    return peopleCategoryId;
  }
  public void setPeopleCategoryId(String peopleCategoryId) {
    this.peopleCategoryId = peopleCategoryId;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("min")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingLimit {\n");
    
    sb.append("  peopleCategoryId: ").append(peopleCategoryId).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
