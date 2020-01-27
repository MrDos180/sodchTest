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

import static ru.elements.Buttons.kuspButton;

public class Ccp_Doznavatel_Prosmotr {
    @Before
    public  void createUser () {
        //todo нужно сделать лучше метод, который проверяет в целом нет ли там ролей. если они есть - удаляет все роли и добавляет только одну. Это универсальнее
        createUserAction("Дознаватель-следователь (только просмотр)");

    }
    //todo тест не работает, потому что у чувака есть еще роли. автоматом уори не открывается и после этого теста не закрывается хром. подумай как можно решить нестабильность.
    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        Inputs.findDiv("Рабочий стол").shouldBe(visible);



        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Дознаватель-следователь (только просмотр)");
    }
}
