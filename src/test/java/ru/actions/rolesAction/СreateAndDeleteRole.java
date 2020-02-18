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


    //todo нет описания методов. не сразу понятно что делает каждый из методов если ты не погружен в контекст
    public static void createUserAction(String name) {

        TestSetup.loginSetup("iivanov","iivanov");
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
        //todo не disappear а visible и надо еще проверять что всплывюащее окно пропало.
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();

    }


    public static void deleteRoleAction (String name){
        TestSetup.loginSetup("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        //todo и всё же старайся не делать в экшнах элементов типа finddiv, потому что нихуа непонятно что делает экшн из-за таких шагов. Лучше делать доп прослойку, где у тебя название элемента будет и туда транслировать селенид элемент

        findDiv("usertest").doubleClick();
        findVisibleDiv(name).click();
        button("Удалить роль").click();
        findVisibleButton("Сохранить").click();
        findDiv("Роль удалена").shouldBe(disappear);
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();
    }

    public static void createNoMvdUserAction(String name) {

        TestSetup.loginSetup("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("Нижестоящие тер. органы").click();
        findInput("Логин").sendKeys("usertest1");
        findDiv("usertest1").doubleClick();

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

    public static void deleteNoMvdRoleAction (String name){
        TestSetup.loginSetup("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("Нижестоящие тер. органы").click();
        findInput("Логин").sendKeys("usertest1");
        findDiv("usertest1").doubleClick();
        findVisibleDiv(name).click();
        button("Удалить роль").click();
        findVisibleButton("Сохранить").click();
        findDiv("Роль удалена").shouldBe(disappear);
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();
    }

}
