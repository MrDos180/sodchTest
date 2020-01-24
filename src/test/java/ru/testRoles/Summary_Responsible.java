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

public class Summary_Responsible {
    @Before
    public  void createUser () {

        createUserAction("Ответственный за сводку");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Загрузка сводок").shouldBe(visible).click();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Ответственный за сводку");
    }
}
