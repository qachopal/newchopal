# Functional test on Selendroid App:

        • I used the Data Driven Approach by using the TestNG framwork.
    
# The project Sturcture is as follows:

        # Under the folder (AppiumMobileTest/src/test/java) ==> 
           • 'base' package consist the 'TestBase' class which is using the setting the DesiredCapabilities, Porperties files, Driver etc. and extend this 'TestBase' class in all the above mentioned TestCases Classes.
           •  Test Cases are created under the folder (AppiumMobileTestsrc/test/java/testcases):
           • 'utilities' package is used the common created uitlity classes.
         
        # Under the folder (AppiumMobileTestsrc/test/resources) ==> 
           • 'excel' folder consist the '.xlsx' file for reading the data from ".xlsx" file 
           • 'logs' folder consist the 'Application.log' and 'Selenium.log' files for maintaing the user logs and System logs respectively
           • 'properties' folder consist the properties files.
           • 'runner' folder consist the 'testng.xml' file for run the Test Suite.
         
# Test Cases exist inside folder (AppiumMobileTest/src/test/java/testcases):

        • Test Case: 1 => Open Selendroid App & Enter Input data in Textbox on HomePage.
        • Test Case: 2 => New User Registration by clicking on Registration button.
        • Test Case: 3 => User Successfully Register confirmation Page.
        • Test Case: 4 => Display Popup Message by clicking on Display Popup Window and then dismiss the popup window.
        • Test Case: 5 => Display Toast Message.
    

# Installation Pre-requisites:

        • Install JDK
        • Install Eclipse
        • Install Android SDK
        • Install Android API version 7.0
        • Install Appium for Windows
        • Install PdaNet+   

# Steps to execute the code:

        • Open the imported project in Eclipse
        • Instatiate Appium Server on the following address: Host:Port = localhost:4723  (http://127.0.0.1:4723/wd/hub)
        • Attached the mobile device Moto C Plus(7.0) by using USB with my Laptop and open the Vysor

# Reports will be generated inside the following folders:

        • AppiumMobileTest\test-output\emailable-report.html
        • AppiumMobileTest\test-output\index.html
    
    


