package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class UserNewPage {
	private WebDriver driver;
	private Waits waits;

	public UserNewPage(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}

	public WebElement getUserNameFieldInput() {
		return waits.visibilityOfElement(By.cssSelector("#user_name"));
	}

	public WebElement getUserLastNameFieldInput() {
		return waits.visibilityOfElement(By.cssSelector("#user_lastname"));
	}

	public WebElement getUserEmailFieldInput() {
		return waits.visibilityOfElement(By.cssSelector("#user_email"));
	}

	public WebElement getButtonCriar() {
		return waits.visibilityOfElement(By.cssSelector(".actions > input:nth-child(1)"));
	}
}
