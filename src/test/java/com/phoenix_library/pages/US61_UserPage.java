package com.phoenix_library.pages;


import com.phoenix_library.utilities.BrowserUtils;
import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US61_UserPage {

    public US61_UserPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;


    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement recordDropdown;


}



