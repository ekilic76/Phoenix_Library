package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.UsersPage;
import com.phoenix_library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class US60_StepDefs_EE {

    UsersPage usersPage = new UsersPage();

    @When("the user clicks on {string} link")
    public void the_user_clicks_on_link(String string) {

    usersPage.usersLink.click();
    BrowserUtils.sleep(5);
    }

    @Then("show records default value should be {int}")

    public void show_records_default_value_should_be(Integer int1) {
        Select dropDown = new Select(usersPage.recordsDropDown);

        String actualOption = dropDown.getFirstSelectedOption().getText();
        String expectedOption = "10";
        Assert.assertEquals(actualOption, expectedOption);
    }

    @Then("show record should have following options:")
    public void show_record_should_have_following_options(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(usersPage.recordsDropDown);

        actualOptions = Collections.unmodifiableList(actualOptions);

        Assert.assertEquals(actualOptions, expectedOptions);

    }

}

