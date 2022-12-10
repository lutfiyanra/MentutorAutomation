@Capstone4 @Mentor @Riza
Feature: Mentor Home Page Navigation Functionality

  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor

  Scenario: Verify Task navigation menu can be clicked and navigate user
    When User click Task menu
    Then User will be landed on Create Task Page

  Scenario: Verify Forum navigation menu can be clicked and navigate user
    When User click Forum menu
    Then User will be landed on Forum Page

  Scenario: Verify Profile navigation menu can be clicked and navigate user
    When User click Profile menu
    Then User will be landed on Mentor Profile Page

  Scenario: Verify View All Task menu can be clicked and navigate user
    When User click View All Task menu
    Then User will be landed on Task Menu