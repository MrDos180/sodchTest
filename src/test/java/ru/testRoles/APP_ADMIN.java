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
import static ru.elements.Inputs.findDiv;

public class APP_ADMIN {

    @Before
    public  void createUser () {

        createUserAction("Администратор приложения");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("usertest").doubleClick();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Администратор приложения");
    }
}
