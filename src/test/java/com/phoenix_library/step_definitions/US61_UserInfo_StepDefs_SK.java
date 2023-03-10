package com.phoenix_library.step_definitions;


import com.phoenix_library.pages.US61_UserPage;
import com.phoenix_library.utilities.BrowserUtils;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US61_UserInfo_StepDefs_SK {

    US61_UserPage userPage = new US61_UserPage();

    @Given("I click on User link")
    public void i_click_on_user_link() {
        userPage.userLink.click();

    }

    @When("I selected Show {string} records")
    public void i_selected_show_records(String value) {

        Select recordValue = new Select(userPage.recordDropdown);
        recordValue.selectByValue(value);

    }

    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer expectedValue) {

        boolean actualValue = userPage.recordDropdown.isDisplayed();

        BrowserUtils.sleep(2);

        Assert.assertTrue(actualValue);

    }

    @Then("the user table must display {string} records")
    public void the_users_table_must_display_records(String expectedRecords) {

        int count = 0;

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        for (WebElement row : rows) {
            if (row.isDisplayed())
                count++;
        }


        Assert.assertTrue(rows.size() == Integer.parseInt(String.valueOf(expectedRecords)));

        System.out.println("The number of rows that are visible is: " + count);

    }

}