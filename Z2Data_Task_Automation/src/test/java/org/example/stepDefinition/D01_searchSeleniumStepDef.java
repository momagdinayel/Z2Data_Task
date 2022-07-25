package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_searchSeleniumPage;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.Keys.ENTER;

public class D01_searchSeleniumStepDef {
    P01_searchSeleniumPage q=new P01_searchSeleniumPage();

    @Given("^user navigate to \"(.*)\"$")
    public void navigate_google(String url) throws InterruptedException {
//        Hooks.driver.navigate().to(url);
        Hooks.driver.get(url);
        Thread.sleep(6000);
//        Hooks.driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @When("^user search for \"(.*)\"$")
    public void search(String name){
        q.search().sendKeys(name);
        q.search().sendKeys(ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^user press \"(.*)\" result$")
    public void press(int n){
        int s=n-1;
        q.result().get(s).click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("^user get directed to \"(.*)\"$")
    public void directory(String url){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url),"The link isn't matched");
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

}
