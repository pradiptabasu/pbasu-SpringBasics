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


