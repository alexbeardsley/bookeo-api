package generated.com.bookeo.api.model;

import generated.com.bookeo.api.model.CourseEvent;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T12:47:56.701-04:00")
public class CourseSchedule   {
  
  private List<CourseEvent> events = new ArrayList<CourseEvent>();

  
  /**
   *  [read-only]
   **/
  @ApiModelProperty(required = true, value = " [read-only]")
  @JsonProperty("events")
  public List<CourseEvent> getEvents() {
    return events;
  }
  public void setEvents(List<CourseEvent> events) {
    this.events = events;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseSchedule {\n");
    
    sb.append("  events: ").append(events).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
