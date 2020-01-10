package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;
import static ru.elements.Buttons.kuspButton;

public class RADIO_DUTY_STATION {
    @Before
    public  void createUser () {

        createUserAction("Радиоцентр ДЧ");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Журнал КП02").shouldBe(visible).click();



        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Радиоцентр ДЧ");
    }
}
