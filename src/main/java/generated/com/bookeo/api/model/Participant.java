package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.LinkedPerson;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a participant in a booking
 **/
@ApiModel(description = "Represents a participant in a booking")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Participant   {
  
  private String personId = null;
  private String peopleCategoryId = null;
  private Integer categoryIndex = null;
  private LinkedPerson personDetails = null;

  
  /**
   * This field can be:\n - PSELF if this participant is the customer that made the booking.\n - PNEW if this is a new person. This value is never set by Bookeo, but can be set by the application to create new participants.\n - PUNKNOWN if no information about the participant is recorded.\n - id of an existing LinkedPerson
   **/
  @ApiModelProperty(required = true, value = "This field can be:\n - PSELF if this participant is the customer that made the booking.\n - PNEW if this is a new person. This value is never set by Bookeo, but can be set by the application to create new participants.\n - PUNKNOWN if no information about the participant is recorded.\n - id of an existing LinkedPerson")
  @JsonProperty("personId")
  public String getPersonId() {
    return personId;
  }
  public void setPersonId(String personId) {
    this.personId = personId;
  }

  
  /**
   * The id of the PeopleCategory to which this participant belongs to. See /settings/peoplecategories
   **/
  @ApiModelProperty(required = true, value = "The id of the PeopleCategory to which this participant belongs to. See /settings/peoplecategories")
  @JsonProperty("peopleCategoryId")
  public String getPeopleCategoryId() {
    return peopleCategoryId;
  }
  public void setPeopleCategoryId(String peopleCategoryId) {
    this.peopleCategoryId = peopleCategoryId;
  }

  
  /**
   * Index in the category, starting from 1. Ex. the first adult will be Adult 1
   **/
  @ApiModelProperty(required = true, value = "Index in the category, starting from 1. Ex. the first adult will be Adult 1")
  @JsonProperty("categoryIndex")
  public Integer getCategoryIndex() {
    return categoryIndex;
  }
  public void setCategoryIndex(Integer categoryIndex) {
    this.categoryIndex = categoryIndex;
  }

  
  /**
   * This field is set by Bookeo if id is not PSELF, PNEW or PUNKNOWN, and includes the details of the participant. This field is not present if the application does not have read permission over this person\n This field can be set by the application if creating a new booking and the id is set to PNEW
   **/
  @ApiModelProperty(value = "This field is set by Bookeo if id is not PSELF, PNEW or PUNKNOWN, and includes the details of the participant. This field is not present if the application does not have read permission over this person\n This field can be set by the application if creating a new booking and the id is set to PNEW")
  @JsonProperty("personDetails")
  public LinkedPerson getPersonDetails() {
    return personDetails;
  }
  public void setPersonDetails(LinkedPerson personDetails) {
    this.personDetails = personDetails;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("  personId: ").append(personId).append("\n");
    sb.append("  peopleCategoryId: ").append(peopleCategoryId).append("\n");
    sb.append("  categoryIndex: ").append(categoryIndex).append("\n");
    sb.append("  personDetails: ").append(personDetails).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
