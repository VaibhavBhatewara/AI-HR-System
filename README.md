To Run The Project

mvn clean install
mvn spring-boot:run

App runs at:
http://localhost:8080  (IF Need to Change the port add the ports details in Properties file)

Add the DB Details In application.properties for testing the API.

API
1. Save The Employee.

Post :  http://localhost:8080/save

{
  "name": "Vaibhav",
  "email": "vaibhav.vkb@gmail.com",
  "gender": "M",
  "team": "Dl-IT-ES-NFA",
  "role": "Developer",
  "birthdate" : "null",
  "position": "SSA",
  "recruitmentDtae" : "null"
}


2.Get The Employee : Can Apply The Filter Of Name and Role.

GET : http://localhost:8080/getEmployee

3.Update The Score
Post : http://localhost:8080/{Empid}/

4. Enter The name and Repo 

POST: http://localhost:8080/assigiment/save


{
    "id": 2,
    "name": "Sale",
    "repo": "https://git.com/m3"
}


5.  Grant The Access To The Employee of Perticular Repo
POST : http://localhost:8080/assigiment/addAcess

6.To Revoke The Access

PUT: http://localhost:8080/assigiment/removeAcess


