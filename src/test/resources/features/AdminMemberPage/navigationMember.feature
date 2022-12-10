@Capstone4 @admin @rimasya
Feature: Admin Member Page Navigation Functionality

  Background: User already login as admin
    Given User login as admin
    And User logged in as admin

  Scenario: Verify admin can be click icon input member page
    Given User click icon input member on admin home page
    And Displayed input member page
    And Displayed title member page
    Then Displayed description title member page

  Scenario: Verify is displayed card input member page
    Given User click icon input member on admin home page
    And Displayed card input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    And Displayed name title input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    And Displayed email title input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    And Displayed email title input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    And Displayed role title input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    And Displayed class title input member page

  Scenario: Verify is displayed detail input member page
    Given User click icon input member on admin home page
    Then Displayed button add input member page

