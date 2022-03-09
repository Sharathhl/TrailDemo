# i have commented the line

Feature: login functionality of an salesforce application

Scenario Outline: Valid user name and password
Given Launch "<Browser>" browser
And navigate to url
And Enter the username "<usernmae>" and password "<password>"
When Click on sumbit
Then Check Whether it is logged in or not 

Scenario Outline: signup
Given Launch "<Browser>" browser
And navigate to url
When Create an user in signup page
Then Check user created or not


Examples: 
|Browser	|username	|password	|
|Firefox	|u1	      |p1       |
|Chrome   |u2       |p2       |
|Edge     |u3       |p3       |

