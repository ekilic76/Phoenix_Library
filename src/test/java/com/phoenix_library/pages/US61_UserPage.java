package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class US61_UserPage{

    public US61_UserPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[.='Users']")
    public WebElement userLink;

    public void showDropdown(Integer expectedNumber){
        WebElement showDropdown = Driver.getDriver().findElement(By.name("tbl_users_length"));
        Select select = new Select(showDropdown);
        select.selectByIndex(3);
    }


    @FindBy(xpath = "//option[.='50']")
    public WebElement recordValue;





}
