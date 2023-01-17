package Pages11;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BrandStrore1 {
	private final static Logger LOG = Logger.getLogger(BrandStrore1.class);

	@FindBy(css = "div.services-links>a:nth-of-type(4)")
 WebElement brandclick;
	@FindBy(css = "a[href*=\"/hondacar\"]")
	 WebElement brand;

	public BrandStrore1() {
		PageFactory.initElements(Base1.driver, this);
	}

	public void productSearch() throws InterruptedException {
		Thread.sleep(3000);
		brandclick.click();
		brand.click();
		
	}

	public static void verifyProduct() throws InterruptedException {
		Set<String> Window_no = Base1.driver.getWindowHandles();
		String Current_window = Base1.driver.getWindowHandle();
		for(String s:Window_no) {
			if(!s.equals(Current_window))
				Base1.driver.switchTo().window(s);
		}
		LOG.info("Title of Page" +Base1.driver.getTitle().toLowerCase());
		Assert.assertTrue(Base1.driver.getTitle().toLowerCase().contains("honda"), "unlisted product");
		
		LOG.info("Listed product is Honda");
	}

}
