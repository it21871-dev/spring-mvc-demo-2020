# spring-mvc-demo-2020
## Prerequisites
### Database

#### Using Docker
[Install Docker](https://docs.docker.com/get-docker/)

```bash
docker run --name mysqldb -v mysqldbvol:/var/lib/mysql -p 3306:3306 -e MYSQL_USER=mysql -e MYSQL_PASSWORD=mysql -e MYSQL_DATABASE=students -e MYSQL_ROOT_PASSWORD=pass123 --rm -d mysql/mysql-server:latest
```
connect to mysql
```bash
mysql -h 127.0.0.1 -u root -P 3306 -p
```
### Application properties
Create a file named application.properties
```bash

jdbc.url=jdbc:mysql://SERVER:PORT/DATABASE?useSSL=false
jdbc.user=USERNAME
jdbc.password=PASSWORD
jdbc.driver=com.mysql.cj.jdbc.Driver

hibernate.dialect=org.hibernate.dialect.MySQLDialect
hibernate.show_sql=true
```

## Clone Project into Eclipse


File -> Import -> Git/Projects from Git -> Clone URI

the project url is 
[https://github.com/tsadimas/spring-mvc-demo-2020.git](https://github.com/tsadimas/spring-mvc-demo-2020.git)

when the prompt to select the kind of project appears, select *Import as general project*


![import_project](screenshots/import.png "Import into Eclipse")


Next, you should convert the current project to Dynamic Web project.
To accomplish this, you should right-click the project and in properties go to *Project Facets*
Enable Faceted Project

![enable_facets](screenshots/convert-to-facet.png "Convert to faceted form")

and select _Dynamic Web Module_ from the facets list.

![facets](screenshots/dynamic-facet.png "Convert to Dynamic Web Project")

Set the default JRE runtime to be Java 11. To accomplish this, right click the project and in _Java Build Path_, in Libraries Tab edit the _JRE System Library_ to point to your Java 11 runtime (setting the appropriate value to Alternate JRE).

![facets](screenshots/java-1.png "JRE config 1")

![facets](screenshots/java-2.png "JRE config 2")


To fix the errors in jsp files, you should again right click the project, and in properties go to _Targeted Runtimes_ and select the Apache Tomcat that is connected to your eclipse workspace.

![Target Runtime](screenshots/targeted-runtimes.png "Targeted Runtimes")

Also, don't forget to convert the project to maven project (Configure->Convert to Maven Project) and select Maven--> Update Project from the menu appearing when right-clicking the project.

## Clone Project in IntelliJ

### Configure IntelliJ to use local Tomcat

Select Run &rarr; Edit Configurations, Then the plus (+) symbol and select Tomcat Server &rarr; Local.
![Target Runtime](screenshots/intellij-tomcat-config.png "Targeted Runtimes")
Set the location and then press the "fix" button 

![Target Runtime](screenshots/intellij-tomcat-config-1.png "Targeted Runtimes")

and select an artifact to deploy.
![Target Runtime](screenshots/intellij-tomcat-config-2.png "Targeted Runtimes")

### Fix ``cannot resolve import javax.servlet.*``

Go to File &rarr; Project Structure 
Select Modules &rarr; [your module name] &rarr; Dependencies and click the plus symbol (+)

![Target Runtime](screenshots/intellij-tomcat-fix.png "Targeted Runtimes")
and select "Application Server Libraries &rarr; Tomcat X.X.X"
![Target Runtime](screenshots/intellij-tomcat-fix-1.png "Targeted Runtimes")

