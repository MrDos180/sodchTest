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
import static ru.elements.Buttons.findVisibleButton;
import static ru.elements.Buttons.kuspButton;

public class Sorting_Inspector {
    @Before
    public  void createUser () {

        createUserAction("Инспектор по разбору");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest","usertest");
        kuspButton("Журнал").shouldBe(visible).click();
        findVisibleButton("Создать").click();
        Inputs.sortingField("Основание задержания и доставления:").setValue("ПОДОЗРЕВАЕТСЯ В СОВЕРШЕНИИ ПРЕСТУПЛЕНИЯ");
        Inputs.sortingField("Фамилия:").setValue("Иванов");
        Inputs.sortingField("Имя:").setValue("Иван");
        Inputs.sortingField("Отчество:").setValue("Иванович");
        findVisibleButton("Сохранить").click();
        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("Инспектор по разбору");
    }
}
