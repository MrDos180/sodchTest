package ru.actions;

import com.codeborne.selenide.Condition;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static ru.elements.Buttons.*;
import static ru.elements.Inputs.*;


public class SodchAction {

    @Description("login SODCH")


   public static void loginAction (String sodchUsername, String sodchPassword) {
        inputField("Логин:").setValue(sodchUsername);
        inputField("Пароль:").setValue(sodchPassword);
       button("Войти").click();
       kuspButton("Создать КУСП").shouldBe(visible);


   }
    @Description("create KUSP")
   public static void createKusp() {
        kuspButton("Создать КУСП").click();
    inputField("Фамилия:").shouldBe(visible).setValue("Иванов");
        inputField("Имя:").setValue("Иван");
        inputField("Отчество:").setValue("Иванович");
        fabulaField().setValue("тест");
        incidentField("Форма поступления").setValue("Анонимное сообщение о террористическом акте");
        button("Сохранить").click();
        String kusp = findInput("№:").getValue();
       $(By.xpath("//div[.='КУСП № "+ kusp+" успешно сохранен']")).shouldBe(hidden);
        button("Закрыть").click();
       $(By.xpath("//div[.='"+kusp+"']")).shouldBe(visible);

   }

   public static void createSummary () {
       kuspButton("Журнал").click();
       button("Создать").click();
      findInput("Вид преступления:").setValue("Разбой");
      summaryTextField("Фабула").setValue("тест");
       String sumDate = summaryDateField("Дата и время регистрации:").getValue();
       String sumTime = summaryTimeField("Дата и время регистрации:").getValue();
       findVisibleButton("Сохранить").click();
       button("Закрыть").click();
      $$(By.xpath("//div[.='"+ sumDate +" "+sumTime+"']")).filter(visible).get(0).shouldBe(visible);


   }


}
