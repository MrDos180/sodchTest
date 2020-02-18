package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.actions.PpsAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.createNoMvdUserAction;
import static ru.actions.rolesAction.СreateAndDeleteRole.deleteNoMvdRoleAction;

public class Pps_Duty {
    @Before
    public  void createUser () {

        createNoMvdUserAction("Сотрудник ППС");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest1","usertest1");
        PpsAction.ppsDutyAction();
        close();

    }
    @After
    public void deleteRole (){
        deleteNoMvdRoleAction("Сотрудник ППС");
    }
}
