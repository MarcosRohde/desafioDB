package TestCases.ApiDeTarefas;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import BaseTests.ApiDeTarefas.PutContactsBaseTest;

public class PutEditContacts extends PutContactsBaseTest {
	
    @Test
    public void putEditContact(){
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
