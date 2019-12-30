package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;
import ru.elements.Inputs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.createAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.createAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.*;


public class OPER_PLAN_INITIATOR {
    @Before
    public  void createUser () {

        createUserAction("Инициатор оперативных планов");

    }

    @Test
    public void checkRoleAction ()  {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Отчеты").shouldBe(visible).click();
        findVisibleButton("Сформировать новый отчет").click();
        Inputs.findInput("Вид отчета:").setValue("Отчет о выставлении личного состава");
        findVisibleButton("Выбрать").click();
        roleCheckbox("Ленский ЛОП").click();
        findunvisibleButton("Выбрать").click();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        Inputs.findInput("Начало периода:").setValue(dateFormat.format(date));
        Inputs.findInput("Конец периода:").setValue(dateFormat.format(date));
        findVisibleButton("Сформировать").click();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Инициатор оперативных планов");
    }
}
