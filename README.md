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

<details>
<summary>EXERCISE 2: Start Mysql GUI container</summary>
Now you have a database, you want to be able to see the database data using a UI tool, so you decide to deploy phpmyadmin. Again, you don't want to install it locally, so you want to start it also as a docker container.

1. Start phpmyadmin container using the official image.
```shell
docker run --name phpmyadmin -d --link mysql-container:db -p 8081:80 phpmyadmin 
```
2. Access phpmyadmin from your browser and test logging in to your Mysql database

3. Start app
```
docker run -d -p 8080:8080 --link mysql:latest -e DB_NAME=mydbname -e DB_USER=myuser -e DB_PWD=mypassword -e DB_SERVER=mysql java-app:1.3

docker run -d -p 8080:8080 --network devops-module7-exercises_mynetwork -e DB_NAME=mydbname -e DB_USER=myuser -e DB_PWD=mypassword -e DB_SERVER=mysql java-app:1.3
```
</details>