package Packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectorHub {

    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://selectorshub.com");
//        driver.switchTo().frame("shadpact");
//        JavascriptExecutor jse=(JavascriptExecutor)driver;
//        jse.executeScript( "return document.querySelector("#userName").shadowRoot.querySelector("#kils"));

        driver.findElement(By.xpath("//*[@id=\"menu-item-4098\"]/a")) ;
        Thread.sleep(10000);
        String test=driver.findElement(By.xpath("//div[@id='jest']")).getText();
        System.out.println(test);
        Actions act= new Actions(driver);
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("1234");




    }

}
