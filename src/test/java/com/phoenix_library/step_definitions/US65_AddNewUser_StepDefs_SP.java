package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.US65_UserPage_SP;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.Map;

public class US65_AddNewUser_StepDefs_SP {

    US65_UserPage_SP userPage = new US65_UserPage_SP();

    @Given("click on {string} module")
    public void click_on_module(String string) {
        userPage.userLink.click();
    }
    @When("user click on the Add Users")
    public void user_click_on_the_add_users() {
        userPage.addUserButton.click();
    }
    @Then("dialog field must have matching placeholder")
    public void dialog_field_must_have_matching_placeholder(Map<String, String>userInfo) {

        for (Map.Entry<String, String> entry : userInfo.entrySet()) {

            String k = entry.getKey();
            String v = entry.getValue();
            if (k.equals("address")){
                Assert.assertEquals(v,null);
                break;
            }

            Assert.assertEquals(Driver.getDriver().findElement(By.name(k)).getAttribute("placeholder"), v);

        }

    }

}
