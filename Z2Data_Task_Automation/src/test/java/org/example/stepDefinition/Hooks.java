package org.example.stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.util.*;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void open_browser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
                Map<String,Object> prefs=new HashMap<String,Object>();
        String path=System.getProperty("user.dir");
        prefs.put("download.default_directory",path+"\\src\\main\\resources");
        options.setExperimentalOption("prefs",prefs);
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        options.addExtensions(new File("app.crx"));
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        String main=driver.getWindowHandle();
        Thread.sleep(4000);
        ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
        for(String child:tab){
            if(!child.equalsIgnoreCase(main)){
                driver.switchTo().window(child);
                driver.close();
            }
        }
        driver.switchTo().window(main);
        Thread.sleep(6000);
    }
    @After
    public static void quit_browser(){
        driver.quit();
    }

}
