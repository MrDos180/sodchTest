package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.createAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.createAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.kuspButton;

public class SUMMARY_RO {
    @Before
    public  void createUser () {

        createUserAction("Оператор сводки (только просмотр)");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Журнал").shouldBe(visible).click();
        close();


    }
    @After
    public void deleteRole (){
        deleteRoleAction("Оператор сводки (только просмотр)");
    }
}
