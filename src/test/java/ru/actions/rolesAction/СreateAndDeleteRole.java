package ru.actions.rolesAction;

import ru.actions.SodchAction;
import ru.actions.TestSetup;
import ru.elements.Inputs;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.close;
import static ru.elements.Buttons.*;
import static ru.elements.Inputs.*;

public class СreateAndDeleteRole {

    public static void createUserAction(String name) {

        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("usertest").doubleClick();
        findVisibleButton("Назначить роль").click();
        //Inputs.nubmberOfRolePage().setValue(page).pressEnter();
       // rolesView("отображать по").click();
       // rolesViewNumber("50").click();

        Inputs.nameFilterRole().setValue(name);
        roleCheckbox(name).scrollIntoView("{block: \"center\"}").click();
        button("Выбрать").click();
        findVisibleButton("Сохранить").click();
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();

    }


    public static void deleteRoleAction (String name){
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("usertest").doubleClick();
        findVisibleDiv(name).click();
        button("Удалить роль").click();
        findVisibleButton("Сохранить").click();
        findDiv("Роль удалена").shouldBe(disappear);
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();
    }
}
