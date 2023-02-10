package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER\n");
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
