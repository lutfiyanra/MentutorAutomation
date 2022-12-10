@Mentor @Riza @Capstone4
Feature: Create Task Functionality for Mentor role

  Background: User already login as mentor
    Given User login as mentor
    And User logged in as mentor on Task page
    And User already on task page

  Scenario: Verify user can create new task with all field valid input and file attachment
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes1 Tugas Pake Tambahan Input File Dokumen" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan valid input dengan tambahan file dokumen" as Task Description
    And User click on Due Date Field
    And User input "2023-01-13" as Task Due Date
    And User input document attachment
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

  Scenario: Verify user can create new task with all field valid input and image attachment
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes2 Tugas Pake Tambahan Input File Gambar" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan valid input dengan tambahan file gambar" as Task Description
    And User click on Due Date Field
    And User input "2023-01-13" as Task Due Date
    And User input image attachment
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

  Scenario: Verify user can create new task with all field valid input and file and image attachments
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes3 Tugas Pake Tambahan Input File Dokumen dan Gambar" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan valid input dengan tambahan file dokumen dan gambar" as Task Description
    And User click on Due Date Field
    And User input "2023-01-13" as Task Due Date
    And User input document attachment
    And User input image attachment
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

  Scenario:  Verify user can create new task with alphabet input on Title Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes4 Tugas Pake Alphabet" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan valid input by alphabet" as Task Description
    And User click on Due Date Field
    And User input "2023-01-13" as Task Due Date
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

    #kosong pada field title
  Scenario:  Verify user can not create new task with empty input on Title Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "" as Task Title
    And User click on Description Field
    And User input "Buat Tugas tanpa Judul" as Task Description
    And User click on Due Date Field
    And User input "2023-01-14" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

    #numeric pada field title
  Scenario:  Verify user can not create new task with invalid input on Title Field by Numeric
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "12345 1234 123" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan Inputan Numerik" as Task Description
    And User click on Due Date Field
    And User input "2023-01-15" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

    #specialchar pada field title
  Scenario:  Verify user can not create new task with invalid input on Title Field by Special Char
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "!@#$% ^&*()" as Task Title
    And User click on Description Field
    And User input "Buat Tugas dengan Inputan Special Char" as Task Description
    And User click on Due Date Field
    And User input "2023-01-16" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

  Scenario:  Verify user can create new task with valid input by alphabet on Description Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes5 Buat Tugas Inputan Alphabet Deskripsi" as Task Title
    And User click on Description Field
    And User input "Ini deskripsi dengan inputan valid yaa" as Task Description
    And User click on Due Date Field
    And User input "2023-01-18" as Task Due Date
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

    #kosong pada description title
  Scenario:  Verify user can not create new task with empty input on Description Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes6 Buat Tugas Tanpa Deskripsi" as Task Title
    And User click on Description Field
    And User input "" as Task Description
    And User click on Due Date Field
    And User input "2023-01-17" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

    #numeric pada description field
  Scenario:  Verify user can not create new task with invalid input by numeric on Description Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes7 Buat Tugas Inputan Numerik Deskripsi" as Task Title
    And User click on Description Field
    And User input "123123" as Task Description
    And User click on Due Date Field
    And User input "2023-01-18" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

    #specialchar pada description field
  Scenario:  Verify user can not create new task with invalid input by special char on Description Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes8 Buat Tugas Inputan Special Char Deskripsi" as Task Title
    And User click on Description Field
    And User input "!@#$ !@#$%()" as Task Description
    And User click on Due Date Field
    And User input "2023-01-14" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

  Scenario:  Verify user can create new task with valid input on Task Due Date Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes9 Buat Tugas Tanpa Due Date" as Task Title
    And User click on Description Field
    And User input "Due Datenya Valid Input" as Task Description
    And User click on Due Date Field
    And User input "2023-02-13" as Task Due Date
    And User click Add button
    Then Appear Task Created PopUp Message
    And The new task successfully created

    #empty pada due date
  Scenario:  Verify user can not create new task with empty input on Task Due Date Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes10 Buat Tugas Tanpa Due Date" as Task Title
    And User click on Description Field
    And User input "Due Datenya Kosong" as Task Description
    And User click on Due Date Field
    And User input "" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

  Scenario: Verify user can not create new task with past date input on Task Due Date Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes11 Buat Tugas Past Due Date" as Task Title
    And User click on Description Field
    And User input "Due Datenya Sudah Berlalu" as Task Description
    And User click on Due Date Field
    And User input "2021-12-13" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created

  Scenario: Verify user can not create new task with invalid date input format on Task Due Date Field
    When User wait until all element successfully loaded
    And User click on Task Title Field
    And User input "Tes12 Buat Tugas Invalid Format Due Date" as Task Title
    And User click on Description Field
    And User input "Due Datenya Sudah Berlalu" as Task Description
    And User click on Due Date Field
    And User input "12-13-2021" as Task Due Date
    And User click Add button
    Then Appear Invalid Input From Client Error Message
    And The new task can not be created