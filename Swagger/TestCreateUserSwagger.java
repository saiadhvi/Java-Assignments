package Swagger;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class TestCreateUserSwagger {

    @Test
    public void createSingleUser(){
        CreateUserRequest request = new CreateUserRequest();
        CreateUserResponse response = new CreateUserResponse();
        request.setId(12);
        request.setUsername("User12");
        request.setFirstName("Jaya");
        request.setLastName("Lakshmi");
        request.setEmail("Meera@gmail.com");
        request.setPassword("123457");
        request.setPhone("982678394");
        request.setUserStatus(0);

        CreateUserResponse user1 =
                given().
                        contentType(ContentType.JSON).body(request).
                        when().
                        post("https://petstore.swagger.io/v2/user").as(CreateUserResponse.class);
        user1.printResponseBody();
        Assert.assertEquals(200,user1.getCode());
    }
    @Test
    public void createMultipleUsers(){
        ArrayList<CreateUserRequest> multipleUsers = new ArrayList<CreateUserRequest>();

        CreateUserRequest request1 = new CreateUserRequest();
        request1.setId(02);
        request1.setUsername("User02");
        request1.setFirstName("Ishwarya");
        request1.setLastName("doss");
        request1.setEmail("Ishwarya@gmail.com");
        request1.setPassword("125267");
        request1.setPhone("928363534");
        request1.setUserStatus(1);
        multipleUsers.add(request1);

        CreateUserRequest request2 = new CreateUserRequest();
        request2.setId(03);
        request2.setUsername("User03");
        request2.setFirstName("Adhvikaa");
        request2.setLastName("k");
        request2.setEmail("Adhvi@gmail.com");
        request2.setPassword("15352372");
        request2.setPhone("236776879");
        request2.setUserStatus(1);
        multipleUsers.add(request2);

        CreateUserResponse users =
                given().
                        contentType(ContentType.JSON).body(multipleUsers).log().body().
                        when().
                        post("https://petstore.swagger.io/v2/user/createWithArray").as(CreateUserResponse.class);
        users.printResponseBody();
        Assert.assertEquals(200,users.getCode());
    }
}