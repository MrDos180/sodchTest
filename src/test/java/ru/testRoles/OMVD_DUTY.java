package ru.testRoles;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.*;
import org.openqa.selenium.By;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import javax.swing.*;

import java.util.Set;

import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.driver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static ru.elements.Buttons.*;
import static ru.elements.Inputs.*;


public class OMVD_DUTY {


    @Before
    public  void createUserAction () {

        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("usertest").doubleClick();
        findVisibleButton("Назначить роль").click();
        roleCheckbox("Диспетчер УСИС").click();
        button("Выбрать").click();
        findVisibleButton("Сохранить").click();
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        kuspButton("История маршрута ").shouldBe(visible).click();
        switchTo().window(1);
       findVisibleButton("Сформировать").shouldBe(visible).click();
        close();


    }
    @After
    public void deleteRoleAction (){
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("iivanov","iivanov");
        kuspButton("Пользователи и группы").shouldBe(visible).click();
        findDiv("usertest").doubleClick();
        findDiv("Диспетчер УСИС").click();
        button("Удалить роль").click();

        findVisibleButton("Сохранить").click();

        findDiv("Роль удалена").shouldBe(disappear);
        findDiv("Изменения успешно сохранены").shouldBe(disappear);
        close();
    }

}
