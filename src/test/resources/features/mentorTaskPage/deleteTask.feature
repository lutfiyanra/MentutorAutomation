@Mentor @Riza @Capstone4
Feature: Delete Task Functionality for Mentor role

  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor on Task page
    And User already on task page

  Scenario: Delete functionality normally work
    When User wait until all element successfully loaded
    And User click one of specific task option button
    And User click Delete button
    And Delete confirmation dialog box appeared
    And User choose Yes Delete button on delete confirmation dialog box
    Then Appear Task Successfully Deleted PopUp Message
    And The selected task successfully deleted