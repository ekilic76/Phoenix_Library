package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.HomePage_TM;
import com.phoenix_library.pages.LoginPage;
import com.phoenix_library.utilities.ConfigurationReader;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US69_stepDefs_HomePage {



    LoginPage loginPage = new LoginPage();
    HomePage_TM homePageTm = new HomePage_TM();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("Dashboard page should be displayed")
    public void dashboard_page_should_be_displayed() {

        Assert.assertTrue("Web element is not displayed", homePageTm.dashboard.isDisplayed());

    }
    @Then("Books page should be displayed")
    public void books_page_should_be_displayed() {


        Assert.assertEquals("Books" , homePageTm.books.getText());

    }

    @When("I login using student email {string} and student password {string}")
    public void iLoginUsingStudentEmailAndStudentPassword(String email, String password) {

        loginPage.login(email,password);

    }

    @When("I login using librarian email {string} and librarian password {string}")
    public void iLoginUsingLibrarianEmailAndLibrarianPassword(String email, String password) {

        loginPage.login(email,password);

    }
}
