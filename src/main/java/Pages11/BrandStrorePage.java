package Pages11;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrandStrorePage {
	private final static Logger LOG = Logger.getLogger(BrandStrorePage.class);

	@FindBy(css = "div.services-links>a:nth-of-type(4)")
	WebElement brandclick;
	@FindBy(css = "a[href*=\"/hondacar\"]")
	WebElement brand;
	@FindBy(xpath = "//a[@class=\"d-display-inline-block d-valign-top gtmEvent\"]")
	WebElement cardclick;
	@FindBy(xpath = "//h4[text()=\"Your Cart is Empty\"]")
	WebElement emptycheck;

	public BrandStrorePage() {
		PageFactory.initElements(Base1.driver, this);
	}

	public void productSearch() {

		brandclick.click();
		brand.click();

	}

	public static void verifyProduct() {
		Set<String> Window_no = Base1.driver.getWindowHandles();
		String Current_window = Base1.driver.getWindowHandle();
		for (String s : Window_no) {
			if (!s.equals(Current_window))
				Base1.driver.switchTo().window(s);
		}
		LOG.info("Title of Page" + Base1.driver.getTitle().toLowerCase());
		Assert.assertTrue(Base1.driver.getTitle().toLowerCase().contains("honda"), "unlisted product");

		LOG.info("Listed product is Honda");
	}

	public void cartCheack() {
		Base1.driver.manage().window().maximize();
		cardclick.click();
		Assert.assertTrue(emptycheck.isDisplayed(), "Your Cart is not empty");
		Assert.assertFalse(emptycheck.isDisplayed(), "Your cart is empty");

	}

}
