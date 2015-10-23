package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.PeopleCategory;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class PeopleCategoryList   {
  
  private List<PeopleCategory> categories = new ArrayList<PeopleCategory>();

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("categories")
  public List<PeopleCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<PeopleCategory> categories) {
    this.categories = categories;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleCategoryList {\n");
    
    sb.append("  categories: ").append(categories).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
