package common;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Helpers {
    private String baseUrl;
    private Response response;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void makeGetRequest(String endpoint) {
        response = RestAssured.get(baseUrl + endpoint);
    }

    public void verifyResponseCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    public void verifyResponseBodyContains(String expectedContent) {
        response.then().assertThat().body(org.hamcrest.Matchers.containsString(expectedContent));
    }

    public void makePostRequest(String endpoint, Map<String, String> data) {
        RequestSpecification request = given();
        request.header("Content-Type", "application/json");
        request.body(data);
        response = request.post(endpoint);
    }

    public void makeDeleteRequest(String endpoint) {
        RequestSpecification request = given();
        response = request.delete(endpoint);
    }

    public void makePutRequest(String endpoint, Map<String, String> data) {
        RequestSpecification request = given();
        request.header("Content-Type", "application/json");
        request.body(data);
        response = request.put(endpoint);
    }




    public void verifyBookDeleted(String bookId) {
        RequestSpecification request = given();
        Response deleteCheckResponse = request.get("/books/" + bookId);
        deleteCheckResponse.then().statusCode(404);
    }
}
