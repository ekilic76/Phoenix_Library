package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.US59_userPage_BB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US59_StepDef_BB {


    US59_userPage_BB userPage_bb= new US59_userPage_BB();


    @When("i click on {string} link")
    public void i_click_on_link(String string) {

        userPage_bb.userLink.click();



    }
    @Then("each users id should be unique")
    public void each_users_id_should_be_unique() {

    }


}
