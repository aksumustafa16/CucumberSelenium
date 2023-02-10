package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        //driver.get("url");
        //instead of driver object we will use Driver.get() directly
        Driver.get().get(url);

    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() throws InterruptedException {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify title","Dashboard",actualTitle);
    }

    @When("the user enter sales manager information")
    public void the_user_enter_sales_manager_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enter store manager information")
    public void the_user_enter_store_manager_information() {
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

}
