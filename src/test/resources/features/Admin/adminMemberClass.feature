@Admin @Hanifah @Capstone4
Feature: Admin Home Page Navigation Functionality

  Background: User already login as admin
    Given User login as admin
    And User logged in as admin

  Scenario Outline: Edit Member User Filled "full name"
    Given User already on member page
    Given User input fill name by "<namemember>"
    Then User input email member by "contoh@gmail.com" and password by "Admin123#"
    Then User click choose a role
    Then User select mentor
    Then User click choose a class
    And User click add member
    And User Confirm add member
    And User Logout

    Examples:
      | namemember       |
      | Reza Fahrain     |
      | NJSANC ncsnc     |
      | fascascDNKS      |
      | 235325346N KAS   |
      | #!@$@%@#^%^ CNSA |
      | SFDSGDSV         |

  Scenario Outline: Edit Member User Filled "full name"
    Given User already on member page
    Given User input fill name by "Lee Dong Wook"
    Then User input email member by "<emailmember>" and password by "Admin123#"
    Then User click choose a role
    Then User select mentor
    Then User click choose a class
    And User click add member
    And User Confirm add member


    Examples:
      | emailmember             |
      | contoh@gmail.com        |
      | berhasil@gmail.com      |
      | apasaja@com.com.com     |
      | apasaja@COM.COM.COM     |
      | $!$%!%!@COM.COM.COM     |
      | PAKRIZA3124@COM.COM.COM |
      | 13214131352@gmail.com   |

  Scenario Outline: Edit Member User Filled "full name"
    Given User already on member page
    Given User input fill name by "Wii Haa Joon"
    Then User input email member by "contoh@gmail.com" and password by "<passwordmember>"
    Then User click choose a role
    Then User select mentee
    Then User click choose a class
    And User click add member
    And User Confirm add member
    And User Logout OK

    Examples:
      | passwordmember    |
      | Admin1123!        |
      | NonAdmin1323#@!#$ |
      | Hoax$#@121        |
      | SaintSaiya1213@   |
