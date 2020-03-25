# Spring Boot Hello World

A spring boot enabled hello world application

## Usage

- Directly using maven
```
mvn spring-boot:run
```

- From within your IDE right click run 
```
Application.java
```

- From executable jar file
```
mvn clean install
java -jar target/helloworld-1.0-SNAPSHOT.jar
```

- How to setup Jenkins Webhook
```
1. Register Jenkins server with GitHub - https://embeddedartistry.com/blog/2017/12/21/jenkins-kick-off-a-ci-build-with-github-push-notifications/ e.g. http://35.230.91.86:8080/github-webhook
2. Enable the options on Jenkins Pipeline
  a. GitHub project [provide the github repository url e.g. https://github.com/sureshmurthy85/forrester_demo_2020/]
  b. Under Built Triggers enable - GitHub hook trigger for GITScm polling
````

