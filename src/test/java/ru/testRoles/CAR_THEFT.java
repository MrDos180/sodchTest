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

public class CAR_THEFT {
    @Before
    public  void createUser () {

        createUserAction("ЗИЦ автоугон");

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
        deleteRoleAction("ЗИЦ автоугон");
    }
}
