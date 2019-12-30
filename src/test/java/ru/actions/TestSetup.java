package ru.actions;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;


public class TestSetup {

    public static void loginSetup() {


        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
       // Configuration.startMaximized= true;
        open("http://192.168.238.65:10001/mvd/#backdoor");



    }

}
