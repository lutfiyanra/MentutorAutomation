@Capstone4 @mentor @rimasya
Feature: Mentor Forum Page Navigation Functionality


  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor

  Scenario: User can be click field comment on forum card
    Given User click icon forum on home page mentor
    Then User click comment field on forum card

  Scenario: User can be input alphabet in field comment on forum card
    Given User click icon forum on home page mentor
    Then User input "testing" in comment field on forum card

  Scenario: User can be input numeric in field comment on forum card
    Given User click icon forum on home page mentor
    Then User input "12435678" in comment field on forum card

  Scenario: User can be input special character in field comment on forum card
    Given User click icon forum on home page mentor
    Then User input "!@#$%" in comment field on forum card

  Scenario: User can be input combination in field comment on forum card
    Given User click icon forum on home page mentor
    Then User input "testing123!@#" in comment field on forum card

  Scenario: User can be input combination in field comment on forum card
    Given User click icon forum on home page mentor
    And User input "testing comment" in comment field on forum card
    Then User click send comment button

  Scenario: User can be input combination in field comment on forum card
    Given User click icon forum on home page mentor
    And User input "tes" in comment field on forum card
    When User click send comment button

  Scenario: Verify content comment on forum card
    Given User click icon forum on home page mentor
    And Displayed image profile on content comment
    And Displayed name profile on content comment
    And Displayed role profile on content comment
    Then Displayed conten comment