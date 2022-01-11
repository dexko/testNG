package forAPItest;

import dataserial.PhoneResponseItem;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class ForGetCollection {
    @Test
    public void getCollection(){
        Response response =given().when().get("http://jsonplaceholder.typicode.com/users");
        PhoneResponseItem[] phItem = response.as(PhoneResponseItem[].class);
        for (int i =0; i< phItem.length; i++){
            System.out.println(
            phItem[i].getPhone());}

        //Arrays.stream(phItem).forEach(System.out::println);
    }
}
