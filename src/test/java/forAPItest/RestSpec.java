package forAPItest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class RestSpec {
    private static RequestSpecification requestSpecification;
    @BeforeMethod
    public void setSpecification(){
        requestSpecification=  new RequestSpecBuilder()
                .setBaseUri("http://localhost:8080/app/").addHeader("Accept","application/json").build();

    }
    @Test
public void matest(){
    given()
            .spec(requestSpecification)
            .when().get("videogames")
            .then().log().body();


}
    @Test
    public void gameid(){

        given()
                .spec(requestSpecification)
                .when().get("videogames/3")
                .then().log().body();
    }
}

