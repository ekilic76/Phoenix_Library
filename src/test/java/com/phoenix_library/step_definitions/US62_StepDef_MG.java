package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.US62_UserPage_MG;
import com.phoenix_library.utilities.BrowserUtils;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US62_StepDef_MG {


    US62_UserPage_MG page = new US62_UserPage_MG();

    @Given("I click on Users link")
    public void i_click_on_users_link() {

        page.userClick.click();

    }
    @When("I select Show {string} records")
    public void i_select_show_records(String expected) {

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='tbl_users_length']")));

        select.selectByValue(expected);






    }
    @Then("show records value should be {string}")
    public void show_records_value_should_be(String showing) {

        Assert.assertTrue((page.showRecord.getText().contains("1 to "+showing)));


    }
    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String expectedRecords) {



        int count=0;

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        for(WebElement row: rows){
            if(row.isDisplayed())
                count++;
        }



        Assert.assertTrue(rows.size()==Integer.parseInt(expectedRecords));

        System.out.println("The number of rows that are visible is: "+ count);



    }




}
