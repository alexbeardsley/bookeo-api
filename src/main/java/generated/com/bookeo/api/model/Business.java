package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.StreetAddress;
import generated.com.bookeo.api.model.PhoneNumber;
import java.util.*;
import generated.com.bookeo.api.model.Image;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.
 **/
@ApiModel(description = "Represents a Bookeo account, i.e. the business taking bookings, selling products, etc.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Business   {
  
  private String id = null;
  private String name = null;
  private String legalIdentifiers = null;
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
  private String websiteURL = null;
  private String emailAddress = null;
  private StreetAddress streetAddress = null;
  private Image logo = null;
  private String description = null;

  
  /**
   * The unique id for this business (Bookeo account) [read-only]
   **/
  @ApiModelProperty(required = true, value = "The unique id for this business (Bookeo account) [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
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
   * Tax ID, Vat ID, other legal identifiers [read-only]
   **/
  @ApiModelProperty(value = "Tax ID, Vat ID, other legal identifiers [read-only]")
  @JsonProperty("legalIdentifiers")
  public String getLegalIdentifiers() {
    return legalIdentifiers;
  }
  public void setLegalIdentifiers(String legalIdentifiers) {
    this.legalIdentifiers = legalIdentifiers;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("websiteURL")
  public String getWebsiteURL() {
    return websiteURL;
  }
  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("streetAddress")
  public StreetAddress getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(StreetAddress streetAddress) {
    this.streetAddress = streetAddress;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(value = " [read-only]")
  @JsonProperty("logo")
  public Image getLogo() {
    return logo;
  }
  public void setLogo(Image logo) {
    this.logo = logo;
  }

  
  /**
   * A description of the business, provided by the business itself. The content is in HTML. [read-only]
   **/
  @ApiModelProperty(value = "A description of the business, provided by the business itself. The content is in HTML. [read-only]")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  legalIdentifiers: ").append(legalIdentifiers).append("\n");
    sb.append("  phoneNumbers: ").append(phoneNumbers).append("\n");
    sb.append("  websiteURL: ").append(websiteURL).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  streetAddress: ").append(streetAddress).append("\n");
    sb.append("  logo: ").append(logo).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
