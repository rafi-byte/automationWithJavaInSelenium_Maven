package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsDemo {

    public static void main(String[] args) {

        // Setting Chrome options to use a specific profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("profile-directory=Default"); // Replace 'Profile N' with your profile name

        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();  // Maximizing window

        //name
        driver.findElement(By.name("search")).sendKeys("Mac");
        
        //id
        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed() ;
        System.out.println(logoDisplayStatus) ;
        
        //LinkText & partiaLinkText
        driver.findElement(By.linkText("Tablets")).click();
        driver.findElement(By.partialLinkText("Table")).click(); //not preferred
        
        
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        System.out.println("total number of elements " + headerLinks.size());
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total number of elements " + links.size());
        
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("total number of elements " + images.size());
        
    }
}

