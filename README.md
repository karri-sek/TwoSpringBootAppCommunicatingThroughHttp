# TwoSpringBootAppCommunicatingThroughHttp

This repo contains two spring boot app communicating through Http Rest
 1) student spring boot communicates to course spring boot to get the course details.
 
 Tests has been added to both apps. In order to pass all the test cases from the student app, please run the course app first and 
 run the testcases from the student app.
 
 Steps to execute:
 1) Download the httpcourse folder to the desired location, and run it through the command 'mvn spring-boot:run' from the terminal
 2) Download the httpstudent folder to the desired location, and run it through the command 'mvn spring-boot:run' from the terminal
 
 This app can be tested through curl also.please run the below command to see the details of the student with course.
 `Command: $ curl http://localhost:8010/students/1/courses/1
 output % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   116    0   116    0     0    116      0 --:--:-- --:--:-- --:--:--   493{"id":"1","name":"Adam","courseId":"1","course":{"id":"1","name":"Fluid mechanics","description":"Fluid mechanics"}}`

 
