package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase3 {
	static WebDriver driver;
	@Test
	public void testcase3()
	{
		
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://jupiter.cloud.planittesting.com/#/home");
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/p[2]/a[1]")).click();
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
	WebDriverWait wait = new WebDriverWait(driver, 4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("forename")))).sendKeys("fdjh");
	 //driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
  driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("tanu@gmail.com");
 driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("this is memo");
 driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
  String expected = "Thanks Tanuja, we appreciate your feedback.";
  String actual =driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]")).getText();
  Assert.assertEquals(actual, expected);
  
	

}
}
	
	




