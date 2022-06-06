package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.UserDonePage;
import Utils.Highlights;

public class UserDoneTask {
	private WebDriver driver;
	private UserDonePage userDonePage;

	public UserDoneTask(WebDriver driver) {
		this.driver = driver;
		userDonePage = new UserDonePage(driver);
	}

	public void validationNoticeSucess() {
		try {
			Assertions.assertEquals("Usuário Criado com sucesso", userDonePage.getNoticeSucess().getText());
			Highlights.highlighterMethod(driver, userDonePage.getNoticeSucess(), "#FF0000");
			Report.log(Status.PASS, "Mensagem de Sucesso está correta", Screenshot.fullPageBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Mensagem de Sucesso não está correta", Screenshot.fullPageBase64(driver));
		}
	}
}
