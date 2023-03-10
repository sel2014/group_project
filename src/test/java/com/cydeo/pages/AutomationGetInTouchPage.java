package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationGetInTouchPage  {

    public AutomationGetInTouchPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2)[2]")
    WebElement getInTouchHeader;

    @FindBy (xpath = "(//input[@type='email'])[1]")
    WebElement getInTouchEmailBox;

    @FindBy(xpath = "//input[@name='subject']")
    WebElement subjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement chooseFile;
    //String filePath = "\"C:\\Users\\sel20\\OneDrive\\Desktop\\Screenshot_20230111_135327.png\"";
    //chooseFile.sendKeys(filePath)

    //------------ below locators may be in a different page---------

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;

    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    WebElement homeButton;







}
