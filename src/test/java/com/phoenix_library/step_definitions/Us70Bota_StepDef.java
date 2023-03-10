package com.phoenix_library.step_definitions;


import com.phoenix_library.pages.US70_Bota;

import com.phoenix_library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us70Bota_StepDef {

    US70_Bota pages = new US70_Bota();

    @When("I click on Users module")
    public void i_click_on_users_module() {
        BrowserUtils.sleep(3);
    pages.clickUsersLink();

    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String books) {
        // Title, I have to verify title
        Assert.assertEquals(books , pages.books.getText());
    }

    @When("I click on Books module")
    public void i_click_on_books_module() {
        BrowserUtils.sleep(2);
        pages.clickBooksLink();
    }

    @When("I click on Dashboard link")
    public void i_click_on_dashboard_link() {
        BrowserUtils.sleep(2);
        pages.clickDash();


    }

    @Then("{string} page should display")
    public void page_should_display(String user) {
        Assert.assertEquals(user, pages.users .getText());
    }

    @Then("{string} page should displayed")
    public void page_should_displayed(String dash) {
        Assert.assertEquals(dash, pages.dashboard.getText() );
    }
}
