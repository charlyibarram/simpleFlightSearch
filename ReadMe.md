# Flight Search API Application

SpringBoot Application with REST API Development using Spring MVC, Spring Data JPA using Java 8 features

## Features

This application has two REST end-points to show flight-booking information. 

1. GET /bookings?uid={passenger-id}
2. GET /bookings/{booking-id}

3. GET /airports
4. GET /airports/{iata-code}
5. GET /flights
6. GET /flights/{flight-id}
7. GET /passengers
8. GET /passengers/{passenger-id}

## Technologies used

1. Java (Programming Language)
2. Spring Boot (Application Platform)
3. Spring Data JPA (Data persistence)
4. H2 (Database)
5. JUnit, with Spring Testing


## Getting Started

The source code can be checked out to your local and then build and run the application either from your IDE after importing to it as a maven project, or just from a command line. Follow these steps for the command-line option:  

### Prerequisites
1. Java 8
2. Maven 3
3. Git


### Installing & Running

#### Clone this repo into your local: 


####  Build with maven 
	
```
mvn clean install
```
	
#### Start app
	
```
mvn spring-boot:run
```
	
#### Access the Home screen

The application will be available at the URL: [Home](http://localhost:8080).

	
#### Test the URLs
	
    1.http://localhost:8080/bookings?uid=PS-10
    2.http://localhost:8080/bookings/FB-10
    
