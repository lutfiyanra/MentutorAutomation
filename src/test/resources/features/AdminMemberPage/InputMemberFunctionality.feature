@Capstone4 @admin @rimasya
Feature: Admin Member Page Navigation Functionality

  Background: User already login as admin
    Given User login as admin
    And User logged in as admin

  Scenario: User can be click name field on input member page
    Given User click icon input member on admin home page
    Then User click name field on on input member page

  Scenario: User can be click email field on input member page
    Given User click icon input member on admin home page
    Then User click email field on on input member page

  Scenario: User can be click role dropdown on input member page
    Given User click icon input member on admin home page
    Then User click role dropdown on on input member page

  Scenario: User can be click class dropdown on input member page
    Given User click icon input member on admin home page
    Then User click class dropdown on on input member page

  Scenario: User can be click password field on input member page
    Given User click icon input member on admin home page
    Then User click password field on on input member page