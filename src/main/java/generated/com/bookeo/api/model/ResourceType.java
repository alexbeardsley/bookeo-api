package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.Resource;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Types of resource used in private bookings or events.\n Consultants, teachers, guides, vehicles, etc.
 **/
@ApiModel(description = "Types of resource used in private bookings or events.\n Consultants, teachers, guides, vehicles, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class ResourceType   {
  
  private String name = null;
  private String id = null;
  private Boolean isPublic = null;
  private List<Resource> resources = new ArrayList<Resource>();

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
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
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Whether this type of resources should be shown to customers, and can be used as filter to search for availability [read-only]
   **/
  @ApiModelProperty(value = "Whether this type of resources should be shown to customers, and can be used as filter to search for availability [read-only]")
  @JsonProperty("isPublic")
  public Boolean getIsPublic() {
    return isPublic;
  }
  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("resources")
  public List<Resource> getResources() {
    return resources;
  }
  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceType {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isPublic: ").append(isPublic).append("\n");
    sb.append("  resources: ").append(resources).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
