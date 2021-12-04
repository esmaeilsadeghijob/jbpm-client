

### SWAGGER URL
````
http://localhost:8080/kie-server/docs/
````

### REST API
````
Home >>  Manage Process Definitions >>  Process Definition: studentExamResult >> 
         - Definition Id (containerId)
         - Deployment (processId)
         
         
         Spaces >> kietutorials >> unit12-swagger_web_interface >> master >> Student
         - package name + Class name
                  
         http://localhost:8080/kie-server/services/rest/server/containers/unit12-swagger_web_interface_1.0.0-SNAPSHOT/processes/unit12-swagger_web_interface.studentExamResult/instances
         
         body:
             {
                 "student": {
                     "com.kietutorials.unit12_swagger_web_interface.Student": {
                         "name": "kietutorials"
                     }
                 }
             }
         
         Curl:
         curl -X POST "http://localhost:8080/kie-server/services/rest/server/containers/unit12-swagger_web_interface_1.0.0-SNAPSHOT/processes/unit12-swagger_web_interface.studentExamResult/instances"
           -H "accept: application/json"
           -H "content-type: application/json" 
           -d "{ \"student\": { \"com.kietutorials.unit12_swagger_web_interface.Student\": { \"name\": \"kietutorials\" } }}"
````


### MANAGER BUSINESS APPLICATIONS WITH SPRING BOOT DOC
````
https://access.redhat.com/documentation/en-us/red_hat_process_automation_manager/7.2/html-single/creating_red_hat_process_automation_manager_business_applications_with_spring_boot/index
````

### JAVA CLIENT API FOR KIE CONTAINERS AND BUSINESS ASSETS DOC
````
https://access.redhat.com/documentation/en-us/red_hat_process_automation_manager/7.6/html/interacting_with_red_hat_process_automation_manager_using_kie_apis/kie-server-rest-api-con_kie-apis
````