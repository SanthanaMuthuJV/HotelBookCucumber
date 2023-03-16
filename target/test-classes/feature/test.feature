Feature: To Validate The Login Functionality Amazon Appln

  Scenario: To Check The Login page of the Appln
    Given User has to launch the browser and maximize the window
    When To Launch The Amazon Appln
    # One Dimentional Map
    When To Pass The Invalid Username in email filed
      | emailone   | java@gmail.com      |
      | emailtwo   | seleninum@gmail.com |
      | emailthree | python@gmail.com    |
    When To Click The Continue btn
    # Two Dimentional Map
    When To Pass the Invalid Password in Password filed
      | passone   | passtwo    | passthree    |
      | sql@123   | java@123   | api@0987     |
      | frame@567 | windows@34 | webtable@923 |
    And To Click The Login btn
    Then User has to close the Browser
