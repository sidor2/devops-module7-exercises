#### This project is for the Devops bootcamp exercise for 
#### "Containers - Docker" 

<details>
<summary>EXERCISE 1: Start Mysql container</summary>

First you want to test the application locally with a mysql database. But you don't want to install Mysql, you want to get started fast, so you start it as a docker container:
1. Start mysql container locally using the official Docker image. Set all needed environment variables.
```shell
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=my-secret-pw -e MYSQL_DATABASE=mydbname -e MYSQL_USER=myuser -e MYSQL_PASSWORD=mypassword -d -p 3306:3306 mysql:latest
```
2. Export all needed environment variables for your application for connecting with the database (check variable names inside the code)
```shell
setvar.bat
```
3. Build a jar file and start the application. Test access from browser. Make some changes.
```shell
gradle build
```
```shell
java -jar ./build/libs/bootcamp-docker-java-mysql-project-1.0-SNAPSHOT.jar
```
</details>
