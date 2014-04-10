Maven Archetype Quickstart-springMvc4-Jpa-JavaConfig
====================================================

Quick start configuration for SpringMVC v4 using java annotations.

Features
========

* No-xml Spring MVC 4 web application for Servlet 3.0 environment
* **Spring 4** configuration via spring-bom
* **H2** embedded database in memory with web console enabled
    * Simply put **/h2** url on browser
* **Twitter Bootstrap and JQuery**
* Commented **spring-security** features *(ready to use)*
* Several filters configured like:
    * *characterEncodingFilter*
    * *HiddenHttpMethodFilter*
* Rendering views using **JSP** with *InternalResourceViewResolver*
* **Spring-Data-JPA**
* Persistence provider with **Hibernate**
* **JSON** Ready
* Junit / Mockito / hamcrest
* No tiles, thymeleaf or sitemesh templates
* Some example code to start
* Maven site ready with javadoc plugin
* Embedded tomcat and Jetty servers



How to use
===========

**NOTE:** you must configure Maven in your classpath for build the archetype

1. Clone repo
2. Open a system console and change directory to *quickstart-springmvc4-jpa-javaconfig*
3. Run *mvn clean*
4. Run *mvn archetype:create-from-project*
5. cd target/generated-sources/archetype
6. Run *mvn clean install*

Or you can use the **build.bat** provided (in windows)

After the build is done, you simply can create a project based on this archetype.

If you use Eclipse or STS:

1. Create a new maven project -> Next
2. In repository field for archetypes use *"Local"*
3. Search quickstart-springmvc4-jpa-javaconfig
4. Done
5. If you like testing: run *mvn jetty:run* or *mvn tomcat:run*










