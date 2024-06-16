TO START WITHOUT DOCKER:

* Postgresql should be installed on your PC

* Change your database settings in application.properties

* Install dependencies with "nvm clean install" and run app with "nvm spring-boot:run"

* Register user with POST request and enter these username + password via "basic" auth option 

TO START WITH DOCKER:

* Create jar package using "mvn clean -DskipTests package", -DskipTests needed because of specific db settings in application.properties

* Run "docker compose up" 