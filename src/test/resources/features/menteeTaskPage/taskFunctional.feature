@Capstone4 @Mentee @RezkiAdina
Feature: Mentee Task Page Navigation Functionality

  Background: User already login as mentee
    Given User login as mentee
    And User logged in as mentee
    When User wait until all element successfully loaded
    Then mentee click Task menu
    And mentee will be landed on Task Page

#    Scenario: Input file pdf
#      When mentee click submit your task button
#      Then mentee input file pdf on task page
#      Then mentee click send button
#  Bug karena input task tidak bisa di automation karena selector
#  berubah-ubah sesuai dengan task inputan terbaru
