This framework is done using Appium Java using the Pageobject Model. The framework is build around the native app for the Calendar on Android phone. There are some pre requisite that needs to be in place before this is run.

1. Android 9 should be used to run the tests. I used Pixel 9 with API 28.
2. Use should be pre-logged in.


Few items that are implemented in this are, Pageobject Model, TestNG, Maven, Extent Reports, Test Fail Screenshots.
Clone the project on your laptop/desktop, go to the project location and run the command mvn test to run the tests. Please make sure all the dependencies are downloaded before the test begins. 

Features not implemented yet: 
1. Logging using Log4j
2. Failure screenshot in Extent Reports