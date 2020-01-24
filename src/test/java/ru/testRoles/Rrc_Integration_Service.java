package ru.testRoles;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.actions.SodchAction;
import ru.actions.TestSetup;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static ru.actions.rolesAction.СreateAndDeleteRole.createUserAction;
import static ru.actions.rolesAction.СreateAndDeleteRole.deleteRoleAction;
import static ru.elements.Buttons.*;

public class Rrc_Integration_Service {
    @Before
    public  void createUser () {

        createUserAction("ЦОР Интеграция с внешними системами");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup();
        SodchAction.loginActionForCreate("usertest","usertest");
        button("События").shouldBe(visible).click();
        rrcButton("Создать").shouldBe(visible).click();
        $(By.xpath("//option[.='Криминальное (ЧП)']")).click();
        $(By.xpath("//option[.='Вологда']")).click();
        $(By.xpath("//textarea[@name='reportContent']")).sendKeys("123");

        rrcVisibleButton("Сохранить").scrollIntoView(false).click();
        $(By.xpath("//div[text()='Данные успешно сохранены']")).shouldBe(visible);


        close();

    }
    @After
    public void deleteRole (){
        deleteRoleAction("ЦОР Интеграция с внешними системами");
    }
}
