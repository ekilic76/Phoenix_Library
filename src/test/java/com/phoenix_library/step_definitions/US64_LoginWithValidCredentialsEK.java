package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.LoginPage;
import com.phoenix_library.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US64_LoginWithValidCredentialsEK {


    LoginPage login = new LoginPage();

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {



        String expectedResult = login.expectedName.getText();
        String actualResult = arg0;
        System.out.println(expectedResult);
        System.out.println(actualResult);


        Assert.assertEquals(expectedResult, actualResult);


    }
}
