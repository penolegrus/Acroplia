package LoginApi;

import LoginApi.user.auth.resource.UserAuthResource;
import io.restassured.http.ContentType;
import org.apache.http.NameValuePair;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.given;

public class Tests {

    @Test
    public void AuthByEmail(){

       // byte[] data = "{\"email\":\"epickonfetka@gmail.com\",\"password\":\"burgeR9240971\"}".getBytes(StandardCharsets.UTF_8);
        UserAuthResource testUser = new UserAuthResource("epickonfetka@gmail.com", "burgeR9240971");

        given()
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .baseUri("https://dev.acroplia.com:8080/api")
                .body(testUser)
                .when()
                .post("/v1/users/sessions")
                .then()
                .log().all();
                //.extract().as(Error.class);
    }
}
