@Mentor
Feature: Mentor Forum Page Navigation Functionality

  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor

  Scenario: Verify on forum mentor page
    Given User click icon forum on home page mentor
    And Displayed forum page
    And Displayed title forum page

  Scenario: Verify Description title forum page
    Given User already on mentor forum page
    And Displayed description title forum page

  Scenario: Verify title card forum
    Given User already on mentor forum page
    And Displayed title card name forum

  Scenario: Verify image on card forum
    Given User already on mentor forum page
    And Displayed image profile on card name forum

  Scenario: Verify name role profile on card forum
    Given User already on mentor forum page
    And Displayed name role profile on card forum

  Scenario: Verify comment content on card forum
    Given User already on mentor forum page
    And Displayed comment field on card forum

  Scenario: Verify card forum
    Given User already on mentor forum page
    And Displayed first card forum
    And Displayed second card forum
    Then Displayed third card forum

  Scenario: Verify comment content on card forum
    Given User already on mentor forum page
    And Displayed comment content on card forum

  Scenario: Verify button load more comment on card forum
    Given User already on mentor forum page
    And Displayed comment content on card forum



