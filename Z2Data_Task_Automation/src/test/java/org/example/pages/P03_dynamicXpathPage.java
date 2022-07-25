package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P03_dynamicXpathPage {

    public List<WebElement> resultcompany(){
        return Hooks.driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td[1]"));
    }
    public List<WebElement> resultcountry(){
        return Hooks.driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td[3]"));
    }

}
