package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://169.144.116.234:9090/spring-boot-web-thymeleaf-1.0/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void addressbook() {
	  
	  	driver.findElement(By.placeholder("Username")).sendKeys("vik");
	  	driver.findElement(By.placeholder("Password")).sendKeys("Password@123");
  	  	driver.findElement(By.xpath("//div[@class='form-control btn btn-primary']")).click();
	 	  	  
  }
 
   @AfterMethod
    public void logout() {
	    driver.close();
   }
}
