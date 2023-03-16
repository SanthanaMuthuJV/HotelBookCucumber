Feature: To Validate The Login Functionality DemoaQA Application

  @loki
  Scenario: 
    When To Launch The QemoQA Application
    And To Pass The Valid Firstname in filed
    And To Pass The Valid Lastname in filed
    And To Pass The Valid Email in filed
    And To Pass The Valid Mobilenumber in filed
    And To Pass The Valid Country in filed
    And To Pass The Valid City in filed
    And To Pass The Valid Mgs in filed
    And To Pass The Valid Code in filed

  @you
  Scenario Outline: 
    When To Launch The QemoQA Appln
    And To Pass The Valid Firstname"<firname datas>"
    And To Pass The Valid Lastname"<las datas>"
    And To Pass The Valid Email"<em datas>"
    And To Pass The Valid Mobilenumber"<mobilenu datas>"
    And Select The  Country
    And To Pass The Valid City"<town datas>"
    And To Pass The Valid Mgs"<sms datas>"
    And To Pass The Valid Code

    Examples: 
    
      | firname datas | las datas | em datas        | mobilenu datas | town datas | sms datas          |
      | Shiva         | Sakthi    | swe@gmail.com   |     9874561230 | VGL        | 2. Verify&validted |
      | Muthu         | jeni      | jerry@gmail.com |     9874512630 | KKM        | 3.Verify&validted  |
