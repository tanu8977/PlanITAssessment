package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase2 {

	
@Test
public void test() throws Exception
		{
			
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#/home");
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/p[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("forename")))).sendKeys("Tanuja");
	  driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("tanujaanvitha@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("THIS IS AWESOME");
	 
	  driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	  WebDriverWait wait2 = new WebDriverWait(driver, 4000);
	  
	driver.findElement(By.tagName("div")).getText();
	  

		 
}
}
