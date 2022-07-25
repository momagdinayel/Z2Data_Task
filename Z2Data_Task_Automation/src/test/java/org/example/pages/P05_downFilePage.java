package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P05_downFilePage {
    public WebElement excelBtn(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/Links/go2.php?urlid=file-GanttChart365\"]"));
        //return Hooks.driver.findElement(By.cssSelector("div[class=\"pv\"] div[class=\"dl\"] a[onclick=\"gtag('event','XLSX',{'event_category':'Downloads','event_label': this.href.substr(24) });\"]"));
    }
    public WebElement download(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://www.vertex42.com/Files/exclusive/gantt-chart_L.xlsx\"]"));
    }
//    public WebElement cookies(){
//        return Hooks.driver.findElement(By.cssSelector("a[id=\"cc_gotit\"]"));
//    }
//    public WebElement cloAd(){
//        return Hooks.driver.findElement(By.cssSelector("id=\"dismiss-button\""));
//    }
//    public WebElement ad(){
//        return Hooks.driver.findElement(By.xpath("//div[@id=\"card\"]"));
//    }
//    public void hideElement(String xpath)
//    {
//        WebElement element = Hooks.driver.findElement(By.xpath(xpath));
//        ((JavascriptExecutor)Hooks.driver).executeScript("arguments[0].style.visibility='hidden'", element);
//    }

}
