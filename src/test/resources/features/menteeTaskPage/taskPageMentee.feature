@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Task Page Navigation Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee

  Scenario: Verify mentee task page menu navigation and option visibility
    When User wait until all element successfully loaded
    Then All menu of mentee task page is displayed

  Scenario: Verify title on task page is displayed
    When User wait until all element successfully loaded
    Then mentee click Task menu
    And mentee will be landed on Task Page
    And title on task page is displayed

  Scenario: Verify description title on task page is displayed
    When User wait until all element successfully loaded
    Then mentee click Task menu
    And mentee will be landed on Task Page
    And description title on task page is displayed

  Scenario: Verify card task on task page in displayed
    When User wait until all element successfully loaded
    Then mentee click Task menu
    Then mentee will be landed on Task Page
    And card task on task page is displayed
    And point card on task page is displayed
    And due date card on task page is displayed
    And title card on task page is displayed
    And description task on task page in displayed


    Scenario: Verify specific task is displayed
      When User wait until all element successfully loaded
      Then mentee click Task menu
      Then mentee will be landed on Task Page
      And mentee click submit your task
      Then submit your task pop up window displayed
      And submit your task title is displayed
      And choose file is displayed
      And submit button is displayed



