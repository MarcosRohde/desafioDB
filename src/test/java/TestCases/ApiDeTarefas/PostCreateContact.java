package TestCases.ApiDeTarefas;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import BaseTests.ApiDeTarefas.CreateContactsBaseTest;

public class PostCreateContact extends CreateContactsBaseTest {
	
    @Test
    public void postCreateContact(){
        given()
                .spec(requestSpecification)
                .log().all()
        .when()
                .get()
        .then()
                .spec(responseSpecification)
                .log().all();
    }
}
