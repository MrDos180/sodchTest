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

public class Analyst {
    @Before
    public  void createUser () {

        createUserAction("Аналитик");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        kuspButton("Статические отчеты").shouldBe(visible).click();
        findVisibleButton("Сформировать новый отчет").click();
        Inputs.findInput("Вид отчета:").setValue("Отчет по отсутствующим номерам КУСП");
        Inputs.findInput("Формат:").setValue("xls");
        findVisibleButton("Сформировать").click();
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Аналитик");
    }
}
