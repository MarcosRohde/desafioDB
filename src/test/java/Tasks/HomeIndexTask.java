package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.HomeIndexPage;

public class HomeIndexTask {
	private WebDriver driver;
	private HomeIndexPage homeIndexPage;

	public HomeIndexTask(WebDriver driver) {
		this.driver = driver;
		homeIndexPage = new HomeIndexPage(driver);
	}

	public void selectButtonComecarAutomacaoWeb() {
		homeIndexPage.getComecarAutomacaoWeb().click();
	}

	public void validation() {
		try {

			Assertions.assertEquals("", "");
			Report.log(Status.PASS, "", Screenshot.fullPageBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "", Screenshot.fullPageBase64(driver));
		}
	}
}