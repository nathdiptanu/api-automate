package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import common.Helpers;

public class APITestSteps {
  private final Helpers restUtils = new Helpers();
    @Given("^I have the base URL \"([^\"]*)\"$")
    public void iHaveTheBaseUrl(String baseUrl) {
        restUtils.setBaseUrl(baseUrl);
    }

    @When("^I make a GET request to \"([^\"]*)\"$")
    public void iMakeAGetRequestTo(String endpoint) {
        restUtils.makeGetRequest(endpoint);
    }

    @Then("^the response code should be (\\d+)$")
    public void theResponseCodeShouldBe(int expectedStatusCode) {
        restUtils.verifyResponseCode(expectedStatusCode);
    }

    @Then("^the response body should contain \"([^\"]*)\"$")
    public void theResponseBodyShouldContain(String expectedContent) {

        restUtils.verifyResponseBodyContains(expectedContent);

    }
}
