# islamicshopdk.com_Automation_Testing_Using_Selenium
This project showcases a comprehensive approach to software testing by the automated testing methodology of "https://islamicshopdk.com/". It leverages Selenium, a powerful tool for web application automation, alongside Allure Reports for detailed test reporting. 

## Technology Used
- IntelliJ IDE
- Selenium
  
### **Programming Language used:**
- Java
  
## Project Structure
- Automation Testings: Contains the Selenium WebDriver test scripts.
- Manual Testing: Directory for manual test case documentation.
- Allure-results: Directory where Allure results are stored.
- Allure-report: Directory where the Allure report is stored.

## Running Automated Tests in CLI mode
```console
mvn test
```
## Running Automated Tests in CLI mode with Specific Browser
```console
mv test -Dbrowser="chrome"
```
## Running Automated Tests in CLI mode with Specific Browser and Suite File
```console
mv test -Dbrowser="chrome" -DxmlFileName="testng.xml"
```
## Allure-report File Generation
```console
allure generate ./allure-results --clean
```
## Allure-report File Display in Local Server
```console
allure open ./allure-report/
```
## Allure-report File
-https://islamicshopdkreport.netlify.app/







