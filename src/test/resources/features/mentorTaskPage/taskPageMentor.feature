@Mentor
  Feature: Mentor Task Page Functionality

    Background: User already login as mentor
      Given User login as mentor
      And User logged in as mentor on Task page
      And User already on task page

    Scenario: Verify mentor task page menu navigation and option visibility
      When User wait until all element successfully loaded
      Then All navbar menu of mentor task page is displayed

    Scenario: Verify mentor Create Task title is visible
      When User wait until all element successfully loaded
      Then Create Task title is can be seen

    Scenario: Verify mentor Give The Task to Mentee
      When User wait until all element successfully loaded
      Then Give The Task to Mentee can be seen

    Scenario: Verify mentor Task Title and Title field
      When User wait until all element successfully loaded
      Then Mentor Title and Title field can be seen

    Scenario: Verify mentor Task Description and Description field
      When User wait until all element successfully loaded
      Then Mentor Task Description and Description Field can be seen

    Scenario: Verify mentor Task Due Date and Due Date field
      When User wait until all element successfully loaded
      Then Mentor Task Due Date and Due Date field can be seen

    Scenario: Verify mentor Attachment and Attachment field
      When User wait until all element successfully loaded
      Then Mentor Task Attachment and Attachment field can be seen

    Scenario: Verify mentor Image Attachment and Attachment field
      When User wait until all element successfully loaded
      Then Mentor Image Attachment and Attachment field can be seen

    Scenario: Verify mentor Add Task Button
      When User wait until all element successfully loaded
      Then Mentor Add Task Button can be seen

