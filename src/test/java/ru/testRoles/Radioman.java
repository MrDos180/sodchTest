package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.switchTo;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;
import static ru.elements.Buttons.kuspButton;

public class Radioman {
    @Before
    public  void createUser () {

        createUserAction("Радиооператор");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        kuspButton("Опер. обстановка").shouldBe(visible).click();
        switchTo().window(1);
        kuspButton("Свой тер. орган").shouldBe(visible);

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Радиооператор");
    }
}