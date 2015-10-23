package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.PaginationInfo;
import generated.com.bookeo.api.model.ResourceBlock;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class SeatBlocksList   {
  
  private PaginationInfo info = null;
  private List<ResourceBlock> data = new ArrayList<ResourceBlock>();

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("info")
  public PaginationInfo getInfo() {
    return info;
  }
  public void setInfo(PaginationInfo info) {
    this.info = info;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("data")
  public List<ResourceBlock> getData() {
    return data;
  }
  public void setData(List<ResourceBlock> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatBlocksList {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
