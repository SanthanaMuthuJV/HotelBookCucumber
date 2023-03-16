
Feature: To Validate The Login Functionality Amazon Application

 @key
  Scenario: 
  
    When To Launch The Amazon Application
    # One Dimentional Map
    When To Pass The Valid Username in email filed
      | emailone   | sandal@gmail.com |
      | emailtwo   | jeni@gmail.com   |
      | emailthree | swetha@gmail.com |
    When To Click The Continue button
    # Two Dimentional Map
    When To Pass the Valid Password in Password filed
      | passone      | passtwo      | passthree    |
      | swe@123      | tomjerry@123 | veni@0987    |
      | satheesh@567 | Jeni@123     | bharathy@923 |
    And To Click The Login button
