Feature: Contact Us Form

  Agile User Story: As a user, when I am on the home page and click on 'Contact Us' button
  I should see 'GET IN TOUCH' page. When I enter my name, email, subject and message and
  Upload file and then click 'Submit' and OK button, I should see 'Success! Your details have been submitted successfully.'
  success message. When I click 'Home' button, I should go to home page successfully.

  @case6
  Scenario: Contact Form
    Given I am on the home page of Automation exercise
    When I click on Contact Us button
    Then I should see  GET IN TOUCH page
    When I enter my name, email, subject and message
    When I upload file
    And I click Submit button
    And I click OK button
    Then I should see  Success! Your details have been submitted successfully. message


