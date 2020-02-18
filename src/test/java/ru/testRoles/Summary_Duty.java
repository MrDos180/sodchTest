package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.*;

public class Summary_Duty {
    @Before
    public  void createUser () {

        createNoMvdUserAction("Оператор сводки");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest1","usertest1");
         SodchAction.createSummaryAction();





        close();

    }
    @After
    public void deleteRole (){
        deleteNoMvdRoleAction("Оператор сводки");
    }
}
