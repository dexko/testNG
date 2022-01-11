package forAPItest;

import dataserial.DesResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Deserialization {
    private static RequestSpecification requestSpecification1;

    @Test
    public void deserialization(){
        Response response = given()
                .spec(requestSpecification1 = new RequestSpecBuilder()
                        .setBaseUri("http://localhost:8080/app/").addHeader("Accept", "application/json").build())
                .when().get("videogames/2");


            DesResponse desResponse = response.as(DesResponse.class);
            System.out.println(desResponse.getName());
        System.out.println(desResponse.getId());
        System.out.println(desResponse.getReleaseDate());
        System.out.println(desResponse.getReviewScore());
    }
}
