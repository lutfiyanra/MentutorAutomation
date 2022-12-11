@Admin @Hanifah @Capstone4
Feature: Admin Input Class Navigation Functionality

  Background: User already login as admin
    Given User login as admin
    And User logged in as admin

  Scenario: Input Class with nothing
    When User wait until all element in admin successfully loaded
    Then User Input Class icon
    Given User Input Class ""
    And User Click add

  Scenario Outline: Input Class with less 5 character
    When User wait until all element in admin successfully loaded
    Then User Input Class icon
    Given User Input Class "<clas>"
    And User Click add
    Examples:
      | clas |
    |123   |
    |dda   |
    |ASD   |
    |xxx   |


  Scenario Outline: Input Class
    When User wait until all element in admin successfully loaded
    Then User Input Class icon
    Given User Input Class "<clas>"
    And User Click add
    And User Confirm
    Examples:
      | clas          |
      | Katanya Kelar |
      | @Katanya 123  |
    |BJABXJ !@!#    |
    |~~~~~~~~       |


  Scenario: Edit Class User Close Pop Up
    When User wait until all element in admin successfully loaded
    Then User Input Class icon
    Then User click three dots buttom input class
    Then User click Edit Class
    And User close edit Class


  Scenario: Edit Class User Delete Cancel
    Given User wait until all element in admin successfully loaded
    Then User Input Class icon
    Then User click three dots buttom input class
    Then User click Delete Class
    And User select Cancel Delete

  Scenario: Edit Profile User Delete
    Given User wait until all element in admin successfully loaded
    Then User Input Class icon
    Then User click three dots buttom input class
    Then User click Delete Class
    And User select Yes Delete Class


  Scenario: Edit Profile User Delete
    Given User wait until all element in admin successfully loaded
    Then User Input Class icon
    Then User click three dots buttom input class
    Then User click Edit Class
    Then Click dropdown status
    Then Click active status
    Then Click submitt Edit Class
    Then Click confirm Edit Class


  Scenario: Edit Profile User Delete
    Given User wait until all element in admin successfully loaded
    Then User Input Class icon
    Then User click three dots buttom input class
    Then User click Edit Class
    Then Click dropdown status
    Then Click non_active status
    Then Click submitt Edit Class
    Then Click confirm Edit Class

























