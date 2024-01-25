package auto.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Google {
	
	@Test
	public void verifyGoogleHomePage(){
		
		String URL = "https://www.google.com";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\seleniumproject1\\driver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();

		driver.get(URL);

		driver.manage().window().maximize();
		
		//Verify HomePage Title
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		
		Assert.assertEquals(pageTitle, "Google");
		
		//To Close the Browser
		driver.close(); // it will close only current tab
//		driver.quit(); //it will close all the tabs
	
	}

}

