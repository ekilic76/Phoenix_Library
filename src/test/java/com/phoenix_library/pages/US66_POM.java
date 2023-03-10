package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US66_POM {

       public US66_POM() {
           PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userlink;

    @FindBy(xpath = " //input[@type='search']")
    public WebElement serachId;

    @FindBy(xpath = "//tr[@class='odd']/td[2]")
    public WebElement userId;

    @FindBy(xpath = "//tr[@class='odd']/td[3]")
    public WebElement fullname;

    @FindBy(xpath = "//tr[@class='odd']/td[4]")
    public WebElement email;



}
