@Mentor @Riza @Capstone4
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

      Scenario: Verify name of mentor logged in displayed
        When User wait until all element successfully loaded
        Then Name of mentor displayed

      Scenario: Verify role of user logged in is displayed
        When User wait until all element successfully loaded
        Then Role of user displayed

      Scenario: Verify view all task on mentor homepage
        When User wait until all element successfully loaded
        Then View all task on mentor homepage is displayed

      Scenario: Verify Your created task title on mentor homepage
        When User wait until all element successfully loaded
        Then Your created task title on mentor homepage is displayed

      Scenario: Verify single list of task created on mentor homepage
        When User wait until all element successfully loaded
        Then Single list of task created on mentor homepage is displayed