Feature: Verify that user can send message using contact us form and upload a file.

  Agile User Story: As a user, when I am on the home and when I  Click on 'Contact Us' button,
  I should see 'GET IN TOUCH' is message. When I Enter name, email, subject and message and upload
  file, click 'Ok' and Click 'submit' button, I should see 'Success! Your details have been
  submitted successfully.'
  message. When I click 'Home' button I should see  home page successfully.

  Scenario: Send message and upload file

    Given I am on the home page of Automation exercise
    When  I click Contact Us button
    Then I should see GET IN TOUCH message
    When I enter name, email, subject and message
    And when I upload file
    And  when I click Ok and click submit button
    Then The I should see Success! Your details have been submitted successfully. message
    When I click Home button I should see  home page successfully.
