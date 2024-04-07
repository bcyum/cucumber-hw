Feature: ButtonClickTest

  Scenario: Clicking the Button
    Given I am on the DemoQA Elements page
    When I click on the "Buttons" element
    And I click the "Click Me" button
    Then I should see the message "Button has been clicked"
