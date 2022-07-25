package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.example.pages.P05_downFilePage;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class D05_downFileStepDef {
    P05_downFilePage dn=new P05_downFilePage();
    @When("user press on Press on Excel xlsx")
    public void on_pressExcel() {
        JavascriptExecutor js=(JavascriptExecutor)Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView();",dn.excelBtn());
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        dn.excelBtn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("get download page and download to project folders")
    public void download() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView();",dn.download());
        dn.download().click();
        Thread.sleep(15000);
    }

    @Then("^open and assert rows count after excluding header will be \"(.*)\" start from row \"(.*)\" till end row$")
    public void rowCount(int expected,int n){
        String projectpath=System.getProperty("user.dir");
        try{
            XSSFWorkbook workbook=new XSSFWorkbook(projectpath+"\\src\\main\\resources\\gantt-chart_L.xlsx");
            XSSFSheet sheet=workbook.getSheet("GanttChart");
            int rowCount=sheet.getPhysicalNumberOfRows();
            System.out.println("Total row count is: "+rowCount);
            System.out.println("Excluding "+n+" row count will be "+expected+" !");
            int actual=rowCount-n;
            SoftAssert soft=new SoftAssert();
            soft.assertEquals(actual,expected);

        }catch(Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }



    }

}
