@Admin @Hanifah @Capstone4
Feature: Admin Home Page Navigation Functionality

  Background: User already login as admin
    Given User login as admin
    And User logged in as admin


  Scenario: Edit Profile User Close Pop Up
    When User wait until all element in admin successfully loaded
    Then User click three dots buttom
    Then User click Edit for Profile User
    And User close edit profile user


  Scenario: Edit Profile User Delete Cancel
    Given User wait until all element in admin successfully loaded
    Then User click three dots buttom
    Then User click Delete for Profile User
    And User select Cancel

  Scenario: Edit Profile User Delete
    Given User wait until all element in admin successfully loaded
    Then User click three dots buttom
    Then User click Delete for Profile User
    And User select Yes Delete

  Scenario Outline: Edit Profile User Filled "your name"
    Given User already on admin home page
    Then User click three dots buttom
    Then User click Edit for Profile User
    Given User input your name by "<name>"
    Then User input email by "contoh@gmail.com" and password by "Admin123#"
    Then User click class
    Then User select bahasa alien in list
    And User click submit
    And User click OK
    Examples:
      | name         |
      | Reza Fahrain |
      | NJSANC ncsnc |
      | fascasc      |
      | 235325346    |
      | #!@$@%@#^%^  |
      | SFDSGDSV     |

  Scenario: Edit Profile User Filled "your name" Nothing
    Given User already on admin home page
    Then User click three dots buttom
    Then User click Edit for Profile User
    Given User input your name by ""
    Then User input email by "contoh@gmail.com" and password by "Admin123#"
    Then User click class
    Then User select bahasa alien in list
    And User click submit
    And User click OK

  Scenario Outline: Edit Profile User Filled "email"
    Given User already on admin home page
    Then User click three dots buttom
    Then User click Edit for Profile User
    Given User input your name by "Reza Fahrain"
    Then User input email by "<email>" and password by "Admin123#"
    Then User click class
    Then User select bahasa alien in list
    And User click submit
    And User click OK
    Examples:
      | email                    |
      | contoh@gmail.com         |
      | berhasil@gmail.com       |
      | apasaja@com.com.com      |
      | apasaja@COM.COM.COM      |
      | $!$%!%!@COM.COM.COM      |
      | PAKRIZA3124@COM.COM.COM  |
      | PAKRIZA3124@COM@.COM.COM |
      | 13214131352@gmail.com    |

  Scenario Outline: Edit Profile User Filled "password"
    Given User already on admin home page
    Then User click three dots buttom
    Then User click Edit for Profile User
    Given User input your name by "Reza Fahrain"
    Then User input email by "contoh@gmail.com" and password by "<password>"
    Then User click class
    Then User select bahasa alien in list
    And User click submit
    And User click OK
    Examples:
      | password                         |
      | 13214131352                      |
      | fnhjkasnfka                      |
      | 5125246458fnhjkasnfka            |
      | 5125246458NJKWNFJkasnfka         |
      | NJKWNFJ                          |
      | NJKWNFJ3124125                   |
      | !@$!@%#$@&                       |
      | 5125246458NJKWNFJkasnfka!@$%!#@% |
      | 5125246458NJKWNFJkaska!@$%!#@%   |
      | 5125KWNFJkaska!@$%!#@%           |
      | 13Jka@%                          |
      | 13Jk@%3 |

  Scenario: Home Navigation can be click
    When User wait until all element in admin successfully loaded
    Then User home icon

