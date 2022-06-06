package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.UserNewPage;
import Utils.FakerGenerator;

public class UserNewTask {
	private WebDriver driver;
	private UserNewPage userNewPage;

	public UserNewTask(WebDriver driver) {
		this.driver = driver;
		userNewPage = new UserNewPage(driver);
	}

	public void fillUserName() {
		userNewPage.getUserNameFieldInput().sendKeys(FakerGenerator.getFirstName());
	}

	public void fillUserLastName() {
		userNewPage.getUserLastNameFieldInput().sendKeys(FakerGenerator.getLastName());
	}

	public void fillUserEmail() {
		userNewPage.getUserEmailFieldInput().sendKeys(FakerGenerator.getEmail());
	}

	public void selectButtonCriar() {
		userNewPage.getButtonCriar().click();
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