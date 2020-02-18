package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.actions.SodchAction;
import ru.actions.TestSetup;
import ru.elements.Inputs;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.СreateAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.*;

public class Rrc_Operator {
    @Before
    public  void createUser () {

        createUserAction("ЦОР Оператор");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        button("События").shouldBe(visible).click();
        rrcButton("Создать").shouldBe(visible).click();
        Inputs.findRrcList("Криминальное (ЧП)").click();
        Inputs.findRrcList("Вологда").click();
        Inputs.findRrcFabula().sendKeys("123");
        rrcVisibleButton("Сохранить").scrollIntoView(false).click();
        Inputs.findDivByTextRrc("Данные успешно сохранены").shouldBe(visible);
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("ЦОР Оператор");
    }
}
