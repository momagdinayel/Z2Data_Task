package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_uploadFilePage {
    public WebElement upload(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"file-upload\"]"));
    }
    public WebElement submit(){
        return Hooks.driver.findElement(By.id("file-submit"));
    }
    public WebElement header(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"example\"] h3"));
    }
}
