@Capstone4 @mentor @rimasya
Feature: Mentor Forum Page Navigation Functionality


  Background: User already login as mentor
  Given User login as mentor for edit
    And User logged in as mentor

  Scenario: User can be click field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User click name field on edit page profile

  Scenario: User can be click field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User click email field on edit page profile

  Scenario: User can be click field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User click password field on edit page profile

  Scenario: User can be input alphabet in field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input "testing" in field name on edit page profile

  Scenario: User can be input alphabet in field email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input "testing" in field email on edit page profile

  Scenario: User can be input alphabet in field password on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input "testpassword" in field password on edit page profile

  Scenario: User can be input numeric in field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input numeric "123455667" in field name on edit page profile

  Scenario: User can be input numeric in field email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input numeric "9967832" in field email on edit page profile

  Scenario: User can be input alphabet in field password on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input numeric "6537297868324" in field password on edit page profile

  Scenario: User can be input special character in field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input special character "@#$%^" in field name on edit page profile

  Scenario: User can be input special character in field email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input special character "@#$%^" in field email on edit page profile

  Scenario: User can be input special character in field password on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input special character "@#$%^" in field password on edit page profile

  Scenario: User can be input combination in field name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input combination "test99@!" in field name on edit page profile

  Scenario: User can be input combination in field email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input combination "test99@!" in field email on edit page profile

  Scenario: User can be input combination in field password on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    Then User input combination "test99@!" in field password on edit page profile

    @success

  Scenario: User can be change name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    And User input change to "Rima Testing aja" in field name on edit page profile
    When User click send button
    And Displayed popup card success update
    And Displayed icon popup success update
    And Displayed title popup success update
    Then User click oke on popup success


  Scenario: User can be change email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    And User input change to "testing.rimaaja@gmail.com" in field email on edit page profile
    When User click send button
    And Displayed popup card success update
    And Displayed icon popup success update
    And Displayed title popup success update
    Then User click oke on popup success

#  Bug
  Scenario: User can be update image on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    And User select image on edit page profile
    When User click send button
    And Displayed popup card success update
    And Displayed icon popup success update
    And Displayed title popup success update
    Then User click oke on popup success

    @invalid

  Scenario: User can't be change name on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    And User input invalid name with numeric "1234" in field name on edit page profile
    When User click send button
    And Displayed popup card failed update
    And Displayed icon popup failed update
    And Displayed title popup failed update
    Then User click oke on popup failed

  Scenario: User can't be change email on edit page profile
    Given User click icon profile in home page mentor
    And User click icon pen on card detail profile
    And User input invalid email with numeric "testing.rimaaja@gmail" in field email on edit page profile
    When User click send button
    And Displayed popup card failed update
    And Displayed icon popup failed update
    And Displayed title popup failed update
    Then User click oke on popup failed

