@Runner
Feature: check box
Scenario: click the check box
Given user navigate to "http://the-internet.herokuapp.com/checkboxes"
And user check first checkbox
Then two boxes are checked