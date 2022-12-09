@Mentor
  Feature: Mentor Task Page Functionality

    Background: User already login as mentor
      Given User login as mentor
      And User logged in as mentor

    Scenario: Verify mentor task page menu navigation and option visibility
      When User wait until all element successfully loaded
      Then All menu of mentor task page is displayed