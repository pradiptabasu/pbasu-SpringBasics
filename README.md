# pbasu-SpringBasics
pbasu-SpringBasics


Download libraries

* http://repo.spring.io/release/org/springframework/spring
* http://repo.spring.io/release/org/springframework/spring/5.1.4.RELEASE/
Choose the spring-framework-X.X.X.RELEASE-dist.zip

* https://stackoverflow.com/questions/28248777/spring-jars-to-download
* https://javarevisited.blogspot.com/2017/01/where-and-how-to-download-spring-JAR-Files-Spring4-without-Maven-Gradle.html
* 
* 
* 
* 


* https://stackoverflow.com/questions/17136324/what-is-the-difference-between-m2-home-and-maven-home
* https://howtodoinjava.com/maven/change-local-repository-location/
* http://www.avajava.com/tutorials/lessons/how-do-i-set-the-location-of-my-local-maven-repository.html
* https://stackoverflow.com/questions/4490135/how-to-change-maven-repository-folder-in-windows
* https://stackoverflow.com/questions/4490135/how-to-change-maven-repository-folder-in-windows
* https://www.albinsblog.com/2014/06/changing-default-maven-repository.html#.XD9oFFwzbIU

MAVEN_HOME is for Maven 1, M2_HOME is for Maven 2 and later.

Maven 2 was a complete rewrite from Maven 1 and was not backwards compatible. Having the two different _HOME variables means it is possible to run both on the same machine.

UPDATE

As of maven 3.5.0 neither of these environment variables should be specified. Instead, the path should be updated to include the mvn executable.



Though I strongly advise you to spend some time learning Maven or Gradle to manage dependencies in Java project. It will save you tons of times because downloading Spring framework JARs using Maven is as simple ass adding following XML snippet into pom.xml file:

<dependencies>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-context</artifactId>
<version>4.2.4.RELEASE</version>
</dependency>
</dependencies>

Similar with Gradle, you can add the following link to download Spring framework JAR files:

dependencies {
   compile 'org.springframework:spring-context:4.2.4.RELEASE'
}



* https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
* https://www.baeldung.com/maven-directory-structure
* https://examples.javacodegeeks.com/enterprise-java/maven/maven-project-structure-example/
* http://www.java2s.com/Tutorials/Java/Maven_Tutorial/1030__Maven_Directory_Structure.htm
* 
* 
* 
* 
* 


### demo with Spring Boot + AngularJS + Flyway + PostgreSQL + Docker
=================================================================================

* https://github.com/aksakalli/todo-spring-angular
* https://springbootdev.com/2018/01/08/docker-spring-boot-and-spring-data-jpa-mysql-rest-api-example-with-docker-with-docker-compose/
* https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-and-angularjs-integration-tutorial/
* https://github.com/hantsy/angularjs-springmvc-sample-boot
* https://github.com/aranga-nana/angular-spring-boot-micro-services-docker
* https://github.com/g00glen00b/ng-spring-boot
* https://github.com/datvv/Spring-Boot-AngularJS-Spring-Data-JPA-CRUD-App-Example
* https://github.com/spring-projects/spring-petclinic
* https://www.tutorialspoint.com/spring/spring_bean_definition_inheritance.htm
* 
* 
* 
* 
* 
* 
