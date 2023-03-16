Feature: To check the Facebook page

  
@sanity
  Scenario: To Check The Login page of the Application
    When user has to load the FaceBook Application
    
    # One Dimentional List
    When user has to pass the invalid username in email field
      | muthu@gmail.com | vel@gmail.com | bharathy@gamil.com |
      
    # Two Dimentional List
    And user has to pass the invalid password in password field
      | Kum@r55     | tool@456    | keyis@77 |
      | school@87   | colloge@111 | gptc@909 |
      | madurai@631 | omr@0028    | csk@7    |
      
    And user has to click the login button
   

@rergreesion @sanity
  Scenario Outline: to validate login with postive and negative combination datas
    When to launch the url the facebook application
    When to pass postive and neagative data  in email field"<username datas>"
    And to pass postive and negative data in password field  "<password datas>"
   

    Examples: 
      | username datas  | password datas |
      | seli@gmail.com  | gdfgh@123      |
      | phyth@gmail.com | sqlapi@453     |
      | java@gmail.com  | asdfghjka@123  |
