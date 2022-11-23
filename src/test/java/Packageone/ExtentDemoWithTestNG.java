package Packageone;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentDemoWithTestNG {

    ExtentSparkReporter htmlreporter;
    ExtentReports extent;
    @BeforeSuite

    public void setup(){
         htmlreporter= new ExtentSparkReporter("extent.html");
         extent =  new ExtentReports();
        extent.attachReporter(htmlreporter);

    }
@Test
    public void initialize(){
        ExtentTest test= extent.createTest("Demo test");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    test.info("Browser launched");
        WebDriver driver=  new ChromeDriver();
        driver.get("https://google.com");
        test.pass("Test passed");
        driver.close();

    }
    @AfterSuite
    public void teardown(){
        extent.flush();
    }

}
