Feature: feature to test login func

  Scenario Outline: check login is succesfull with valid cred
    Given User is on logiin page
    When user enter <username> and <password>
    And click login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
