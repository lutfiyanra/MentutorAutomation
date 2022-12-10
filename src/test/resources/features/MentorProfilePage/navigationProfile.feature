@Capstone4 @mentor @rimasya
Feature: Mentor Profile Page Navigation Functionality


  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor

  Scenario: Verify on profile mentor page
    Given User click icon profile in home page mentor
    And Displayed profile page
    And Displayed title profile page

  Scenario: Verify check the contents of the profile page
    Given User already on mentor profile page
    And from profile displays the name
    And from profile displays the role
    Then from profile displays the class

  Scenario: Verify check the contents of the profile page
    Given User already on mentor profile page
    And User click icon pen on card detail profile
    And Displayed on edit profile card

    Scenario: Verify name field on edit profile
      Given Already on edit profile card
      And verify name on edit profile card

    Scenario: Verify email field on edit profile
      Given Already on edit profile card
      And verify email on edit profile card

    Scenario: Verify password field on edit profile
      Given Already on edit profile card
      And verify password on edit profile card

    Scenario: Verify image field on edit profile
      Given Already on edit profile card
      And verify images on edit profile card

    Scenario: Verify button upload on edit profile
      Given Already on edit profile card
      And verify button upload on edit profile card

    Scenario: Verify button submit on edit profile
      Given Already on edit profile card
      And verify button submit on edit profile card



