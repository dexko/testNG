package forAPItest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import serializationGame.GameRequest;

import java.lang.reflect.Parameter;

import static io.restassured.RestAssured.given;

public class PostGame {

    @Test
    public void gamecreation(){
        GameRequest gmReq = new GameRequest();
        gmReq.setId(13);
        gmReq.setName("Trone");
        gmReq.setReleaseDate("2022-01-07T14:21:44.247Z");
        gmReq.setReviewScore(10);
        gmReq.setCategory("Top");
        gmReq.setRating("high");



         given().header("Accept", "application/json").header("Content-Type", "application/json")
                .body(gmReq).when().post("http://localhost:8080/app/videogames").then().log().body();
       // given().body(gmReq).head("Accept","application/json").when().post("http://localhost:8080/app/videogames").then().log().body();
    }
}
