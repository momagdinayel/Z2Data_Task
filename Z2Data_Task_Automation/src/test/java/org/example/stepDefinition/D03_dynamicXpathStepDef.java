package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import org.example.pages.P03_dynamicXpathPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D03_dynamicXpathStepDef {
    P03_dynamicXpathPage dyn=new P03_dynamicXpathPage();

    @Then("^Country for the Company \"(.*)\" is \"(.*)\"$")
    public void dynamicPath(String company,String country){
        SoftAssert soft=new SoftAssert();
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(dyn.resultcompany()));
        wait.until(ExpectedConditions.visibilityOfAllElements(dyn.resultcountry()));
        for(int i=0;i<dyn.resultcompany().size();i++) {
            if(dyn.resultcompany().get(i).getText().contains(company)){
                int j=i;
                System.out.println(dyn.resultcompany().get(i).getText()+" company is ");
                    if(dyn.resultcountry().get(j).getText().contains(country)){
                        System.out.println("in "+dyn.resultcountry().get(j).getText());
                    }else {
                        System.out.println("not in "+country+" it is ");
                        System.out.println("in "+dyn.resultcountry().get(j).getText());
                    }

            }
        }
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
