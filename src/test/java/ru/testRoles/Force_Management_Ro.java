package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;
import static ru.elements.Buttons.kuspButton;

public class Force_Management_Ro {
    @Before
    public  void createUser () {

        createUserAction("Оператор УСиС (только просмотр)");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        kuspButton("Патрульные участки").shouldBe(visible).click();


        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Оператор УСиС (только просмотр)");
    }
}
