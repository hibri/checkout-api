package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.hamcrest.Matchers;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckoutSteps  {


    private Response response;

    @When("^I ask for the checkout api$")
    public void WhenIAskForTheCheckoutApi() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://localhost:4567/status")
                .get()
                .build();

        response = client.newCall(request).execute();


    }

    @Then("^it should exist$")
    public void ThenItshouldexist() {

        assertThat(response.code(), is(Matchers.equalTo(200)));

    }
}
