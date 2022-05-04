Spring Boot based application of Users adiition and get the list of all users .

1.It required Java need to be installed .

2.Also Maven is required to be install

------------------------------------------------------------------------------------------

Major Change @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

Change the mysql connection URL where you need to mention the proper public IP of instance 
Path ----->> Spring-boot-docker-img/src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://publicip:3306/demo

Steps to create Jar file 
1. Clone the repo 
2. go to folder where pom.xml is present 
3. execute mvn command "mvn clean install " 
4. then Target folder will be created and .jar file is present over there 
5. Build the docker file "docker build -t nameofimg"
6. Run the container "docker run -d --rm -p 8081:8081 --name demoapp nameofimg"

Post that you can check by brousing the URL http://publicip:8081/getusers

You will get the list off users , similarly you can add the users by using Postman and by specifying the requesting body details 

=================================================================================================================================================



You can use mysql container tu run the application 

Db details --

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password mysql:5.7

mysql -u root -p 

CREATE TABLE users ( uid int NOT NULL, fname varchar(255) NOT NULL, lname varchar(255), mobno int(12), PRIMARY KEY (uid) );

insert into users values(1,'Pratik','Argade','9454664446');

Application is running on Port 8081
