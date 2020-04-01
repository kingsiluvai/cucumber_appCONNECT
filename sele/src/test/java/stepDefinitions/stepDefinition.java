package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is an appconnect landing page$")
    public void user_is_an_appconnect_landing_page() throws Throwable {
       System.out.println("test1");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable
    {
        System.out.println("test2");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable
    {
        System.out.println("test3");
    }

    @And("^options are displayed$")
    public void options_are_displayed() throws Throwable 
    {
        System.out.println("test4");
    }

}