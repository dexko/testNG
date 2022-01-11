package forAPItest;

import org.testng.annotations.Test;
import serializationGame.GameRequest;
import serializationGame.PutRequest;

import static io.restassured.RestAssured.given;

public class PutGame {

    @Test
    public void gameapdate(){
       GameRequest updateReq = new GameRequest();
        updateReq.setName("KOL");
        updateReq.setCategory("Top");

        given().header("Accept", "application/json").header("Content-Type", "application/json")
                .body(updateReq).when().put("http://localhost:8080/app/videogames/1").then().log().body();

    }
}
