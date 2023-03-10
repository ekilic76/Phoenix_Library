package com.phoenix_library.step_definitions;

import com.phoenix_library.pages.BooksSearch_PT;
import com.phoenix_library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class US67_PT_Step_definitions {

    BooksSearch_PT booksSearch_pt = new BooksSearch_PT();

    @When("I navigate to Books page")
    public void i_navigate_to_books_page() {
        booksSearch_pt.booksMenu.click();
    }
    @When("I search for The Goldfinch")
    public void i_search_for_the_goldfinch() throws InterruptedException {
        booksSearch_pt.searchField.sendKeys("The Goldfinch");
        Thread.sleep(5000);
    }

    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch (Map<String, String> data) {
 List < WebElement > rowNames = Driver.getDriver().findElements(By.xpath("//tbody//tr"));
List <String> emptyList = new ArrayList<>();

for (WebElement eachRowName : rowNames) {
           String eachName = (eachRowName.getText());
           emptyList.add(eachName);
        }
        String ISBN = data.get("ISBN");
        String Name = data.get("Name");
        String Author = data.get("Author");
        String Category = data.get("Category");
        String Year = data.get("Year");

        List < String> dataFromMap = new ArrayList<>();

        dataFromMap.add(ISBN);
        dataFromMap.add(Name);
        dataFromMap.add(Author);
        dataFromMap.add(Category);
        dataFromMap.add(Year);

       String empty = emptyList.get(0);

        if(empty.contains(ISBN) && empty.contains(Name) && empty.contains(Year) && empty.contains(Category) && empty.contains(Author) ){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        }


    }








            /*
            (Map<String, Object> bookInfo) {
        Map<String, Object> expectedMap = new TreeMap<>(bookInfo);
        Map<String, Object> actualMap= new TreeMap<>();

        List<String> keys =new ArrayList<>();
        for (WebElement eachKey : booksSearch_pt.keysMap){
            keys.add(eachKey.getText());
        }
        List<String> values = new ArrayList<>();
        for (WebElement eachValue: booksSearch_pt.valuesMap) {
            values.add(eachValue.getText());
        }

        for (int = 0; i < booksSearch_pt.keysMap.size(); i++){
            actualMap.put(booksSearch_pt.keysMap.get(i).gettext(), booksSearch_pt.valuesMap.get(i).getText());
        }

        Assert.assertEquals(expectedMap, actualMap);




             */

        //WebElement actualTable = Driver.getDriver().findElement(By.xpath("table[id='tbl_books']"));
        //System.out.println(actualTable);

       /* expectedTable.forEach((k, v) -> {
            // Integer number = 2;

            Assert.assertEquals(Driver.getDriver().findElement(By.xpath("(//tbody/tr[@role='row']/td)[2]")).getText(), v);
            // number++;

            System.out.println(Driver.getDriver().findElement(By.xpath("(//tbody/tr[@role='row']/td)[2]")).getText());
        });
*/

        //Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//td[.='387927210592']")), expectedTable.get("ISBN") );







