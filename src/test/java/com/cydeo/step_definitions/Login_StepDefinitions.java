package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user_is_on_the_library_login_page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        //TODO: I need to implement entire Login code
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println();
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println();
        // Write code here that turns the phrase above into concrete actions
        // It's not good practice to have exceptions - throw new io.cucumber.java.PendingException();
    }
}
