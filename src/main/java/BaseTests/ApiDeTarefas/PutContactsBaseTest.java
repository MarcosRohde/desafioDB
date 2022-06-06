package BaseTests.ApiDeTarefas;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PutContactsBaseTest {
	protected static RequestSpecification requestSpecification;
	protected static ResponseSpecification responseSpecification;
	private static Map<String, Object> objeto = new HashMap<>();
	
	@BeforeAll
	public static void buildRequestSpecification() {
		requestSpecification = new RequestSpecBuilder()
				.setBaseUri("https://api-de-tarefas.herokuapp.com")
				.setBasePath("/contacts")
				.addHeader("Content-Type", "application/json")
				.addHeader("Accept", "application/vnd.tasksmanager.v2")
				.addHeader("Location", "/contacts/1")
				.setBody(objeto)
				.build();
	}

	@BeforeAll
	public static void buildResponseSpecification() {
		responseSpecification = new ResponseSpecBuilder()
				.expectStatusCode(201)
				.expectContentType(ContentType.JSON)
				.build();
	}
	
	public static void buildObject() {
		objeto.put("name", "MarcosTeste");
		objeto.put("email", "mt@mt.com");
		objeto.put("age", "27");
		objeto.put("phone", "123456789");
	}

}
