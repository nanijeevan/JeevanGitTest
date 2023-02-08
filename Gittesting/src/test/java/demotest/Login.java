package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Login {
	
	WebDriver driver;
	
	
	@Test
	public void logintest() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://bo-dev.nslsdev.com/");
			driver.findElement(By.id("email")).sendKeys("admin1@gleecus.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("AdminOne@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(1000);
		String Pagetitle =	driver.getTitle();
		System.out.println(Pagetitle);
		
	
		Thread.sleep(3000);
	}
	
	

}
