package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver ;

/*
 Test Case 
 --------------------
 1) Launch Browser(Chrome)
 2) Open Url https://demo.opencart.com/
 3) Validate title should be "Your Store"
 4) Close Browser
 
 */

public class firstTestCase {

	public static void main(String[] args) {
	
		//1) Launch Browser(Chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver() ;  //upcasting
		
		//2) Open Url https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3) Validate title should be "Your Store"
		String act_Title = driver.getTitle() ;
		if (act_Title.equals("Your Store"))
		{
			System.out.println("Test Passed") ;
		}else {
			System.out.println("Test Failed") ;
		}
		
		
		//4) Close Browser
		driver.close() ;
		//driver.quit();
		
		
	}

}
