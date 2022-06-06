package TestCases.ApiDeTarefas;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import BaseTests.ApiDeTarefas.ListContactsBaseTest;

public class GetListContacts extends ListContactsBaseTest {
	
    @Test
    public void getListContacts(){
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