@Runner
Feature: Search fo selenium

  Scenario: google selenium an press 2nd link
    Given user navigate to "https://www.google.com"
    When user search for "Selenium Tutorial"
    And user press "2" result
    Then user get directed to "https://www.javatpoint.com/selenium-tutorial"

  Scenario: google selenium an press 3rd link
    Given user navigate to "https://www.google.com"
    When user search for "Selenium Tutorial"
    And user press "3" result
    Then user get directed to "https://www.tutorialspoint.com/selenium/index.htm"


