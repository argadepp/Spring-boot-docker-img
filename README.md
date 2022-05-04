Spring Boot based application of Users adiition and get the list of all users .

It required Java need to be installed .

It also contains docker file so you can containerize the application .

Make changes in application.properties file as per your requirment .

Path ----->> Spring-boot-docker-img/src/main/resources/application.properties

You can use mysql container tu run the application 

Db details --

CREATE TABLE Users (
    uif int NOT NULL,
    fname varchar(255) NOT NULL,
    lame varchar(255),
    mobno int,
    PRIMARY KEY (uid)
);


Application is running on Port 8081
