package ru.actions;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;


public class TestSetup {

    public static void loginSetup() {

        //todo сюда можно еще воткнуть логин пользака и передавать параметром логопас
        //todo поменял браузер на фаерфокс
        Configuration.timeout = 10000;
        Configuration.browser = "firefox";
       // Configuration.startMaximized= true;
        open("http://192.168.238.65:10001/mvd/#backdoor");



    }

}
