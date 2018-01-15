## How to run the application:

### Prerequisites:

#### 1- Java 8.
#### 2- Maven 3.

### Steps:

#### 1- Clone this repository: `git clone https://github.com/KamalMarei/Expedia-Task.git`.
#### 2- Build the application using `mvn clean install`.
#### 3- Start the application.
#### 4- Verify that the application is running. [http://localhost:8080](http://localhost:8080)

#### Note: You can also add the application to the webapps folder of a local tomcat, then start up tomcat.


## Test Cases:

#### 1- If fields left empty, all hotel deals should be returned.
#### 2- Fields get emptied on every page load.
#### 3- All fields values are treated as "AND". For example if Destination is set to "Miami" and "Length of Stay" is set to 3, this means look for hotels in Miami for a 3-night stay.
