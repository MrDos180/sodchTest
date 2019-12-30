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

public class OMVD_DUTY_REPORT {

    @Before
    public  void createUser () {

        createUserAction("Отчеты: Оперативный дежурный");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Отчеты").shouldBe(visible).click();
        findVisibleButton("Сформировать новый отчет").click();
        Inputs.findInput("Вид отчета:").setValue("Просрочен срок принятия решения по записи КУСП (от 3 суток до 10 суток)");
        Inputs.findInput("Формат:").setValue("xls");
        findVisibleButton("Сформировать").click();



        close();


    }
    @After
    public void deleteRole (){
        deleteRoleAction("Отчеты: Оперативный дежурный");
    }
}
