@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Forum Page Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee
    And mentee click Forum menu
    When User wait until all element successfully loaded
    Then All menu of mentee forum page is displayed

#bug karena selector berubah-ubah

    Scenario: input status on forum page with alphabet
      When mentee input "aaabbbcccdddd" on field status
      Then mentee click button send

    Scenario: input status on forum page with numeric
      When mentee input "123456789" on field status
      Then mentee click button send

    Scenario: input status on forum page with special character
      When mentee input "!@#$%^&*()_+" on field status
      Then mentee click button send



