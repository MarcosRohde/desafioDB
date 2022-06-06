package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class HomeIndexPage {
	private WebDriver driver;
	private Waits waits;

	public HomeIndexPage(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}

	public WebElement getComecarAutomacaoWeb() {
		return waits.visibilityOfElement(
				By.cssSelector("#index-banner > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)"));
	}

}
