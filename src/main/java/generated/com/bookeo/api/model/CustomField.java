package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class CustomField   {
  
  private String name = null;
  private String value = null;

  
  /**
   * The name of the field
   **/
  @ApiModelProperty(required = true, value = "The name of the field")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The value of the field. For checkbox-type options, possible values are \"true\" and \"false\"
   **/
  @ApiModelProperty(required = true, value = "The value of the field. For checkbox-type options, possible values are \"true\" and \"false\"")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
