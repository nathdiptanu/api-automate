package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import common.Helpers;

import java.util.Map;

public class TestSteps {
    private Helpers restUtils;

//    @Given("^I have the base URL \"([^\"]*)\"$")
//    public void iHaveTheBaseUrl(String baseUrl) {
//        restUtils = new Helpers();
//        restUtils.setBaseUrl(baseUrl);
//    }

//    @When("^I make a GET request to \"([^\"]*)\"$")
//    public void iMakeAGetRequestTo(String endpoint) {
//        restUtils.makeGetRequest(endpoint);
//    }

    @When("^I make a POST request to \"([^\"]*)\" with the following data:$")
    public void iMakeAPostRequestToWithTheFollowingData(String endpoint, DataTable table) {
        Map<String, String> dataMap = table.transpose().asMap(String.class, String.class);
        restUtils.makePostRequest(endpoint, dataMap);
    }

    @When("^I make a DELETE request to \"([^\"]*)\"$")
    public void iMakeADeleteRequestTo(String endpoint) {
        restUtils.makeDeleteRequest(endpoint);
    }

    @When("^I make a PUT request to \"([^\"]*)\" with the following data:$")
    public void iMakeAPutRequestToWithTheFollowingData(String endpoint, DataTable table) {
        Map<String, String> dataMap = table.transpose().asMap(String.class, String.class);
        restUtils.makePutRequest(endpoint, dataMap);
    }

//    @Then("^the response code should be (\\d+)$")
//    public void theResponseCodeShouldBe(int expectedStatusCode) {
//        restUtils.verifyResponseCode(expectedStatusCode);
//    }

//    @Then("^the response body should contain \"([^\"]*)\"$")
//    public void theResponseBodyShouldContain(String expectedContent) {
//        restUtils.verifyResponseBodyContains(expectedContent);
//    }

    @Then("^a book with ID \"([^\"]*)\" should be deleted$")
    public void aBookWithIDShouldBeDeleted(String bookId) {
        restUtils.verifyBookDeleted(bookId);
    }

    @And("a book with ID {string} exists")
    public void aBookWithIDExists(String arg0) {
    }

    @And("I have the following book data:")
    public void iHaveTheFollowingBookData() {
        
    }

    @When("I make a POST request to {string}")
    public void iMakeAPOSTRequestTo(String arg0) {
        
    }

    @And("the book with ID {string} should be deleted")
    public void theBookWithIDShouldBeDeleted(String arg0) {
    }
}
