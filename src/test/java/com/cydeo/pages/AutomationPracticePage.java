package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.x500.X500Principal;

public class AutomationPracticePage {

    public AutomationPracticePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "h1")
    public WebElement pageTitle;

 @FindBy(xpath = "(//h2)[1]")
 public WebElement loginPageTitle;

   @FindBy(xpath = "/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")
   public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[.=\"Login to your account\"]")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//*[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement newUserEmailBox;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[1]")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "(//*[.='Enter Account Information'])[2]")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement titleMr;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsLetterBox;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement specialOffersBox;

    //12. Fill details: First name, Last name, Company, Address,
    // Address2, Country, State, City, Zipcode, Mobile Number

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyBox;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1Box;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Box;


    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//*[.='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAsUserNameText;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "(//*[.='Account Deleted!'])[2]")
    public WebElement accountDeletedMessage;

//    @FindBy(id = "dismiss-button")
//    public WebElement dismissButton;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIsIncorrectMessage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
 public WebElement emailAlreadyExistMessage;

    @FindBy(xpath ="//a[@href='/contact_us']" )
 public WebElement contactUsButton;

    @FindBy(xpath = "//h2[.='Get In Touch']")
 public WebElement getInTouchText;

    @FindBy (xpath = "//input[@placeholder='Name']")
 public WebElement getNameBox;

    @FindBy(xpath = "//input[@placeholder='Email']")
 public WebElement getEmailBox;

    @FindBy(xpath = "//input[@placeholder='Subject']")
 public WebElement getSubjectBox;

    @FindBy(xpath = "//textarea[@placeholder='Your Message Here']")
 public WebElement messageArea;

    @FindBy(xpath = "//input[@type='file']")
 public WebElement chooseFileBtn;

    @FindBy(xpath = "//input[@type='submit']")
 public WebElement submitButton;

 @FindBy(xpath = "//div[@class='status alert alert-success']")
 public WebElement successMessage;



















}
