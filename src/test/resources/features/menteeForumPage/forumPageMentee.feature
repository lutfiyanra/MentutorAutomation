@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Forum Page Navigation Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee

  Scenario: Verify mentee forum page menu navigation and option visibility
    When User wait until all element successfully loaded
    Then All menu of mentee forum page is displayed

    Scenario: Verify forum page title is displayed
      When User wait until all element successfully loaded
      And mentee click Forum menu
      Then mentee will be landed on Forum Page
      And forum page title is displayed

      Scenario: Verify description title on forum page is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And description title on forum page in displayed

      Scenario: Verify forum card is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And forum card is displayed

      Scenario: Verify photo profile forum card is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And photo profile forum card is displayed

      Scenario: Verify field status forum card is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And field status forum card is displayed

      Scenario: Verify button upload images forum card is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And button upload images forum card is displayed

      Scenario: Verify button send status is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And button send status is displayed

      Scenario: Verify field comments status forum is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And field comments status is displayed

      Scenario: Verify button send comments status forum is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And button send comments status is displayed

      Scenario: Verify load more comments button is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And load more comments button is displayed

      Scenario: Verify hidden comments button is displayed
        When User wait until all element successfully loaded
        And mentee click Forum menu
        Then mentee will be landed on Forum Page
        And hidden comments button is displayed

