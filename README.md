# bookeo-api
A Java implementation of Bookeo's API.

Generating proxy objects for Bookeo's REST API can be done by doing:

# mvn clean exec:exec

and go into com.bookeo.api packages. The Maven pom is set to pull from http://www.bookeo.com/apiref/swagger.json

To get a new session for invoking the API, create a BookeoSessionFactory and pass in your application's secret key. There
should ideally only be one BookeoSessionFactory per Bookeo application. Then call getSession(..) on it passing in the api key. The api key is generated on a per-account basis when someone installs your Bookeo application.