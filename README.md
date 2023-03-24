### Parabank Test

Java (JDK) and Maven should be installed and added to System variables.  
Tests were written to run with Microsoft Edge browser.

- Clone repo to local dir and open cmd.exe in it
- To get results and HTML report, run: mvn test
- Report is created in: target/cucumber-reports/report.html

Before running tests, register two users on https://parabank.parasoft.com/parabank/register.htm:
<pre>
First Name | Last Name | Username  | Password
Ana        | Eric      | AnaE      | 123
Iva        | Ilic      | IvaI      | 456
</pre>

User story:

1. Go to https://parabank.parasoft.com/parabank/index.htm
2. Submit valid credentials
3. Overview page is displayed