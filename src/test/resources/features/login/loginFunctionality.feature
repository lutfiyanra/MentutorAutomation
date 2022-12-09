@Mentor
Feature: Login As a Mentor

  Scenario: Valid login as Admin
    Given User open the web page
    When User input "admin.mentutor@gmail.com" as eMail and "Admin123$" as password
    Then User click login button
    And Click OK button

  Scenario: Valid login as Mentor
    Given User open the web page
    When User input "mentor.lutfiyanra@gmail.com" as eMail and "TesDicoba1!" as password
    Then User click login button
    And Click OK button

  Scenario: Valid login as Mentee
    Given User open the web page
    When User input "dara.mentee@gmail.com" as eMail and "Nafisa123$" as password
    Then User click login button
    And Click OK button

  Scenario: Invalid login with unregistered credential
    Given User open the web page
    When User input "bukanadmin.mentutor@gmail.com" as eMail and "BukanAdmin123$" as password
    And User click login button
    Then User failed to login
    And Appear "Invalid email or password" on login page

  Scenario: Invalid login with empty email
    Given User open the web page
    When User input "" as eMail and "Admin123$" as password
    And User click login button
    Then User failed to login
    And Appear email required error message on login page

  Scenario: Invalid login with empty password
    Given User open the web page
    When User input "fauzan.mentor@gmail.com" as eMail and "" as password
    And User click login button
    Then User failed to login
    And Appear password required error message on login page

  Scenario: Invalid login with empty email and password
    Given User open the web page
    When User input "" as eMail and "" as password
    And User click login button
    Then User failed to login
    And Appear email is required error message on login page
    And Appear password is required error message on login page