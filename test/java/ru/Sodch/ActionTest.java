package ru.Sodch;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.addListener;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class ActionTest {


    private static String sodchUsername = System.getProperty("sodch.username", "operalex");
    private static String sodchPassword = System.getProperty("sodch.password", "operalex");

    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();


    @BeforeClass
    public static void openSodch() {
        timeout = 10000;
        baseUrl = "http://192.168.238.65:10002/mvd/#backdoor";
        browser = "chrome";

        open("/");
        //login();
        waitUntilPagesIsLoaded();


    }
    protected static void waitUntilPagesIsLoaded(){
        $(By.xpath("//div[.='Логин:']//input"));
    }

    @Test
    public void login() {

        $(By.xpath("//div[.='Логин:']//input")).val(sodchUsername);
        $(By.xpath("//div[.='Пароль:']//input")).val(sodchPassword);
        $(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small']")).click();
        $(By.xpath("//div[@class ='x-component x-box-item x-component-default']")).shouldBe(visible);


    }
    @AfterClass
    public static void logut () {
        closeWebDriver();


    }

}
