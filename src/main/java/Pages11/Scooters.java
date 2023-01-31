package Pages11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scooters {

	JavascriptExecutor js = (JavascriptExecutor) Base1.driver;
    
	public static void openUrl(String url) {
		
		//LOG.info("Url launched " +url);
		
	}
	
	public void SearchPage() throws InterruptedException
	{
		 js.executeScript("window.scrollBy(0,800)", "");
         Thread.sleep(1000);
		Base1.driver.findElement(By.xpath("//a[@href=\"https://droom.in/ferrari-cars\"]")).click();
         Base1.driver.navigate().back();
         js.executeScript("window.scrollBy(0,-800)");
	}
	
	
	public void setLocation() throws InterruptedException 
	{
		Base1.driver.findElement(By.xpath("//div[@class=\"location-wrapper\"]")).click();
		Thread.sleep(500);
		Base1.driver.findElement(By.xpath("//input[@id=\"locationSearch\"]")).sendKeys("Pune");
		Base1.driver.findElement(By.xpath("//*[@id=\"headerPopularLocation\"]/li[3]")).click();
		js.executeScript("window.scrollBy(0,900)", "");
		Base1.driver.findElement(By.xpath("//a[@class=\"d-border-0 search-by-scooter d-font-size-16\"]")).click();
		Base1.driver.findElement(By.xpath("//*[@id=\"by-brand-car\"]/div/div/a")).click();
	}
	
	public void vscooterUsingByBrand()
	{
		Base1.driver.findElement(By.xpath("//a[@href=\"https://droom.in/22kymco-scooters\"]")).click();
		String actualTitle=Base1.driver.getTitle();
		System.out.println(""+actualTitle);
		String expectedTitle="22Kymco scooters in India, Price, Reviews, Specs, Photos & Mileage| Droom";
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
		
	}
}
