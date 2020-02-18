package ru.actions;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static ru.elements.Buttons.button;
import static ru.elements.Inputs.findInput;


public class TestSetup {

    public static void loginSetup(String sodchUsername, String sodchPassword) {

        //todo сюда можно еще воткнуть логин пользака и передавать параметром логопас
        //todo поменял браузер на фаерфокс
        Configuration.timeout = 10000;
        Configuration.browser = "firefox";
       // Configuration.startMaximized= true;
        open("http://192.168.238.65:10003/mvd/#backdoor");
            findInput("Логин:").setValue(sodchUsername);
            findInput("Пароль:").setValue(sodchPassword);
            button("Войти").click();


    }

}
