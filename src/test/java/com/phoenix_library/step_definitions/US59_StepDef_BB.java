package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.US59_userPage_BB;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US59_StepDef_BB {


    US59_userPage_BB userPage_bb = new US59_userPage_BB();


    @When("i click on {string} link")
    public void i_click_on_link(String string) {

        userPage_bb.userLink.click();


    }

    @Then("each users id should be unique")
    public void each_users_id_should_be_unique() {


        List<WebElement> listOfids = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[2]"));

        Set<WebElement> setOfIds= new HashSet<>();

        setOfIds.addAll(listOfids);

        List<WebElement>newList= new ArrayList<>();

        newList.addAll(setOfIds);


        Assert.assertEquals(listOfids.size(), newList.size());







    }
}




