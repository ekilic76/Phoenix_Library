package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.US61_UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US61_UserInfo_StepDefs_SK {

    US61_UserPage userPage = new US61_UserPage();


    @Given("I click on {string} link")
    public void i_click_on_link(String user) {
       userPage.userLink.click();
    }
    @When("I select Show {int} records")
    public void i_select_show_records(Integer int1) {

    }
    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer int1) {

    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer int1) {

    }


}
