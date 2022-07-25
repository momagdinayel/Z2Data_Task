package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P02_checkboxPage {
    public List<WebElement> checkbox(){
        return Hooks.driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
    }
}
