package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDB(){
        System.out.println("\tconnecting to Database...");
    }

    @After("@db")
    public void closeDB(){
        System.out.println("\tdisconnecting from Database...");
    }
}
