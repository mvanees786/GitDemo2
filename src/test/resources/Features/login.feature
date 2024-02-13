Feature: feature to test login func

  Scenario: check loginis succesful with valid cred
    Given User is on logiin page
    When user enter username and pass
    And click login button
    Then user is navigated to home page

  #Scenario Outline: check loginis succesful with valid cred
    #Given User is on logiin page
    #When user enter <username> and <password>
    #And click login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
