package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US70_Bota {
    public US70_Bota() {
        PageFactory.initElements(Driver.getDriver(),this );
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement users;

    @FindBy (xpath = "//span[.='Books']")
    public WebElement books;

    @FindBy (xpath = "(//a[@class='nav-link'])[1]")
    public WebElement dashboard;


   public void clickUsersLink() {
       users.click();
   }
    public void clickBooksLink() {
        books.click();
    }
    public void clickDash() {
        users.click();
    }





}
