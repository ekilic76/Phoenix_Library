package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.LoginPage;
import com.phoenix_library.pages.US66_POM;
import com.phoenix_library.utilities.BrowserUtils;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class US66_StepDef {
    LoginPage loging=new LoginPage();
US66_POM link=new US66_POM();

    @Given("I am on login page")
    public void i_am_on_login_page() {

    }
    @And("i login using following credential :")
    public void iLoginUsingFollowingCredential(Map<String,String> credential) {
        loging.userName.sendKeys(credential.get("email"));
        loging.password.sendKeys(credential.get("password"));
        loging.submit.click();

    }


    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
      link.userlink.click();

    }
    @When("I search for {string}")
    public void i_search_for(String string) {
    link.serachId.sendKeys(string);
        BrowserUtils.sleep(3);
    }
    @Then("table should contain this data")
    public void table_should_contain_this_data(Map<String,String> userinfo) {
        String act1 = link.userId.getText();
        Assert.assertEquals(userinfo.get("UserId"), act1);

        String act2=link.fullname.getText();
       Assert.assertEquals(userinfo.get("FullName"),act2);

        String act3=link.email.getText();
        Assert.assertEquals(userinfo.get("Email"),act3);




    }



}
