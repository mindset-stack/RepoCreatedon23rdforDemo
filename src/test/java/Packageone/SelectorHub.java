package Packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectorHub {

    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
//        driver.switchTo().frame("shadpact");
//        JavascriptExecutor jse=(JavascriptExecutor)driver;
        driver.findElement(By.xpath("//div[@id='userPass']"));
        Actions act= new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("1234");




    }

}
