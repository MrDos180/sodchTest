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

public class Oper_Plan_Admin {
    @Before
    public  void createUser () {

        createUserAction("Администратор оперативных планов");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Патрульные участки").shouldBe(visible).click();
        findVisibleButton("Добавить").click();
        Inputs.findInput("Тип наряда:").setValue("ДПС");
        Inputs.findInput("Номер маршрута:").setValue("1");
        Inputs.findInput("Номер смены:").setValue("1");
        Inputs.findInput("Кол-во сотрудников:").setValue("2");
        Inputs.findInput("Время начала:").setValue("10:00");
        Inputs.findInput("Время окончания:").setValue("11:00");
        findVisibleButton("Добавить в смену").click();
        findVisibleButton("Сохранить").click();


        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Администратор оперативных планов");
    }
}
