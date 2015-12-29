# bookeo-api
A Java implementation of Bookeo's REST API using jersey. Includes a Maven plugin to automatically generate the required proxy objects to communicate with Bookeo, as well as custom modifications and fixes needed for proper integration such as formatting of dates and authentication headers.

###Requires:
* Java 1.8
* Maven

### Installation:

```
<dependency>
  <groupId>com.alexbeardsley</groupId>
  <artifactId>bookeo-api</artifactId>
  <version>0.1.1</version>
</dependency>
```

###Usage
```
//Ideally there should only be one BookeoSessionFactory per Bookeo application.
BookeoSessionFactory sessionFactory = new BookeoSessionFactory("myApplicationsPrivateKey");
BookeoSession session = sessionFactory.getSession("clientsApiKey");
BookingsList bookings = session.bookings().bookingsGet(..)
//Other API calls are available on BookeoSession
```

The Maven repository release includes everything, however this project's source code __does not include the proxy objects and services used to exchange data with Bookeo__. Source files are generated with Maven by using the following command: 

_mvn clean exec:exec_

Which generates objects into target/generated-sources. It can be packaged into a re-usable JAR file via:

_mvn package_

These objects are generated directly from Bookeo's Swagger specification located at [http://www.bookeo.com/apiref/swagger.json](http://www.bookeo.com/apiref/swagger.json).

###Limitations
At this time Bookeo's API is still in beta and has some limitations. These have been confirmed by their developers as things which will be added in the future:

* You cannot retrieve Notes for a Booking
* It is not possible to get the time for a Block.

If you come across others with confirmation from a Bookeo developer, please send us a note and we will add it to this list.