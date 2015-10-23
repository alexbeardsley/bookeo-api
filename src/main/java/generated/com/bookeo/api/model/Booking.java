package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.BookingOption;
import generated.com.bookeo.api.model.Payment;
import generated.com.bookeo.api.model.Customer;
import generated.com.bookeo.api.model.Price;
import generated.com.bookeo.api.model.Resource;
import java.util.*;
import generated.com.bookeo.api.model.Participants;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a booking
 **/
@ApiModel(description = "Represents a booking")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Booking   {
  
  private String bookingNumber = null;
  private String eventId = null;
  private String firstCourseEnrolledEventId = null;
  private Date startTime = null;
  private Date endTime = null;
  private String customerId = null;
  private Customer customer = null;
  private String title = null;
  private Participants participants = null;
  private List<Resource> resources = new ArrayList<Resource>();
  private Boolean canceled = null;
  private Date cancelationTime = null;
  private String cancelationAgent = null;
  private Boolean accepted = null;
  private String sourceIp = null;
  private Date creationTime = null;
  private String creationAgent = null;
  private Date lastChangeTime = null;
  private String lastChangeAgent = null;
  private String productName = null;
  private String productId = null;
  private Price price = null;
  private List<BookingOption> options = new ArrayList<BookingOption>();
  private String promotionCodeInput = null;
  private String promotionName = null;
  private List<String> couponCodes = new ArrayList<String>();
  private String giftVoucherCodeInput = null;
  private String specificVoucherCode = null;
  private List<Payment> initialPayments = new ArrayList<Payment>();

  
  /**
   * The unique booking number. Always treat as string [read-only]
   **/
  @ApiModelProperty(value = "The unique booking number. Always treat as string [read-only]")
  @JsonProperty("bookingNumber")
  public String getBookingNumber() {
    return bookingNumber;
  }
  public void setBookingNumber(String bookingNumber) {
    this.bookingNumber = bookingNumber;
  }

  
  /**
   * When the booking is for a product of type fixed or fixedCourse, this is the id of the slot (see /availability/slots).\n Note that for fixedCourse, Bookeo always returns the eventId of the first class in a course, even if the customer is enrolled starting from a later class.\n In this case, firstCourseEnrolledEvent will be set.
   **/
  @ApiModelProperty(value = "When the booking is for a product of type fixed or fixedCourse, this is the id of the slot (see /availability/slots).\n Note that for fixedCourse, Bookeo always returns the eventId of the first class in a course, even if the customer is enrolled starting from a later class.\n In this case, firstCourseEnrolledEvent will be set.")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  
  /**
   * If the product is of type fixedCourse, and it is possible to accept late enrolment, this is the id of the event (class) where the actual enrolment starts.
   **/
  @ApiModelProperty(value = "If the product is of type fixedCourse, and it is possible to accept late enrolment, this is the id of the event (class) where the actual enrolment starts.")
  @JsonProperty("firstCourseEnrolledEventId")
  public String getFirstCourseEnrolledEventId() {
    return firstCourseEnrolledEventId;
  }
  public void setFirstCourseEnrolledEventId(String firstCourseEnrolledEventId) {
    this.firstCourseEnrolledEventId = firstCourseEnrolledEventId;
  }

  
  /**
   * The start time of the booking. When creating a booking, either this or eventId must be specified
   **/
  @ApiModelProperty(value = "The start time of the booking. When creating a booking, either this or eventId must be specified")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The end time of the booking.\n When creating a new booking of type flexibleTime, you can specify this field to force an end time. Or you can omit this field, in which case Bookeo will calculate the end time based on product and options chosen.
   **/
  @ApiModelProperty(value = "The end time of the booking.\n When creating a new booking of type flexibleTime, you can specify this field to force an end time. Or you can omit this field, in which case Bookeo will calculate the end time based on product and options chosen.")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The id of the customer this booking is for. When creating a booking, use this to create a booking for an existing customer.
   **/
  @ApiModelProperty(value = "The id of the customer this booking is for. When creating a booking, use this to create a booking for an existing customer.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  /**
   * The customer associated with this booking\n When reading a booking, this field is included only if the parameter expandCustomer is set to true, and the application has the necessary read permission for the customer.\n An application can include this field only when creating a new booking for a new customer. To create a booking for an existing customer, use the customerId field instead
   **/
  @ApiModelProperty(value = "The customer associated with this booking\n When reading a booking, this field is included only if the parameter expandCustomer is set to true, and the application has the necessary read permission for the customer.\n An application can include this field only when creating a new booking for a new customer. To create a booking for an existing customer, use the customerId field instead")
  @JsonProperty("customer")
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  /**
   * The title of this booking, same as the one displayed by Bookeo in the calendar [read-only]
   **/
  @ApiModelProperty(required = true, value = "The title of this booking, same as the one displayed by Bookeo in the calendar [read-only]")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Participants associated to this booking
   **/
  @ApiModelProperty(required = true, value = "Participants associated to this booking")
  @JsonProperty("participants")
  public Participants getParticipants() {
    return participants;
  }
  public void setParticipants(Participants participants) {
    this.participants = participants;
  }

  
  /**
   * Resources involved in a booking, if the booking is for a product of type \"flexibleTime\".\n If the booking is for a different type of product, this field is empty/ignored.\n When creating or updating a booking, only the id of a resource is required. Any name passed is ignored.\n If not specified when creating or updating a booking, Bookeo will automatically assign available resources.
   **/
  @ApiModelProperty(value = "Resources involved in a booking, if the booking is for a product of type \"flexibleTime\".\n If the booking is for a different type of product, this field is empty/ignored.\n When creating or updating a booking, only the id of a resource is required. Any name passed is ignored.\n If not specified when creating or updating a booking, Bookeo will automatically assign available resources.")
  @JsonProperty("resources")
  public List<Resource> getResources() {
    return resources;
  }
  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  
  /**
   * Whether this booking is canceled [read-only]
   **/
  @ApiModelProperty(value = "Whether this booking is canceled [read-only]")
  @JsonProperty("canceled")
  public Boolean getCanceled() {
    return canceled;
  }
  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  
  /**
   * If the booking is cancelled, this is the time when it was cancelled [read-only]
   **/
  @ApiModelProperty(value = "If the booking is cancelled, this is the time when it was cancelled [read-only]")
  @JsonProperty("cancelationTime")
  public Date getCancelationTime() {
    return cancelationTime;
  }
  public void setCancelationTime(Date cancelationTime) {
    this.cancelationTime = cancelationTime;
  }

  
  /**
   * If the booking is cancelled, this is the person who cancelled [read-only]
   **/
  @ApiModelProperty(value = "If the booking is cancelled, this is the person who cancelled [read-only]")
  @JsonProperty("cancelationAgent")
  public String getCancelationAgent() {
    return cancelationAgent;
  }
  public void setCancelationAgent(String cancelationAgent) {
    this.cancelationAgent = cancelationAgent;
  }

  
  /**
   * Whether this booking was accepted. If no accept/deny was applicable to the booking, the booking is considered accepted as created. [read-only]
   **/
  @ApiModelProperty(value = "Whether this booking was accepted. If no accept/deny was applicable to the booking, the booking is considered accepted as created. [read-only]")
  @JsonProperty("accepted")
  public Boolean getAccepted() {
    return accepted;
  }
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  
  /**
   * The IP address from where this booking was created
   **/
  @ApiModelProperty(value = "The IP address from where this booking was created")
  @JsonProperty("sourceIp")
  public String getSourceIp() {
    return sourceIp;
  }
  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }

  
  /**
   * The time when the booking was created [read-only]
   **/
  @ApiModelProperty(required = true, value = "The time when the booking was created [read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * The person that created the booking [read-only]
   **/
  @ApiModelProperty(required = true, value = "The person that created the booking [read-only]")
  @JsonProperty("creationAgent")
  public String getCreationAgent() {
    return creationAgent;
  }
  public void setCreationAgent(String creationAgent) {
    this.creationAgent = creationAgent;
  }

  
  /**
   * The time when the booking was last updated. If the booking was never changed after creation, this field is not present. [read-only]
   **/
  @ApiModelProperty(value = "The time when the booking was last updated. If the booking was never changed after creation, this field is not present. [read-only]")
  @JsonProperty("lastChangeTime")
  public Date getLastChangeTime() {
    return lastChangeTime;
  }
  public void setLastChangeTime(Date lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  
  /**
   * The person who last updated this booking. If the booking was never changed after creation, this field is not present. [read-only]
   **/
  @ApiModelProperty(value = "The person who last updated this booking. If the booking was never changed after creation, this field is not present. [read-only]")
  @JsonProperty("lastChangeAgent")
  public String getLastChangeAgent() {
    return lastChangeAgent;
  }
  public void setLastChangeAgent(String lastChangeAgent) {
    this.lastChangeAgent = lastChangeAgent;
  }

  
  /**
   * The name of the product this booking is for [read-only]
   **/
  @ApiModelProperty(value = "The name of the product this booking is for [read-only]")
  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  
  /**
   * The id of the product this booking is for
   **/
  @ApiModelProperty(required = true, value = "The id of the product this booking is for")
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  /**
   * Details about price, taxes, etc. [read-only]
   **/
  @ApiModelProperty(value = "Details about price, taxes, etc. [read-only]")
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }
  public void setPrice(Price price) {
    this.price = price;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("options")
  public List<BookingOption> getOptions() {
    return options;
  }
  public void setOptions(List<BookingOption> options) {
    this.options = options;
  }

  
  /**
   * Optional promotion code input, can be used when creating or updating a booking\n It could be a single code, or a list of codes separated by comma (ex. multiple coupon/voucher codes)\n In general, applications creating bookings can simply ask the customer to input a promotion code (like they would on Bookeo's web interface) and pass the input in this field.\n Bookeo will then parse and validate any text entered
   **/
  @ApiModelProperty(value = "Optional promotion code input, can be used when creating or updating a booking\n It could be a single code, or a list of codes separated by comma (ex. multiple coupon/voucher codes)\n In general, applications creating bookings can simply ask the customer to input a promotion code (like they would on Bookeo's web interface) and pass the input in this field.\n Bookeo will then parse and validate any text entered")
  @JsonProperty("promotionCodeInput")
  public String getPromotionCodeInput() {
    return promotionCodeInput;
  }
  public void setPromotionCodeInput(String promotionCodeInput) {
    this.promotionCodeInput = promotionCodeInput;
  }

  
  /**
   * The name of the promotion that was applied to this booking. [read-only]
   **/
  @ApiModelProperty(value = "The name of the promotion that was applied to this booking. [read-only]")
  @JsonProperty("promotionName")
  public String getPromotionName() {
    return promotionName;
  }
  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }

  
  /**
   * If a promotion of type \"multiple coupon codes\" was applied to this booking, this is the list of coupon codes used [read-only]
   **/
  @ApiModelProperty(value = "If a promotion of type \"multiple coupon codes\" was applied to this booking, this is the list of coupon codes used [read-only]")
  @JsonProperty("couponCodes")
  public List<String> getCouponCodes() {
    return couponCodes;
  }
  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  
  /**
   * A gift voucher code applicable to this booking. This field is only set by the application, when creating or updating a booking.\n It is possible to specify multiple codes, separated by commas.\n No more than one specific (as opposed to \"generic\", value-based) gift voucher can be used per booking.
   **/
  @ApiModelProperty(value = "A gift voucher code applicable to this booking. This field is only set by the application, when creating or updating a booking.\n It is possible to specify multiple codes, separated by commas.\n No more than one specific (as opposed to \"generic\", value-based) gift voucher can be used per booking.")
  @JsonProperty("giftVoucherCodeInput")
  public String getGiftVoucherCodeInput() {
    return giftVoucherCodeInput;
  }
  public void setGiftVoucherCodeInput(String giftVoucherCodeInput) {
    this.giftVoucherCodeInput = giftVoucherCodeInput;
  }

  
  /**
   * When the booking used a service specific voucher (i.e. as opposed to a \"generic\" voucher, based on a fixed amount), the code of the voucher is reported here. [read-only]
   **/
  @ApiModelProperty(value = "When the booking used a service specific voucher (i.e. as opposed to a \"generic\" voucher, based on a fixed amount), the code of the voucher is reported here. [read-only]")
  @JsonProperty("specificVoucherCode")
  public String getSpecificVoucherCode() {
    return specificVoucherCode;
  }
  public void setSpecificVoucherCode(String specificVoucherCode) {
    this.specificVoucherCode = specificVoucherCode;
  }

  
  /**
   * When creating a new booking, an application can also record one or more payment associated to the booking (ex. if the customer has paid a deposit or the full amount online)\n This field is never set by Bookeo, and is ignored unless this is a new booking being created.
   **/
  @ApiModelProperty(value = "When creating a new booking, an application can also record one or more payment associated to the booking (ex. if the customer has paid a deposit or the full amount online)\n This field is never set by Bookeo, and is ignored unless this is a new booking being created.")
  @JsonProperty("initialPayments")
  public List<Payment> getInitialPayments() {
    return initialPayments;
  }
  public void setInitialPayments(List<Payment> initialPayments) {
    this.initialPayments = initialPayments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    
    sb.append("  bookingNumber: ").append(bookingNumber).append("\n");
    sb.append("  eventId: ").append(eventId).append("\n");
    sb.append("  firstCourseEnrolledEventId: ").append(firstCourseEnrolledEventId).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  endTime: ").append(endTime).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  participants: ").append(participants).append("\n");
    sb.append("  resources: ").append(resources).append("\n");
    sb.append("  canceled: ").append(canceled).append("\n");
    sb.append("  cancelationTime: ").append(cancelationTime).append("\n");
    sb.append("  cancelationAgent: ").append(cancelationAgent).append("\n");
    sb.append("  accepted: ").append(accepted).append("\n");
    sb.append("  sourceIp: ").append(sourceIp).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("  creationAgent: ").append(creationAgent).append("\n");
    sb.append("  lastChangeTime: ").append(lastChangeTime).append("\n");
    sb.append("  lastChangeAgent: ").append(lastChangeAgent).append("\n");
    sb.append("  productName: ").append(productName).append("\n");
    sb.append("  productId: ").append(productId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("  promotionCodeInput: ").append(promotionCodeInput).append("\n");
    sb.append("  promotionName: ").append(promotionName).append("\n");
    sb.append("  couponCodes: ").append(couponCodes).append("\n");
    sb.append("  giftVoucherCodeInput: ").append(giftVoucherCodeInput).append("\n");
    sb.append("  specificVoucherCode: ").append(specificVoucherCode).append("\n");
    sb.append("  initialPayments: ").append(initialPayments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
