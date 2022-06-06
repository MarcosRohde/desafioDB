package BaseTests.ApiDeTarefas;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DeleteContactsBaseTest {
	protected static RequestSpecification requestSpecification;
	protected static ResponseSpecification responseSpecification;
	
	@BeforeAll
	public static void buildRequestSpecification() {
		requestSpecification = new RequestSpecBuilder()
				.setBaseUri("https://api-de-tarefas.herokuapp.com")
				.setBasePath("/contacts")
				.addHeader("Content-Type", "application/json")
				.addHeader("Accept", "application/vnd.tasksmanager.v2")
				.addHeader("Location", "/contacts/1")
				.build();
	}

	@BeforeAll
	public static void buildResponseSpecification() {
		responseSpecification = new ResponseSpecBuilder()
				.expectStatusCode(204)
				.expectContentType(ContentType.JSON)
				.build();
	}

}
