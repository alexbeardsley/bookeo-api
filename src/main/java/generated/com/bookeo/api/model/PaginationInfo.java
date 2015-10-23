package generated.com.bookeo.api.model;




import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class PaginationInfo   {
  
  private Integer totalItems = null;
  private Integer totalPages = null;
  private Integer currentPage = null;
  private String pageNavigationToken = null;

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }
  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  
  /**
   * If there are more than 1 pages of items available, you can use this token in more calls (combined with pageNumber) to navigate the results. When navigating pages, you do not need to include the search parameters again - just pageNavigationToken and pageNumber.\n If there is only one page, this field is not present in the response. [read-only]
   **/
  @ApiModelProperty(value = "If there are more than 1 pages of items available, you can use this token in more calls (combined with pageNumber) to navigate the results. When navigating pages, you do not need to include the search parameters again - just pageNavigationToken and pageNumber.\n If there is only one page, this field is not present in the response. [read-only]")
  @JsonProperty("pageNavigationToken")
  public String getPageNavigationToken() {
    return pageNavigationToken;
  }
  public void setPageNavigationToken(String pageNavigationToken) {
    this.pageNavigationToken = pageNavigationToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationInfo {\n");
    
    sb.append("  totalItems: ").append(totalItems).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("  currentPage: ").append(currentPage).append("\n");
    sb.append("  pageNavigationToken: ").append(pageNavigationToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
