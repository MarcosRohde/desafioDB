package TestCases.ApiDeTarefas;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import BaseTests.ApiDeTarefas.DeleteContactsBaseTest;

public class DeleteContacts extends DeleteContactsBaseTest {
	
    @Test
    public void deteleContact(){
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
