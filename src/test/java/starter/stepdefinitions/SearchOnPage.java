package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchOnPage {

    @Given("User is on the Choucartesting home page")
    public void user_is_on_the_Choucartesting_home_page() {
    }

    @When("he searches jobs for {string}")
    public void he_searches_jobs_for(String string) {
    }
    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String string) {
    }

}
