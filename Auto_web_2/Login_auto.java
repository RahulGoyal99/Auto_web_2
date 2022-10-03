package Auto_web_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_auto {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
              "F:\\Java_FSD\\Phase_5\\New folder/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://login.mailchimp.com/");
		driver.findElement(By.id("username")).sendKeys("Admin@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("submit-btn")).click();
  }
  
  

  @AfterMethod
  public void afterMethod() {
	// close and quit the browser
	  String actualUrl = "https://live.browserstack.com/dashboard";
		String expectedUrl = driver.getCurrentUrl();
	System.out.println("Invalid Username and Password. Please check");
		Assert.assertEquals(expectedUrl, actualUrl);
		
      
  }
}