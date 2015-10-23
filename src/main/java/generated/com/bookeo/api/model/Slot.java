package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.CourseSchedule;
import generated.com.bookeo.api.model.Resource;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class Slot   {
  
  private String eventId = null;
  private Date startTime = null;
  private Date endTime = null;
  private Integer numSeatsAvailable = null;
  private CourseSchedule courseSchedule = null;
  private List<Resource> resources = new ArrayList<Resource>();

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("numSeatsAvailable")
  public Integer getNumSeatsAvailable() {
    return numSeatsAvailable;
  }
  public void setNumSeatsAvailable(Integer numSeatsAvailable) {
    this.numSeatsAvailable = numSeatsAvailable;
  }

  
  /**
   * If the product is of type fixedCourse, this includes the full schedule of the course.\n In this case startTime and endTime are the start and end times of the first event in the schedule. If late enrollment is enabled, startTime and endTime will refer to the first event in the course that is booked.\n If the product is not of type fixedCourse, this field is omitted. [read-only]
   **/
  @ApiModelProperty(value = "If the product is of type fixedCourse, this includes the full schedule of the course.\n In this case startTime and endTime are the start and end times of the first event in the schedule. If late enrollment is enabled, startTime and endTime will refer to the first event in the course that is booked.\n If the product is not of type fixedCourse, this field is omitted. [read-only]")
  @JsonProperty("courseSchedule")
  public CourseSchedule getCourseSchedule() {
    return courseSchedule;
  }
  public void setCourseSchedule(CourseSchedule courseSchedule) {
    this.courseSchedule = courseSchedule;
  }

  
  /**
   * Resources involved in this slot. This field is only included for products of type fixed or fixedCourse.\n Only resources whose type is \"public\" are listed here. [read-only]
   **/
  @ApiModelProperty(value = "Resources involved in this slot. This field is only included for products of type fixed or fixedCourse.\n Only resources whose type is \"public\" are listed here. [read-only]")
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
    sb.append("class Slot {\n");
    
    sb.append("  eventId: ").append(eventId).append("\n");
    sb.append("  startTime: ").append(startTime).append("\n");
    sb.append("  endTime: ").append(endTime).append("\n");
    sb.append("  numSeatsAvailable: ").append(numSeatsAvailable).append("\n");
    sb.append("  courseSchedule: ").append(courseSchedule).append("\n");
    sb.append("  resources: ").append(resources).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
