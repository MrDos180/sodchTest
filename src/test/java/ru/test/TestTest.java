package ru.test;

import jdk.jfr.Description;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static ru.actions.SodchAction.*;
import static ru.actions.TestSetup.loginSetup;



public class TestTest {

    @BeforeClass
    public static void openSodch() {
        loginSetup();
    }
    @Test
    @Description("Login SODCH and KUSP create")
    public void action() {
        loginAction("operalex","operalex");
        createKusp();

    }
   /* @Test
    public void svodka() {
        loginAction("operalex","operalex");
        createSummary();
    }*/

    @AfterClass
    public static void logout () {
        close();
    }
}
