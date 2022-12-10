Feature: Task Functionality for Mentor role

  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor on Task page
    And User already on task page

  Scenario:  Verify user can not create new task with empty input on Title Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "" as Task Title
    And User click on Description Field
    And User input "Buat Tugas tanpa Judul" as Task Description
    And User click on Due Date Field
    And User input "2022-12-26" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task with empty input on Title field can not be created

  Scenario:  Verify user can not create new task with invalid input on Title Field by Numeric
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "12345 1234 123" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan Inputan Numerik" as Task Description
    And User click on Due Date Field
    And User input "2022-12-26" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task with empty input on Title field can not be created


  Scenario:  Verify user can not create new task with empty input on Description Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Buat Tugas Tanpa Deskripsi" as Task Title
    And User click on Description Field
    And User input "" as Task Description
    And User click on Due Date Field
    And User input "2022-12-27" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task with empty input on Description field can not be created

  Scenario:  Verify user can not create new task with empty input on Task Due Date Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Buat Tugas Tanpa Due Date" as Task Title
    And User click on Description Field
    And User input "Due Datenya Kosong" as Task Description
    And User click on Due Date Field
    And User input "" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task with empty input on Due Date field can not be created

