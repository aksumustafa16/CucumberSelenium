package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        // based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equals("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("salas_manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store_manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        //send username and password
        new LoginPage().login(username, password);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        BrowserUtils.waitFor(2);

        //get the list of webelement and convert them to list of string with the help of ready method.
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptions = " + menuOptions);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userinfo) {
        System.out.println("userinfo = " + userinfo);
        new LoginPage().login(userinfo.get("username"),userinfo.get("password"));
        String expectedName = userinfo.get("firstname") + " " + userinfo.get("lastname");
        String actualName = new DashboardPage().getUserName();

        Assert.assertEquals(expectedName,actualName);
        System.out.println("actualName = " + actualName);
        System.out.println("expectedName = " + expectedName);
    }

}
