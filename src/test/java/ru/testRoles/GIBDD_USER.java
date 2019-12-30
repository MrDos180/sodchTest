package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;
import ru.elements.Inputs;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.createAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.createAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.findVisibleButton;
import static ru.elements.Buttons.kuspButton;

public class GIBDD_USER {
    @Before
    public  void createUser () {

        createUserAction("Сотрудник ГИБДД");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Учет ТС").shouldBe(visible).click();
        findVisibleButton("Добавить").click();
        Inputs.findInput("Марка:").setValue("ЗИЛ");
        Inputs.findInput("Модель:").setValue("123");
        Inputs.findInput("Тип кузова:").setValue("БОРТОВАЯ");
        Inputs.findInput("Гос. номер:").setValue("к123ех777");
        Inputs.findInput("Отображать на карте:").click();




        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Сотрудник ГИБДД");
    }
}
