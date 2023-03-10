package com.cydeo.step_definitions;

import com.cydeo.pages.AutomationPracticePage;
import com.cydeo.pages.AutomationPracticePage2;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.awt.*;


public class testCase6_StepDefinitions {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();



 @When("I click on Contact Us button")
 public void i_click_on_contact_us_button() {
  automationPracticePage.contactUsButton.click();

 }
 @Then("I should see  GET IN TOUCH page")
 public void i_should_see_get_in_touch_page() {
 Assert.assertTrue(automationPracticePage.getInTouchText.isDisplayed());

 }
 @When("I enter my name, email, subject and message")
 public void i_enter_my_name_email_subject_and_message() {
  automationPracticePage.getNameBox.sendKeys("Cilve");
automationPracticePage.getEmailBox.sendKeys("cilve@email.com");
automationPracticePage.getSubjectBox.sendKeys("Cat Toys and Food");
automationPracticePage.messageArea.sendKeys("I need to more cat toys and food, please. Meow.");

 }
 @When("I upload file")
 public void i_upload_file() {
  //automationPracticePage.chooseFileBtn.click();

String filePath="C:\\Users\\Nazlican\\Desktop\\New Text Document (2).txt";

automationPracticePage.chooseFileBtn.sendKeys( filePath);

  BrowserUtils.sleep(2);


 }
 @When("I click Submit button")
 public void i_click_submit_button() {
 automationPracticePage.submitButton.click();

 }
 @When("I click OK button")
 public void i_click_ok_button() {
  BrowserUtils.sleep(2);
  Alert alert= Driver.getDriver().switchTo().alert();
  alert.accept();

 }
 @Then("I should see  Success! Your details have been submitted successfully. message")
 public void i_should_see_success_your_details_have_been_submitted_successfully_message() {
Assert.assertTrue(automationPracticePage.successMessage.isDisplayed());

 }

}
