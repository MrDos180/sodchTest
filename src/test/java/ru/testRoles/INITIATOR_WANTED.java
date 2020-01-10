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

public class INITIATOR_WANTED {
    @Before
    public  void createUser () {

        createUserAction("Инициатор Ориентировки");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Журнал").shouldBe(visible).click();
        findVisibleButton("Создать").click();
        Inputs.wantedTextField("ТЕКСТ ОРИЕНТИРОВКИ").setValue("тест");
        findVisibleButton("Сохранить").click();
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Инициатор Ориентировки");
    }
}
