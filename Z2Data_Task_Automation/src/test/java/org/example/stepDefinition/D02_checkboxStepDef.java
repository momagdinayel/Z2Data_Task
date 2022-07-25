package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P02_checkboxPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D02_checkboxStepDef {
    P02_checkboxPage ch=new P02_checkboxPage();
    @And("user check first checkbox")
    public void checkbox(){
        ch.checkbox().get(0).click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("two boxes are checked")
    public void checkedbox(){
        for(int i=0;i<ch.checkbox().size();i++) {
            Assert.assertTrue(ch.checkbox().get(i).isSelected());
            //Assert.assertEquals("true",ch.checkbox().get(i).getAttribute("checked"));
        }
        System.out.println("Two checkboxes are selected !");
    }
}
