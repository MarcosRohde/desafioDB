package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.HomeIndexTask;
import Tasks.TreinamentoHomeTask;
import Tasks.UserDoneTask;
import Tasks.UserNewTask;

public class testWeb extends TestBase {
	private WebDriver driver = getDriver();
	private HomeIndexTask homeIndexTask = new HomeIndexTask(driver);
	private TreinamentoHomeTask treinamentoHomeTask = new TreinamentoHomeTask(driver);
	private UserNewTask userNewTask = new UserNewTask(driver);
	private UserDoneTask userDoneTask = new UserDoneTask(driver);

	@Test
	public void realizarUmaCompraComSucesso() {
		try {
			Report.createTest("Realizar Compra com Sucesso!", ReportType.SINGLE);

			homeIndexTask.selectButtonComecarAutomacaoWeb();
			treinamentoHomeTask.selectFormularioMenu();
			treinamentoHomeTask.selectCriarUsuarioMenu();
			userNewTask.fillUserName();
			userNewTask.fillUserLastName();
			userNewTask.fillUserEmail();
			userNewTask.selectButtonCriar();
			userDoneTask.validationNoticeSucess();

		} catch (Exception e) {
			Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
		}
	}
}
