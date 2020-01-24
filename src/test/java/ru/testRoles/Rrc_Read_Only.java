package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.СreateAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.*;

public class Rrc_Read_Only {
    @Before
    public  void createUser () {

        createUserAction("ЦОР: Просмотр событий");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        button("Поиск").shouldBe(visible).click();
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("ЦОР: Просмотр событий");
    }
}
