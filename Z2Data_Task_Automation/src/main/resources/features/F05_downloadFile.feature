@Runner
Feature: download file
  Scenario: download file to certain directory
    Given user navigate to "https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html"
    When user press on Press on Excel xlsx
    And get download page and download to project folders
    Then open and assert rows count after excluding header will be "36" start from row "9" till end row