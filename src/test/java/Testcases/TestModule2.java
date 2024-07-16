package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestModule2 {
	
	public static WebDriver driver;
	
	@Test(priority=1)
	public void facebooklogin()
	{
		driver=new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=2)
	public void enterusercredentials()
	{
		
		driver.findElement(By.id("email")).sendKeys("vijji@gmail.com");
		driver.findElement(By.id("passed")).sendKeys("vijji123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
