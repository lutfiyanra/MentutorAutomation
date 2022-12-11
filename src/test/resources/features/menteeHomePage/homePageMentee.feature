@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Home Page Navigation Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee

  Scenario: Verify mentee homepage menu navigation and option visibility
    When User wait until all element successfully loaded
    Then All menu of mentee homepage is displayed

  Scenario: Verify name of mentee logged in displayed
    When User wait until all element successfully loaded
    Then Name of mentee displayed

  Scenario: Verify button view all your task in home page
    When mentee click button view all your task
    Then mentee will be landed on Task Page

  Scenario: Verify task navigation can be clicked
    When mentee click Task menu
    Then mentee will be landed on Task Page

  Scenario: Verify forum navigation can be clicked
    When mentee click Forum menu
    Then mentee will be landed on Forum Page

  Scenario: Verify profile navigation can be clicked
    When mentee click Profile menu
    Then mentee will be landed on Profile Page

  Scenario: Verify status of mentee logged in displayed
    When User wait until all element successfully loaded
    Then status of mentee displayed

  Scenario: Verify title on logged in displayed
    When User wait until all element successfully loaded
    Then title on logged in displayed

  Scenario: Verify description title on logged in displayed
    When User wait until all element successfully loaded
    Then description title on logged in displayed

  Scenario: Verify photo profile on logged in displayed
    When User wait until all element successfully loaded
    Then photo profile on logged in displayed

