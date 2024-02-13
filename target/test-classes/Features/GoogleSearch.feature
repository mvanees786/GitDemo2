Feature: feature to test google search funcyionality

  Scenario: check google saerch is working
    Given browser is open
    And user is on gooogle search page
    When user enter text in search box
    And hits enter
    Then user is navigated to search results
