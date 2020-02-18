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
import static ru.elements.Buttons.findVisibleButton;
import static ru.elements.Buttons.kuspButton;

public class Gibdd_Admin {
    @Before
    public  void createUser () {

        createUserAction("Администратор ГИБДД");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Администратор ГИБДД");
    }
}
