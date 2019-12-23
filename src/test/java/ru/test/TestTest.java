package ru.test;

import jdk.jfr.Description;
import org.junit.AfterClass;
import org.junit.Before;
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

   // @BeforeClass
   // public static void login () {loginAction("operalex","operalex");}

  /*    @Test
  @Description("Login SODCH and KUSP create")
  public void createKusp() {

      createKuspAction();
  }
    @Test
    @Description("Login SODCH and Summary create")
    public void createSummary() {

        createSummaryAction();
    }

    @Test
    @Description("Choose roles")
    public void chooseRole() {
        loginActionForCreate("iivanov","iivanov");


    }

    @AfterClass
    public static void logout () {
        close();
    }*/
}
