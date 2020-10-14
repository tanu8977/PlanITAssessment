package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testcase1 {
	
	
		@Test
	
		public void testcas()
		{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#/home");
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/p[2]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("forename")))).sendKeys("fdjh");
	  driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("tanu@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("this is");

}
}
