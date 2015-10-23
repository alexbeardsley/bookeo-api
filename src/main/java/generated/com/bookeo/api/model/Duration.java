package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Duration   {
  
  private Integer days = null;
  private Integer hours = null;
  private Integer minutes = null;

  
  /**
   * If this is greater than 0, it means that the product's duration is meant to be \"full day\", i.e. until the end of the last day. In this case, hours and minutes will always be 0. [read-only]
   **/
  @ApiModelProperty(required = true, value = "If this is greater than 0, it means that the product's duration is meant to be \"full day\", i.e. until the end of the last day. In this case, hours and minutes will always be 0. [read-only]")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("hours")
  public Integer getHours() {
    return hours;
  }
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("minutes")
  public Integer getMinutes() {
    return minutes;
  }
  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("  days: ").append(days).append("\n");
    sb.append("  hours: ").append(hours).append("\n");
    sb.append("  minutes: ").append(minutes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
