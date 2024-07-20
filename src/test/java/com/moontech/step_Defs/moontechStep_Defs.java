package com.moontech.step_Defs;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class moontechStep_Defs {

    private Response response;

    @Given("I perform GET request to {string}")
    public void iPerformGETRequestTo(String url) {
        RestAssured.useRelaxedHTTPSValidation();
        response = RestAssured.given().redirects().follow(false).get(url);
    }

    @Then("I follow the redirects and the final status code should be {int}")
    public void iFollowTheRedirectsAndTheFinalStatusCodeShouldBe(int expectedStatusCode) {
        while (response.getStatusCode() == 301 || response.getStatusCode() == 302) {
            String redirectUrl = response.getHeader("Location");
            if (redirectUrl != null && !redirectUrl.startsWith("http")) {
                redirectUrl = response.getHeader("Host") + redirectUrl;
            }
            response = RestAssured.given().redirects().follow(false).get(redirectUrl);
        }
        assertEquals(expectedStatusCode, response.getStatusCode());
    }
}
