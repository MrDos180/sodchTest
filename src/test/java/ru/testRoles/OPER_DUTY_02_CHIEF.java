package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;

public class OPER_DUTY_02_CHIEF {
    @Before
    public  void createUser () {

        createUserAction("Начальник смены");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
       // SodchAction.createKuspAction();





        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Начальник смены");
    }
}


