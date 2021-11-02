package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicPackage.DriverSetUp;


public class LoadContentPlayContent extends DriverSetUp {
public static String baseUrl="https://bongobd.com/";
	
	@Test
	public static void loadContent() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String pageTitleActual=driver.getTitle();
		System.out.println("The page title is: "+ pageTitleActual);
		Thread.sleep(3000);
		
		String pageTitleExpected="BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";
		Assert.assertEquals(pageTitleExpected, pageTitleActual);
		driver.findElement(By.xpath("//span[contains(text(),'Shows')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(10000);
}
}
