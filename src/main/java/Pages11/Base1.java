package Pages11;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Base1 {
	private static final Logger LOG = Logger.getLogger(Base1.class);

	public static RemoteWebDriver driver = new ChromeDriver();
	public static void openUrl(String url) {
		driver.get(url);
		LOG.info("Url launched " +url);
		
	}



}
