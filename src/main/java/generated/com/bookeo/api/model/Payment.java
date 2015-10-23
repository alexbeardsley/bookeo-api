package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.Money;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Payment   {
  
  private String id = null;
  private Date creationTime = null;
  private Date receivedTime = null;
  private String reason = null;
  private String description = null;
  private String comment = null;
  private Money amount = null;
  public enum PaymentMethodEnum {
     creditCard,  paypal,  bankTransfer,  cash,  checque,  debitCard,  existingCredit,  accountCredit,  moneyVoucher,  other, 
  };
  private PaymentMethodEnum paymentMethod = null;
  private String paymentMethodOther = null;
  private String agent = null;
  private String customerId = null;

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * When this record was created [read-only]
   **/
  @ApiModelProperty(required = true, value = "When this record was created [read-only]")
  @JsonProperty("creationTime")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * When this payment was received
   **/
  @ApiModelProperty(required = true, value = "When this payment was received")
  @JsonProperty("receivedTime")
  public Date getReceivedTime() {
    return receivedTime;
  }
  public void setReceivedTime(Date receivedTime) {
    this.receivedTime = receivedTime;
  }

  
  /**
   * Reason for the payment. Shown to customer where appropriate.\n Ex. \"Deposit\", \"Balance payment\", \"Additional fee\", etc
   **/
  @ApiModelProperty(required = true, value = "Reason for the payment. Shown to customer where appropriate.\n Ex. \"Deposit\", \"Balance payment\", \"Additional fee\", etc")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * Indicates what the payment was for (ex. \"Booking 1234\", \"Prepaid package ABC\", \"Gift voucher XYZ\") [read-only]
   **/
  @ApiModelProperty(value = "Indicates what the payment was for (ex. \"Booking 1234\", \"Prepaid package ABC\", \"Gift voucher XYZ\") [read-only]")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * An optional comment tracked with the payment. Not shown to customers.
   **/
  @ApiModelProperty(value = "An optional comment tracked with the payment. Not shown to customers.")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  
  /**
   * The payment amount
   **/
  @ApiModelProperty(required = true, value = "The payment amount")
  @JsonProperty("amount")
  public Money getAmount() {
    return amount;
  }
  public void setAmount(Money amount) {
    this.amount = amount;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("paymentMethod")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }
  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  /**
   * If paymentMethod is 'other', this field is required, and it specifies what other method was used
   **/
  @ApiModelProperty(value = "If paymentMethod is 'other', this field is required, and it specifies what other method was used")
  @JsonProperty("paymentMethodOther")
  public String getPaymentMethodOther() {
    return paymentMethodOther;
  }
  public void setPaymentMethodOther(String paymentMethodOther) {
    this.paymentMethodOther = paymentMethodOther;
  }

  
  /**
   * Who registered this payment.\n If this field is not present, it means that the customer paid online on Bookeo's booking page. [read-only]
   **/
  @ApiModelProperty(value = "Who registered this payment.\n If this field is not present, it means that the customer paid online on Bookeo's booking page. [read-only]")
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

  
  /**
   * The id of customer associated with this payment [read-only]
   **/
  @ApiModelProperty(value = "The id of customer associated with this payment [read-only]")
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
    sb.append("class Payment {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("  receivedTime: ").append(receivedTime).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  paymentMethod: ").append(paymentMethod).append("\n");
    sb.append("  paymentMethodOther: ").append(paymentMethodOther).append("\n");
    sb.append("  agent: ").append(agent).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
