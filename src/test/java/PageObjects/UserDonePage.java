package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class UserDonePage {
	private WebDriver driver;
	private Waits waits;

	public UserDonePage(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}

	public WebElement getNoticeSucess() {
		return waits.visibilityOfElement(By.cssSelector("#notice"));
	}
}
