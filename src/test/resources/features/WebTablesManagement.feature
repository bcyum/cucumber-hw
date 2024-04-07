Feature: Web Tables Management

  Scenario: Adding and editing a new record
    Given User navigates to the web tables page
    And User clicks on the "ADD" button
    And User adds a new record
    And User edits the added record
    Then User verifies that the added record is successfully updated
