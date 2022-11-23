package Packageone;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentDemo {

    ExtentSparkReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public void setUp(){
         htmlReporter = new ExtentSparkReporter("extentreport.html");
         extent= new ExtentReports();
        extent.attachReporter(htmlReporter);
        System.out.println("Hello");

    }


//    @Test
//    public void extentReportsDemo()
//    {
//        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.co.in");
//        if(driver.getTitle().equals("Google"))
//        {
//            System.out.println("Pass");
//        }
//        else
//        {
//            System.out.println("Fail");
//        }
//    }

     @Test
     public void test1(){
        ExtentTest test= extent.createTest("my first test","Sample");
        test.log(Status.INFO, "Hi");
        test.info("Info");
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");



     }

    @Test
    public void test2(){
        ExtentTest test= extent.createTest("my first test","Sample");
        test.log(Status.INFO, "Hi");
        test.info("Info");
        test.pass(MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");



    }
    @AfterSuite
    public void tearDown(){


extent.flush();
    }

}
