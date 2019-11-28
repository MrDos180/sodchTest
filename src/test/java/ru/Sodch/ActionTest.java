package ru.Sodch;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static ru.Sodch.TestSetup.loginSetup;
import static ru.Sodch.TestTest.createKusp;
import static ru.Sodch.TestTest.loginAction;


public class ActionTest {
    @BeforeClass
    public static void openSodch() {
        loginSetup();
    }
    @Test
    public void login() {
        loginAction("operalex","operalex");
        createKusp();

    }

    @AfterClass
    public static void logout () {
        close();
    }
}
