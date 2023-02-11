package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.SQLOutput;
import java.util.List;

public class ContactsStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String person) {
        System.out.println("TO DO");
    }
    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);
    }

}
