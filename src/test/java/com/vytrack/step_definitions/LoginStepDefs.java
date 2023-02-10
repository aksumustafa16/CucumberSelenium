package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open browser and I navigated vytrack login page");
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        System.out.println("I put user1 username and UserUser123 password and click login button");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that title changed to Dashboard");
    }
}