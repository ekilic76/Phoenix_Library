package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.LoginPage;
import com.phoenix_library.pages.US61_UserPage;
import com.phoenix_library.pages.UsersPage;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class US63_StepDefs_AM {
    LoginPage login = new LoginPage();
    US61_UserPage users = new US61_UserPage();
    UsersPage usersPage = new UsersPage();

    @Given("I login as a librarian And I click on {string} link")
    public void i_login_as_a_librarian_and_i_click_on_link(String string){
        login.userName.sendKeys("librarian11@library");
        login.password.sendKeys("libraryUser");
        login.submit.click();
        users.userLink.click();
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) throws InterruptedException {
        usersPage.searchBox.sendKeys(searchTerm + Keys.ENTER);
        Thread.sleep(5000);
    }

    @Then("table should contain rows with {string}")
    public void tableShouldContainRowsWith(String keyWord) {
        List<WebElement> tablesRows = Driver.getDriver().findElements(By.xpath("//tbody//tr"));

        for (WebElement eachRow : tablesRows) {
            String eachRowsData = eachRow.getText();

            if(eachRowsData.contains(keyWord)){
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }

    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> data) {
        List<WebElement> row = Driver.getDriver().findElements(By.xpath("//thead//tr//th"));
        List<String> elementNames = new ArrayList<>();

        for (WebElement each : row) {
            String eachName = each.getText();
            elementNames.add(eachName);
        }
        Assert.assertEquals(data, elementNames);
    }


}
