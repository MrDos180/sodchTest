package ru.Sodch;

import jdk.jfr.Description;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static ru.elements.SelenideElements.*;

public class SodchAction {

    @Description("login SODCH")


   public static void loginAction (String sodchUsername, String sodchPassword) {
       loginField().setValue(sodchUsername);
       passwordField().setValue(sodchPassword);
       enterButton().click();
       createKuspButton().shouldBe(visible);


   }
    @Description("create KUSP")
   public static void createKusp() {
    createKuspButton().click();
    surnameField().shouldBe(visible);
       surnameField().setValue("Иванов");
       nameField().setValue("Иван");
       thirdnameField().setValue("Иванович");
        fabulaField().setValue("тест");
        incidentField().setValue("Анонимное сообщение о террористическом акте");
        saveButton().click();
        String kusp = kuspNumber().getValue();



       $(By.xpath("//div[.='КУСП № "+ kusp+" успешно сохранен']")).shouldBe(hidden);
        closeButton().click();
       $(By.xpath("//div[.='"+kusp+"']")).shouldBe(visible);

   }
}
