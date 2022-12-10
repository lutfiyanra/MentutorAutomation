@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Task Page Navigation Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee
    And User click Profile menu


  Scenario: Verify title profile mentee is displayed
    When User wait until all element successfully loaded
    Then All menu of mentee profile page is displayed
    And title profile mentee is displayed

  Scenario: Verify description title profile mentee is displayed
    When User wait until all element successfully loaded
    Then All menu of mentee profile page is displayed
    And description title profile mentee is displayed

  Scenario: Verify profile images mentee is displayed
    When User wait until all element successfully loaded
    Then All menu of mentee profile page is displayed
    And profile images mentee is displayed

  Scenario: Verify profile card mentee is displayed
    When User wait until all element successfully loaded
    Then All menu of mentee profile page is displayed
    And profile card mentee is displayed

  Scenario: Verify button edit profile is displayed
    When User wait until all element successfully loaded
    Then All menu of mentee profile page is displayed
    And button edit profile is displayed