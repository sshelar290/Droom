package Pages11;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicalinfoPage {

	private final static Logger LOG = Logger.getLogger(VehicalinfoPage.class);
	@FindBy(xpath = "(//a[text()=\"Vehicle Finder\"])[1]")
	WebElement vehicle_Finder_label;

	public VehicalinfoPage() {
		PageFactory.initElements(Base1.driver, this);
	}

	public void clickable() {
		vehicle_Finder_label.click();

	}
}
