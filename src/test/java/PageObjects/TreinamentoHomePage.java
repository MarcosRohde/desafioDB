package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Waits;

public class TreinamentoHomePage {
	private WebDriver driver;
	private Waits waits;

	public TreinamentoHomePage(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}

	public WebElement getFormularioMenu() {
		return waits.visibilityOfElement(By.cssSelector("li.bold:nth-child(1) > a:nth-child(1)"));
	}

	public WebElement getCriarUsuarioMenu() {
		return waits.visibilityOfElement(By.cssSelector(
				"li.bold:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
	}

}
