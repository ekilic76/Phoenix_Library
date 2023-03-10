package com.phoenix_library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US65_UserPage_SP extends BasePage{

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

    //add user button
    @FindBy(xpath="//a[@data-target='#ajax']")
    public WebElement addUserButton;

}