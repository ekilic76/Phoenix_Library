package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class US62_UserPage_MG {

    public US62_UserPage_MG() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userClick;




    public void selected(){


        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='tbl_users_length']")));



       // select.selectByValue(str);


    }

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement selectRecords;



    @FindBy(xpath = "//div[@id='tbl_users_info']")
    public WebElement showRecord;



    @FindBy(xpath = "//tbody")
    public WebElement tBody;



}
