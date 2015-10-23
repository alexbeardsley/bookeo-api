package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.PaginationInfo;
import java.util.*;
import generated.com.bookeo.api.model.MatchingSlot;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class MatchingSlotList   {
  
  private PaginationInfo info = null;
  private List<MatchingSlot> data = new ArrayList<MatchingSlot>();

  
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
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("data")
  public List<MatchingSlot> getData() {
    return data;
  }
  public void setData(List<MatchingSlot> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingSlotList {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
