# visa-assignment

Description: This repo contains BDD script for Automation of Amazon website  browser(Chrome & IE & Firefox browsers)

The framework is developed using Cucumber(Behaviour Driven Development), Junit and Selenium. 
The scripts are written using Java programming language. The design pattern used as part of this framework is "Page Object Model". 

Framework Details:

a. Main Runner class implemented at visa-assignment/src/test/java/amazon/runner and specify the cucumber tags which need to be used for execution 
   i. To execute all the scenarios, specify the runner class with @smoke_test tag
   ii. To execute specific scenario, specify the runner class with the tag of the scenario 
   that needs to be executed (For instance, to execute the update product to bag test scenario, 
   specify runner class with @add_product_to_bag tag)
    
b. Execution config details can be found at visa-assignment/config.properties(Specify the browser such as Chrome/Firefox/IE to be used for execution) 

c. Test data details can be found at visa-assignment/testData.properties. The test data which is used as a part of execution is defined in testData.properties

d. Cucumber feature- Test cases are written in easily understandable format. The Feature files are placed in "Features" folder.

e. Reports & Screenshots can be found after test run at visa-assignment/report & visa-assignment/Screenshots

f. Execute the tests with the command "mvn clean test"