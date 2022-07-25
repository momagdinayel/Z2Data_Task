@Runner
Feature: upload file
  Scenario: upload file
    Given user navigate to "http://the-internet.herokuapp.com/upload"
    And user upload small image
    Then image uploaded successfully