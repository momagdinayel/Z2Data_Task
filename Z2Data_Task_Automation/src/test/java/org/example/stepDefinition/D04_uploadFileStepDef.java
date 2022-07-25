package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_uploadFilePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D04_uploadFileStepDef {
    P04_uploadFilePage up=new P04_uploadFilePage();
    @And("user upload small image")
    public void uploadImage(){
        up.upload().sendKeys("C:\\Users\\Mohamed\\Desktop\\WindowHandling.png");
        up.submit().click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Then("image uploaded successfully")
    public void uploadedSuccess(){
        Assert.assertTrue(up.header().getText().contains("File Uploaded!"));
    }
}
