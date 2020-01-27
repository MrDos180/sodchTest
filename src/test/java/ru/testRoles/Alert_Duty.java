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
import static ru.elements.Buttons.*;

public class Alert_Duty {
    @Before
    public  void createUser () {

        createUserAction("Дежурный по оповещению");

    }

    @Test
    //todo методы тестовые тоже называй понятно, а не обстрактно
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("Полученные").shouldBe(visible).click();
        findVisibleButton("Создать").click();
        Inputs.findInput("Тема:").setValue("тест");
       Inputs.wantedTextField("Текст оповещения:").setValue("тест");
        findVisibleButton("Добавить").click();
        roleCheckbox("ЛО МВД России в аэропорту Внуково").click();
        button("Выбрать").click();
        findVisibleButton("Сохранить").click();

        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Дежурный по оповещению");
    }
}
