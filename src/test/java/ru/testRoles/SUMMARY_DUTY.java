package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;

public class SUMMARY_DUTY {
    @Before
    public  void createUser () {

        createUserAction("Оператор сводки");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
         SodchAction.createSummaryAction();





        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Оператор сводки");
    }
}
