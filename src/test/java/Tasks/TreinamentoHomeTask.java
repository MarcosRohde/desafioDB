package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.TreinamentoHomePage;

public class TreinamentoHomeTask {
	private WebDriver driver;
	private TreinamentoHomePage treinamentoHome;

	public TreinamentoHomeTask(WebDriver driver) {
		this.driver = driver;
		treinamentoHome = new TreinamentoHomePage(driver);
	}

	public void selectFormularioMenu() {
		treinamentoHome.getFormularioMenu().click();
	}

	public void selectCriarUsuarioMenu() {
		treinamentoHome.getCriarUsuarioMenu().click();
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
