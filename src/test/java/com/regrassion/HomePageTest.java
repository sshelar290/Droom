package com.regrassion;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Pages11.Base1;
import Pages11.BrandStrorePage;

public class HomePageTest {

	private static final Logger LOG = Logger.getLogger(HomePageTest.class);
	BrandStrorePage brandStrore1 = new BrandStrorePage();

	@Test
	public void brandStore() {
		LOG.info("start");
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		BrandStrorePage brandStrore1 = new BrandStrorePage();
		brandStrore1.productSearch();
		// LOG.info("END");
		BrandStrorePage.verifyProduct();
	}

	@Test
	public void BikeSale() {
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Pages11.BikeSalePage bikesale = new Pages11.BikeSalePage();
		bikesale.assendingOrder();
		Base1.driver.quit();

	}

	@Test
	public void Vehicalinfo() {
		LOG.info("Click on Vehicle tab");
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Pages11.VehicalinfoPage vehical = new Pages11.VehicalinfoPage();
		vehical.clickable();
		LOG.info("CLick success");
	}

	@Test
	public void VerifyCartCheack() {
		LOG.info("Click on cart");
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		brandStrore1.cartCheack();
		Base1.driver.close();
	}
	
	
	/*
	 * @Ignore public void searchBar() {
	 * Base1.driver.get("https://droom.in/discovery");
	 * LOG.info("browser launching"); Base1.driver.manage().window().maximize();
	 * WebElement m = Base1.driver.findElement(By.
	 * xpath("//input[@class=\"form-control d-font-size-12 d-text-gray gtmEvent\"]")
	 * ); m.sendKeys("Thar"); m.sendKeys(Keys.ENTER);
	 * //Assert.assertEquals(Base1.driver.findElement(By.
	 * xpath("//h2[@class=\"MuiTypography-root jss194 MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]"
	 * )).getText(), "Mahindra Thar CRDE 4X4 BS IV 2015");
	 * Assert.assertTrue(Base1.driver.findElement(By.
	 * xpath("//h2[@class=\"MuiTypography-root jss194 MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]"
	 * )).getText().contains("Thar")); //Assert.assertEquals(true, false); } }
	 * 
	 * 
	 * @Ignore >>>>>>> master public void location() throws InterruptedException {
	 * Base1.driver.get("https://droom.in/discovery");
	 * Base1.driver.findElement(By.xpath(
	 * "//label[@class=\"d-text-transform-capitalize d-display-inline-block d-margin-0 d-line-height-1 d-font-size-14 d-font-weight-500 d-text-black d-valign-top d-margin-top-2 d-margin-right-10\"]"
	 * )) .click(); Thread.sleep(2000);
	 * Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]"
	 * )).click();
	 * Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]"
	 * )).clear();
	 * Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]"
	 * )).sendKeys("Pune");
	 * 
	 * Base1.driver.findElement(By.
	 * xpath("//li[@class=\"d-display-block d-padding-2 clickable\"]")).click(); //
	 * Base1.driver.findElement(By.xpath("//label[@class=\"d-text-transform-
	 * capitalize // d-display-inline-block d-margin-0 d-line-height-1
	 * d-font-size-14 // d-font-weight-500 d-text-black d-valign-top d-margin-top-2
	 * // d-margin-right-10\"]"));
	 * System.out.println(Base1.driver.findElement(By.xpath(
	 * "//div[@class=\"location-wrapper\"]//label")).getText()); <<<<<<< HEAD
	 * Assert.assertTrue(Base1.driver.findElement(By.xpath(
	 * "//div[@class=\"location-wrapper\"]//label")).getText().contains("Pune")); }
	 */

	@Ignore
	public void inBetween() throws InterruptedException {

		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Base1.driver.findElement(By.xpath("//div[@id=\"nav_category_button\"]")).click();
		Base1.driver.findElement(By.xpath("//div[text()=\"Bike\"]")).click();
		Base1.driver.findElement(By.xpath("//h2[text()=\"Price Range\"]")).click();
		int width = Base1.driver.findElement(By.xpath("//span[@id=\"range_text_price\"]//parent::div/div/div"))
				.getSize().getWidth();
		System.out.println(width);
		int pixel = width / 20;
		System.out.println(pixel);
		Actions action = new Actions(Base1.driver);
		// action.dragAndDropBy(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]")),
		// 44,221).perform();
		// action.dragAndDropBy(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[2]")),
		// 55,221).perform();
		WebElement element = Base1.driver
				.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]"));
		Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of x element  " + xcord + "pixels");
		int ycord = point.getY();
		System.out.println("Position of y element  " + ycord + "pixels");
		Thread.sleep(6000);

		action.moveToElement(element).clickAndHold().moveByOffset(113, 696).release().perform();

	}
}
