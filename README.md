# Motorsport Buddy API
![](https://img.shields.io/badge/Java-Programming-green)
## Description
API for [Motorsport Buddy](https://github.com/Tyall/motorsport-buddy-frontend) project. 

A RESTful API created with Spring Boot and Java supplied by data from local PostgreSQL hosted database.

## Technologies
* Sprint Boot 3
* Java 17
* PostgreSQL
* Maven

## Installation

To work properly there must be a database with data set up.
As of now (Development in Progress!), database versioning tool is not implemented so automated replication of data is not possible.
There's a plan of implementing Flyway to automate the process of creation and filling database with data or use external API to receive up to date information.

Currently, as DBMS, you can use either PostgreSQL or H2, both of those were tested, requiring slight changes in application properties. 
Hibernate will take care of recreating the data structure.

Besides that, the steps to run application are standard.

**1. Clone the repository:**

```
$ git clone https://github.com/Tyall/motorsport-buddy.git
$ cd motorsport-buddy
```
**2. Compile the code**

Use chosen compiler or built in IDE to compile the source code.

**3. Run the application with Maven:**

```
$ mvn spring-boot:run
```

## Usage

Navigate to [front-end](https://github.com/Tyall/motorsport-buddy-frontend) part to explore use cases of the application. 


## Project status

Project is still in early phases of development. It's lacking lots of features that are aimed to be present in the final version. This readme will be updated together with development iterations.
Besides features the biggest problem is the recreation of data in the database. That's one of the priorities on the ToDo list.
