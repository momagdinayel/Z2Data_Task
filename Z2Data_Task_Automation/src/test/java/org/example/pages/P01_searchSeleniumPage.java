package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P01_searchSeleniumPage {
    public WebElement search(){
       return  Hooks.driver.findElement(By.cssSelector("input[name=\"q\"]"));
    }
    public List<WebElement> result(){
        List rs=Hooks.driver.findElements(By.cssSelector("h3[class=\"LC20lb MBeuO DKV0Md\"] span[dir=\"ltr\"]"));
        return rs;
    }
}
