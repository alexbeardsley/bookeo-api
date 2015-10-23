package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.StreetAddress;
import generated.com.bookeo.api.model.CustomField;
import generated.com.bookeo.api.model.PhoneNumber;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class LinkedPerson   {
  
  private String id = null;
  private String firstName = null;
  private String middleName = null;
  private String lastName = null;
  private String emailAddress = null;
  private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
  private StreetAddress streetAddress = null;
  private Date creationTime = null;
  private Date startTimeOfNextBooking = null;
  private Date startTimeOfPreviousBooking = null;
  private Date dateOfBirth = null;
  private List<CustomField> customFields = new ArrayList<CustomField>();
  private String customerId = null;

  
  /**
   * Globally unique ID that identifies this person [read-only]
   **/
  @ApiModelProperty(required = true, value = "Globally unique ID that identifies this person [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumbers")
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The start time of the next booking. null if there are no bookings starting after 'now'. [read-only]
   **/
  @ApiModelProperty(value = "The start time of the next booking. null if there are no bookings starting after 'now'. [read-only]")
  @JsonProperty("startTimeOfNextBooking")
  public Date getStartTimeOfNextBooking() {
    return startTimeOfNextBooking;
  }
  public void setStartTimeOfNextBooking(Date startTimeOfNextBooking) {
    this.startTimeOfNextBooking = startTimeOfNextBooking;
  }

  
  /**
   * The start time of the last booking that occurred before 'now'. It is updated only after that booking's stop time [read-only]
   **/
  @ApiModelProperty(value = "The start time of the last booking that occurred before 'now'. It is updated only after that booking's stop time [read-only]")
  @JsonProperty("startTimeOfPreviousBooking")
  public Date getStartTimeOfPreviousBooking() {
    return startTimeOfPreviousBooking;
  }
  public void setStartTimeOfPreviousBooking(Date startTimeOfPreviousBooking) {
    this.startTimeOfPreviousBooking = startTimeOfPreviousBooking;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfBirth")
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("customFields")
  public List<CustomField> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * The id of the customer to whom this person is linked. [read-only]
   **/
  @ApiModelProperty(required = true, value = "The id of the customer to whom this person is linked. [read-only]")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedPerson {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  middleName: ").append(middleName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  emailAddress: ").append(emailAddress).append("\n");
    sb.append("  phoneNumbers: ").append(phoneNumbers).append("\n");
    sb.append("  streetAddress: ").append(streetAddress).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("  startTimeOfNextBooking: ").append(startTimeOfNextBooking).append("\n");
    sb.append("  startTimeOfPreviousBooking: ").append(startTimeOfPreviousBooking).append("\n");
    sb.append("  dateOfBirth: ").append(dateOfBirth).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
