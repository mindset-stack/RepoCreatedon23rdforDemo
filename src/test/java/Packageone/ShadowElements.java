package Packageone;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElements {

    public static void main(String [] args) throws InterruptedException {
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://books-pwakit.appspot.com/");
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
        Thread.sleep(1000);
        WebElement shadowDomHostElement = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
        SearchContext first= (SearchContext)((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",shadowDomHostElement);
        Thread.sleep(1000);
        first.findElement(By.cssSelector("#input")).sendKeys("test");
        Thread.sleep(5000);
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost2 = "book-app[apptitle='BOOKS']";
        String cssSelectorForHost3 = "book-input-decorator";
        Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector("book-input-decorator")).getShadowRoot();
        Thread.sleep(1000);
        shadow1.findElement(By.cssSelector("svg")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
