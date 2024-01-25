package auto.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Gmail {

    @Test
    public static void main(String args[]) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
     
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup");
        

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Reyansh");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("YourLastName");

        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        day.sendKeys("24");
//        nextButton.click();
        
        	
        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        month.sendKeys("may");
//        nextButton.click();
        
        WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        year.sendKeys("2003");
//        nextButton.click();	
        
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        gender.sendKeys("male");
//        nextButton.click();
        
        WebElement next = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
        next.click();
        
        
        

        try {
        	Thread.sleep(5000);
        } catch (Exception e) {
        	// TODO: handle exception
        }

        // Add validation or verification steps if needed
        
        driver.close();
    }

}
