package ru.actions;

import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Description;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
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

   public static void createSummary () {
       journalButton().click();
       createSummaryButton().click();

      incidentSummaryField().setValue("Разбой");

       SelenideElement fabula = $$(By.xpath("//span[.='Раздел сводки:']//ancestor::div//textarea")).get(0);

       fabula.setValue("тест");

       SelenideElement summaryDate = $$(By.xpath("//label[.='Дата и время регистрации:']//following-sibling::div//input")).get(0);
       SelenideElement summaryTime= $$(By.xpath("//label[.='Дата и время регистрации:']//following-sibling::div//input")).get(1);

       String sumDate = summaryDate.getValue();
       String sumTime = summaryTime.getValue();


       saveSummaryButton().click();
       closeSummaryButton().click();



       System.out.println(sumDate +" "+sumTime);
      $(By.xpath("//div[.='"+ sumDate +" "+sumTime+"']")).shouldBe(visible);


   }


}
