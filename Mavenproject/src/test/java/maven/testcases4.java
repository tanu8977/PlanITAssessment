package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testcases4 {
	static WebDriver driver;
	@Test
	public void testcase4()
	{
		
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://jupiter.cloud.planittesting.com/#/home");
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/p[2]/a[1]")).click();
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	//driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[6]/div[1]/p[1]/a[1]")).click();
	//driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[6]/div[1]/p[1]/a[1]")).click();
	//body/div[2]/div[1]/ul[1]/li[4]/div[1]/p[1]/a[1]
//"//table[@class='ui-datepicker-calendar']//td")
	//driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[1]/div[1]/img[1]")).click();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//body/div[2]/div[1]/ul[1]/li[6]/div[1]/img[1]").partialLinkText("Buy")).click();
	//driver.get("https://jupiter.cloud.planittesting.com/");
	driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container-fluid:nth-child(2) div.products.ng-scope ul:nth-child(1) li.product.ng-scope:nth-child(6) div:nth-child(1) p:nth-child(3) > a.btn.btn-success")).click();
	driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container-fluid:nth-child(2) div.products.ng-scope ul:nth-child(1) li.product.ng-scope:nth-child(6) div:nth-child(1) p:nth-child(3) > a.btn.btn-success")).click();
	driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container-fluid:nth-child(2) div.products.ng-scope ul:nth-child(1) li.product.ng-scope:nth-child(4) div:nth-child(1) p:nth-child(3) > a.btn.btn-success")).click();
	
	//driver.findElement(By.partialLinkText("Buy")).click();
	//driver.findElement(By.partialLinkText("Buy")).click();
	//driver.findElement(By.partialLinkText("Buy")).click();
//	driver.findElement(By.partialLinkText("Buy")).click();
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[2]/li[4]/a[1]")).click();
	//String rithvik =driver.findElement(By.xpath("//body/div[2]/div[1]/p[1]")).getText();
	String rithvik =driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container-fluid:nth-child(2) div.ng-scope:nth-child(1) > p.cart-msg")).getText();
	//String rithvik =driver.findElement(By.xpath("//body/div[2]/div[1]/p[1]")).getText();
	System.out.println(rithvik);
	
	
	
 // String actualMsg=driver.findElement(By.xpath("//div[@id='statusMsg']/div")).getText();
		//  String errorMsg= "× Invalid username or password";

		 //// if(actualMsg.equals(errorMsg)) {
		    //      System.out.println("Test Case Passed");
		  //    }else{
		  //        System.out.println("Test Case Failed");
		  //    }
	
	

}
}