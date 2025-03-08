FROM tomcat:9.0.102-jdk11-temurin-noble

RUN mkdir /usr/local/tomcat/webapps/ROOT
COPY target/spring-web-dependencytest-ci.war /usr/local/tomcat/webapps/ROOT
WORKDIR /usr/local/tomcat/webapps/ROOT
RUN jar xvf spring-web-dependencytest-ci.war
RUN rm spring-web-dependencytest-ci.war

