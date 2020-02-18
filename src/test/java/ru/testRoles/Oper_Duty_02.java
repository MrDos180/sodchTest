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
import static ru.elements.Buttons.button;
import static ru.elements.Buttons.kuspButton;

public class Oper_Duty_02 {
    @Before
    public  void createUser () {

        createNoMvdUserAction("Оператор  02");

    }

    @Test
    public void checkRoleAction () {
        TestSetup.loginSetup("usertest1","usertest1");
        kuspButton("Создать КП02").shouldBe(visible).click();
        Inputs.findVisibleInput("Адрес:").setValue("г. Москва, пр-кт. Мира, 112");
        Inputs.findInput("Тип происшествия:").setValue("Взрыв");
        Inputs.findInput("Фамилия:").setValue("Иванов");
        Inputs.wantedTextField("Сообщение:").setValue("тест");
        Inputs.findInput("Фамилия:").setValue("Иванов");
        Inputs.findInput("Имя:").setValue("Иван");
        Inputs.findInput("Отчество:").setValue("Иванович");
        button("Сохранить (F2)").click();


        close();

    }
    @After
    public void deleteRole (){
        deleteNoMvdRoleAction("Оператор  02");
    }
}
