package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends BasePage{

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "select[name='tbl_users_length']")
    public WebElement recordsDropDown;



}
