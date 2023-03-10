package com.phoenix_library.pages;

import com.phoenix_library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class BooksSearch_PT {


        public BooksSearch_PT(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//span[.='Books']")
        public WebElement booksMenu;

        @FindBy(xpath = "//input[@type='search']")
        public WebElement searchField;

        @FindBy(xpath = "//table[@id='tbl_books']")
        public Map<WebElement, Object> searchTable;




}
