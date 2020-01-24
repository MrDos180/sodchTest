package ru.testRoles;

import org.junit.*;
import ru.actions.SodchAction;
import ru.actions.TestSetup;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;
import static ru.elements.Buttons.*;
import static ru.elements.Inputs.*;


public class Dispatcher_Usis {


    @Before
    public  void createUser () {

        createUserAction("Диспетчер УСИС");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("История маршрута ").shouldBe(visible).click();
        switchTo().window(1);
       findVisibleButton("Сформировать").shouldBe(visible);
        close();


    }
    @After
    public void deleteRole (){
        deleteRoleAction("Диспетчер УСИС");
    }

}
