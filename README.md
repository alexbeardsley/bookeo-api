# bookeo-api
A Java implementation of Bookeo's REST API using jersey. Includes a Maven plugin to automatically generate the required proxy objects to communicate with Bookeo, as well as custom modifications and fixes needed for proper integration such as formatting of dates and authentication headers.

###Requires:
* Java 1.8
* Maven

### Installation:

`<dependency>`
`  <groupId>com.alexbeardsley</groupId>`
`  <artifactId>bookeo-api</artifactId>`
`  <version>0.1.0</version>`
`</dependency>`

###Usage
`//Ideally there should only be one BookeoSessionFactory per Bookeo application.`
`BookeoSessionFactory sessionFactory = new BookeoSessionFactory("myApplicationsPrivateKey");`
`BookeoSession session = sessionFactory.getSession("clientsApiKey");`
`BookingsList bookings = session.bookings().bookingsGet(..)`
`//Other API calls are available on BookeoSession`

The Maven repository release includes everything, however this project's source code __does not include the proxy objects and services used to exchange data with Bookeo__. Source files are generated with Maven by using the following command: 

_mvn clean exec:exec_

Which generates objects into target/generated-sources. It can be packaged into a re-usable JAR file via:

_mvn package_

These objects are generated directly from Bookeo's Swagger specification located at [http://www.bookeo.com/apiref/swagger.json](http://www.bookeo.com/apiref/swagger.json).

###Unexpected API Changes
In the unlikely event of an unexpected API change from Bookeo which breaks your application, you can re-generate these proxy objects a build a temporary JAR using the commands above. It will contain the new proxy objects. Temporarily install it locally via `mvn install` or put it in your Nexus instance until a new release is available.