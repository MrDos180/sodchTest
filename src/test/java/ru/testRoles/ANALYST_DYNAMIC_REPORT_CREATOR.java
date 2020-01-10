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

public class ANALYST_DYNAMIC_REPORT_CREATOR {
    @Before
    public  void createUser () {

        createUserAction("Аналитик: создатель динамических отчетов");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Конструктор шаблонов").shouldBe(visible).click();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Аналитик: создатель динамических отчетов");
    }
}
