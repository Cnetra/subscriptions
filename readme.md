### To create a build, command
./mvnw clean package

### To run an application, command
java -Dserver.port=9000 -Dspring.profiles.active=staging -jar target/subscriptions-0.0.1-SNAPSHOT.jar
 
Use 'local' profile for local run

### API examples

To get all accounts
http://localhost:8080/accounts/all

To get one account by Id
http://localhost:8080/accounts/1