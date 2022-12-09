@Mentor
  Feature: UI Test on Mentor Homepage

    Background: User already login as mentor
      Given User login as mentor
      And User logged in as mentor

      Scenario: Verify hero image on mentor homepage
        When User wait until all element successfully loaded
        Then Hero image on mentor homepage can be seen

      Scenario: Verify Title text beside image hero on mentor homepage
        When User wait until all element successfully loaded
        Then Title text beside image hero on mentor homepage can be seen

      Scenario: Verify Description text beside image hero on mentor homepage
        When User wait until all element successfully loaded
        Then Description text beside image hero on mentor homepage can be seen