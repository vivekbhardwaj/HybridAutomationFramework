# HybridAutomationFramework

An automation framework for passing configuration from an excel file, and based upon the configuration,data will be provided by the xml
for the test script.

So, the scenario here is, I have my test scripts in project 'fb' under 'src/test/java' and I have my configurations stored in 'data/FbData.xlsx'
and the data for each configuration will be provided from 'data/EnvironmentOne/PageData.xml' . The schema for this PageData.xml will be in 
'src/test/resources/xsd/pageData.xsd'. Classes and getter setters for each configuration will be generated my JaxB plugin in pom.
Now data will be accessible in test scripts.


'Fbutil' project will deal with the classes dealing with excel reading and other common stuffs for a test case execution.
