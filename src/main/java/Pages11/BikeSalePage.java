package Pages11;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BikeSalePage {
	Logger LOG = Logger.getLogger(BikeSalePage.class);
	@FindBy(xpath = "//div[@id=\"nav_category_button\"]")
	WebElement category;
	@FindBy(xpath = "//div[text()=\"Bike\"]")
	WebElement bike;
	@FindBy(xpath = "//div[@id=\"select-sort\"]")
	WebElement filter;
	@FindBy(xpath = "//li[text()=\"Price (Low to High)\"]")
	WebElement price;

	public BikeSalePage() {
		PageFactory.initElements(Base1.driver, this);
	}

	public void assendingOrder() {
		category.click();
		bike.click();
		filter.click();
		price.click();

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
			LOG.info(Base1.driver.findElement(By.xpath(
					"(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["
							+ (i + 1) + "]"))
					.getText());
			value[i] = Integer.parseInt(Base1.driver.findElement(By.xpath(
					"(//div/div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-4\"]/div[@class=\"grid\"]/div/div/div[2]/div/div/span)["
							+ (i + 1) + "]"))
					.getText().replaceAll("[^0-9.]", "").replaceAll(",", ""));
		}

		for (int i = 0; i < value.length - 1; i++) {
			LOG.info(value[i] + "<" + value[i + 1]);
			Assert.assertTrue(value[i] <= value[i + 1], "Price not in Ascending");

		}
	}

}
