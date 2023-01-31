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
import Pages11.BikeSale;
import Pages11.BrandStrore1;
import Pages11.Scooters;
import Pages11.BrandStrore1;

public class HomePageTest {

	private static final Logger LOG = Logger.getLogger(HomePageTest.class);

	@Test
	public void brandStore() throws InterruptedException {
		LOG.info("start");
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		BrandStrore1 brandStrore1 = new BrandStrore1();
		brandStrore1.productSearch();
		// LOG.info("END");
		BrandStrore1.verifyProduct();
	}

	@Test
	public void BikeSale() throws InterruptedException {
		Base1.openUrl("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		BikeSale bikesale = new BikeSale();
		bikesale.assendingOrder();
		Base1.driver.quit();
		
	}
	@Test
	public void SetlocationAndSearchForScooterPage() throws InterruptedException {
		Base1.driver.manage().window().maximize();
		Base1.driver.get("https://droom.in/discovery");
		Scooters scooter=new Scooters();
		scooter.SearchPage();
		Thread.sleep(1000);
		scooter.setLocation();
		scooter.vscooterUsingByBrand();
	}
	/*
	@Ignore
	  public void searchBar() { 
		  Base1.driver.get("https://droom.in/discovery");
	  LOG.info("browser launching");
	  Base1.driver.manage().window().maximize();
	   WebElement m = Base1.driver.findElement(By.xpath("//input[@class=\"form-control d-font-size-12 d-text-gray gtmEvent\"]"));
	   m.sendKeys("Thar"); m.sendKeys(Keys.ENTER);
	  //Assert.assertEquals(Base1.driver.findElement(By.xpath("//h2[@class=\"MuiTypography-root jss194 MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]")).getText(), "Mahindra Thar CRDE 4X4 BS IV 2015");
	  Assert.assertTrue(Base1.driver.findElement(By.xpath("//h2[@class=\"MuiTypography-root jss194 MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]")).getText().contains("Thar")); 
	  //Assert.assertEquals(true, false); } }
@Ignore
=======
	public void Vehicalinfo() throws InterruptedException {
		LOG.info("Click on Vehicle tab");
		Base1.openUrl("https://droom.in/discovery");
		Base1.Base1.driver.manage().window().maximize();
		Thread.sleep(5000);
		Vehicalinfo vehical = new Vehicalinfo();
		vehical.clickable();
		LOG.info("CLick success");
	}

	public void searchBar() {

		Base1.driver.get("https://droom.in/discovery");
		LOG.info("browser launching");
		Base1.driver.manage().window().maximize();
		WebElement m = Base1.driver
				.findElement(By.xpath("//input[@class=\"form-control d-font-size-12 d-text-gray gtmEvent\"]"));
		m.sendKeys("Thar");
		m.sendKeys(Keys.ENTER);
		// Assert.assertEquals(Base1.driver.findElement(By.xpath("//h2[@class=\"MuiTypography-root
		// jss194
		// MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]")).getText(),
		// "Mahindra Thar CRDE 4X4 BS IV 2015");
		Assert.assertTrue(Base1.driver.findElement(By.xpath(
				"//h2[@class=\"MuiTypography-root jss194 MuiTypography-body1\"]//child::a[@href=\"https://droom.in/product/mahindra-thar-lx-4-str-convertible-diesel-mt-bs6-2021-63a148fc95c7720f3f8b457c\"]"))
				.getText().contains("Thar"));
		// Assert.assertEquals(true, false); }

	}

	@Ignore
>>>>>>> master
	public void location() throws InterruptedException {
		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.findElement(By.xpath(
				"//label[@class=\"d-text-transform-capitalize d-display-inline-block d-margin-0 d-line-height-1 d-font-size-14 d-font-weight-500 d-text-black d-valign-top d-margin-top-2 d-margin-right-10\"]"))
				.click();
		Thread.sleep(2000);
		Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]")).click();
		Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]")).clear();
		Base1.driver.findElement(By.xpath("//input[@placeholder=\"Enter Your City\"]")).sendKeys("Pune");

		Base1.driver.findElement(By.xpath("//li[@class=\"d-display-block d-padding-2 clickable\"]")).click();
		// Base1.driver.findElement(By.xpath("//label[@class=\"d-text-transform-capitalize
		// d-display-inline-block d-margin-0 d-line-height-1 d-font-size-14
		// d-font-weight-500 d-text-black d-valign-top d-margin-top-2
		// d-margin-right-10\"]"));
		System.out.println(Base1.driver.findElement(By.xpath("//div[@class=\"location-wrapper\"]//label")).getText());
<<<<<<< HEAD
		Assert.assertTrue(Base1.driver.findElement(By.xpath("//div[@class=\"location-wrapper\"]//label")).getText().contains("Pune"));
	}*/
	
	

	@Ignore
	public void assendingOrder() throws InterruptedException {
		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Base1.driver.findElement(By.xpath("//div[@id=\"nav_category_button\"]")).click();
		Base1.driver.findElement(By.xpath("//div[text()=\"Bike\"]")).click();
		Base1.driver.findElement(By.xpath(
				"//div[@class=\"MuiInputBase-root MuiInput-root jss99 MuiInputBase-formControl MuiInput-formControl\"]"))
				.click();
		Base1.driver.findElement(By.xpath("//li[text()=\"Price (Low to High)\"]")).click();
		Thread.sleep(2000);
		int length = Base1.driver
				.findElements(By.xpath(
						"//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]"))
				.size();

		Actions action = new Actions(Base1.driver);
		int value[] = new int[length];
		for (int i = 0; i < length; i++) {
			action.moveToElement(Base1.driver.findElement(By.xpath(
					"(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div)["
							+ (i + 1) + "]")));
			System.out.println(Base1.driver.findElement(By.xpath(
					"(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["
							+ (i + 1) + "]"))
					.getText());
			value[i] = Integer.parseInt(Base1.driver.findElement(By.xpath(
					"(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["
							+ (i + 1) + "]"))
					.getText().replaceAll("[^0-9.]", "").replaceAll(",", ""));
		}

		for (int i = 0; i < value.length - 1; i++) {
			System.out.println(value[i] + "<" + value[i + 1]);
			Assert.assertTrue(value[i] <= value[i + 1], "Price not in Ascending");

		}
	}

	@Ignore
	public void cardCheack() throws InterruptedException {
		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Base1.driver.findElement(By.xpath("//a[@class=\"d-display-inline-block d-valign-top gtmEvent\"]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(Base1.driver.findElement(By.xpath("//h4[text()=\"Your Cart is Empty\"]")).isDisplayed(),
				"Your card is not empty");
	}

	@Ignore
	public void cardCheack2() {
		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.findElement(By.xpath("//div[@id=\"cart_count\"]")).click();
		// Thread.sleep(3000);

	}

	@Ignore
	public void inBetween() throws InterruptedException {

		Base1.driver.get("https://droom.in/discovery");
		Base1.driver.manage().window().maximize();
		Base1.driver.findElement(By.xpath("//div[@id=\"nav_category_button\"]")).click();
		Base1.driver.findElement(By.xpath("//div[text()=\"Bike\"]")).click();
		Base1.driver.findElement(By.xpath("//h2[text()=\"Price Range\"]")).click();
	 int width = Base1.driver.findElement(By.xpath("//span[@id=\"range_text_price\"]//parent::div/div/div")).getSize().getWidth();
	 System.out.println(width);
	 int pixel = width/20;
	 System.out.println(pixel);
	 Actions action=new Actions(Base1.driver);
	// action.dragAndDropBy(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]")), 44,221).perform();
	 //action.dragAndDropBy(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[2]")), 55,221).perform();
	  WebElement element= Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]"));
	  Point point= element.getLocation();
	  int xcord=point.getX();
	  System.out.println("Position of x element  " +xcord +"pixels");
	  int ycord = point.getY();
	  System.out.println("Position of y element  " +ycord +"pixels");
	  Thread.sleep(6000);
	  
	  action.moveToElement(element).clickAndHold().moveByOffset(113, 696).release().perform();
	  

	 
	}
	/*public void model() {
		Base.openUrl("https://droom.in/discovery");
		Base.maximizeWindow();
		BrandStore.searchForProduct("Bajaj");
		
		
		int length=Base1.driver.findElements(By.xpath("//img[@class=\"card-img-top\"]")).size();
		Actions action=new Actions(Base1.driver);		
		int value[]=new int[length];
		for(int i=0; i<length; i++)
		{
		action.moveToElement(Base1.driver.findElement(By.xpath("//img[@class=\\\"card-img-top\\\"]")));	
		System.out.println(Base1.driver.findElement(By.xpath("//img[@class=\"card-img-top\"["+(i+1)+"]")).getText());
		value[i]=Integer.parseInt((Base1.driver.findElement(By.xpath("//img[@class=\"card-img-top\"["+(i+1)+"]")).getText()));
		
		//System.out.println(Base1.driver.findElement(By.xpath("(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["+(i+1)+"]")).getText());
		Assert.assertTrue(Base1.driver.findElement(By.xpath("//img[@class=\"card-img-top\"["+(i+1)+"]")).getText().contains("Bajaj"));
		//Assert.assertEquals(Base1.driver.findElement(By.xpath("//img[@class=\"card-img-top\"["+(i+1)+"]")).getText().contains("Bajaj"));
		}
=======
		int width = Base1.driver.findElement(By.xpath("//span[@id=\"range_text_price\"]//parent::div/div/div")).getSize()
				.getWidth();
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

		// action.dragAndDropBy(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]")),696,200).perform();

		// action.moveToElement(Base1.driver.findElement(By.xpath("(//span[@id=\"range_text_price\"]//parent::div/div/div/div/div/div/div)[1]")),
		// 100, 729).click().build().perform();
		// action.moveToElement(element, 113, 696).perform();

	}
	/*
	 * public void model() { Base.openUrl("https://droom.in/discovery");
	 * Base.maximizeWindow(); BrandStore.searchForProduct("Bajaj");
	 * 
	 * 
	 * int
	 * length=Base1.driver.findElements(By.xpath("//img[@class=\"card-img-top\"]")).size()
	 * ; Actions action=new Actions(Base1.driver); int value[]=new int[length]; for(int
	 * i=0; i<length; i++) { action.moveToElement(Base1.driver.findElement(By.xpath(
	 * "//img[@class=\\\"card-img-top\\\"]")));
	 * System.out.println(Base1.driver.findElement(By.xpath(
	 * "//img[@class=\"card-img-top\"["+(i+1)+"]")).getText());
	 * value[i]=Integer.parseInt((Base1.driver.findElement(By.xpath(
	 * "//img[@class=\"card-img-top\"["+(i+1)+"]")).getText()));
	 * 
	 * //System.out.println(Base1.driver.findElement(By.
	 * xpath("(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["
	 * +(i+1)+"]")).getText()); Assert.assertTrue(Base1.driver.findElement(By.xpath(
	 * "//img[@class=\"card-img-top\"["+(i+1)+"]")).getText().contains("Bajaj"));
	 * //Assert.assertEquals(Base1.driver.findElement(By.xpath(
	 * "//img[@class=\"card-img-top\"["+(i+1)+"]")).getText().contains("Bajaj")); }
	 * 
	 * }
	 */

}
