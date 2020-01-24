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
import static ru.elements.Inputs.findDiv;

public class Employee_Rrd_Report {
    @Before
    public  void createUser () {

        createUserAction("Отчеты: Сотрудник УРД");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Отчеты").shouldBe(visible).click();
        findVisibleButton("Сформировать новый отчет").click();
        Inputs.findInput("Вид отчета:").setValue("Сверка уголовной статистики");
        Inputs.findInput("Формат:").setValue("xls").pressEnter();
        findVisibleButton("Сформировать").click();
        findDiv("Журнал отчетов").shouldBe(visible);
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Отчеты: Сотрудник УРД");
    }
}
