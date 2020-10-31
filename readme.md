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

### To copy jar from local to EC2 instance
scp -i ~/Downloads/ec2-ssh-access.pem subscriptions-0.0.1-SNAPSHOT.jar ec2-user@ec2-3-137-174-245.us-east-2.compute.amazonaws.com:


### Command to run service on EC2
java -Dserver.port=9000 -Dspring.profiles.active=staging -jar subscriptions-0.0.1-SNAPSHOT.jar

##### EC2 example API
http://ec2-3-137-174-245.us-east-2.compute.amazonaws.com:9000/accounts/all

