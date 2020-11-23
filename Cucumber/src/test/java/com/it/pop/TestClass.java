package com.it.pop;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass extends PageElements{
    @Test
    //Basic test to open IT University website and assert if Home page loaded successfully
    public void titleCheck(){

        CheckTitle("PrestShop");
    }




}
