package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;
import ru.elements.Inputs;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;

import static ru.elements.Buttons.kuspButton;

public class CCP_DOZNAVATEL_PROSMOTR {
    @Before
    public  void createUser () {

        createUserAction("Дознаватель-следователь (только просмотр)");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        Inputs.findDiv("Рабочий стол").shouldBe(visible);



        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Дознаватель-следователь (только просмотр)");
    }
}