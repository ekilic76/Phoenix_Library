package com.phoenix_library.pages;



import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   

    @FindBy(xpath = "//input[@type='email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")

    public WebElement submit;

    @FindBy(xpath = "//span[contains(text(),'Test')]")
    public WebElement expectedName;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
