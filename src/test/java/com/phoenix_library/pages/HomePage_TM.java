package com.phoenix_library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_TM extends LoginPage{

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement books;

}
