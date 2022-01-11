package forAPItest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstApiTest {
    @Test
    public void firstApiTest(){
given().when().
        get("http://localhost:8080/app/videogames");



    }
}
