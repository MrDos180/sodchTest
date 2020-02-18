package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;
import static ru.elements.Buttons.button;
import static ru.elements.Buttons.kuspButton;

public class Mobile_Squad {
    @Before
    public  void createUser () {

        createUserAction("Сотрудник мобильного наряда");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        button("В работе").shouldBe(visible).click();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Сотрудник мобильного наряда");
    }
}
