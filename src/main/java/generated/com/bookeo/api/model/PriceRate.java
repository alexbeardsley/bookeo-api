package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.Money;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class PriceRate   {
  
  private String peopleCategoryId = null;
  private Money price = null;

  
  /**
   * If no categoryName is present, this means that the price is PER BOOKING, regardless of the number of participants.\n To obtain a list of people category names for an account, call /settings/peoplecategories [read-only]
   **/
  @ApiModelProperty(value = "If no categoryName is present, this means that the price is PER BOOKING, regardless of the number of participants.\n To obtain a list of people category names for an account, call /settings/peoplecategories [read-only]")
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
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("price")
  public Money getPrice() {
    return price;
  }
  public void setPrice(Money price) {
    this.price = price;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRate {\n");
    
    sb.append("  peopleCategoryId: ").append(peopleCategoryId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
