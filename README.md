# Project for Homework 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Clone repositories.

	https://github.com/michalchyb/Homework.git		

* **Prerequisites:**
    * Install the latest version of [Java](https://java.com) and [Maven](https://maven.apache.org/download.html).
    * You may need to set your `JAVA_HOME` and `MAVEN_HOME`. 


### Installing

Clone repository and go to Homework directory using command line
```bash
cd /directory_to_Homework_Folder/homework
```
Next use
```bash
mvn package
```
If everything went ok just run the app with
```bash
mvn spring-boot:run 

```

### Running
Backend will be running on 
* Endpoint for books: http://localhost:8080/book/{isbn}
* Endpoint for category: http://localhost:8080/category/{Category}
* Endpoint for rating: http://localhost:8080/rating       


### Swagger
You can see swagger documentation under 

http://localhost:8080/swagger-ui.html#



### Unfortunately 
Not everything went right. I did not have enough time to finish all task(because of work and other duties I did not spend the time that I wanted)
- I did not cover code with test. I wanted to use RestAssured
- Like you said in the task not always is every property present in the data set. 
  I tried to handle this wiht Json Properties like @JsonView and did not work and also tried "marshalling" but I did have that time.
