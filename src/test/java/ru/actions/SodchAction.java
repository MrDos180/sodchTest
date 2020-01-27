package ru.actions;


import jdk.jfr.Description;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;
import static ru.elements.Buttons.*;
import static ru.elements.Inputs.*;


public class SodchAction {

    @Description("login SODCH")

    //todo в чём разница двух первых методов? почему код дублируется?
   public static void loginAction (String sodchUsername, String sodchPassword) {
        findInput("Логин:").setValue(sodchUsername);
        findInput("Пароль:").setValue(sodchPassword);
       button("Войти").click();
       kuspButton("Создать КУСП").shouldBe(visible);

   }
    public static void loginActionForCreate (String sodchUsername, String sodchPassword) {
        findInput("Логин:").setValue(sodchUsername);
        findInput("Пароль:").setValue(sodchPassword);
        button("Войти").click();


    }

    @Description("create KUSP")
   public static void createKuspAction() {
        kuspButton("Создать КУСП").click();
    findInput("Фамилия:").shouldBe(visible).setValue("Иванов");
        findInput("Имя:").setValue("Иван");
        findInput("Отчество:").setValue("Иванович");
        fabulaField().setValue("тест");
        findPlaceholder("Форма поступления").setValue("Анонимное сообщение о террористическом акте");
        findVisibleButton("Сохранить").click();
        String kusp = findInput("№:").getValue();
        findDiv("КУСП № "+ kusp+" успешно сохранен");
        button("Закрыть").click();
        kuspButton("В работе").click();
       findDiv(kusp).shouldBe(visible);

   }

   public static void createSummaryAction () {
       kuspButton("Журнал").click();
       button("Создать").click();
      findInput("Вид преступления:").setValue("Разбой");
      summaryTextField("Фабула").setValue("тест");
       String sumDate = summaryDateField("Дата и время регистрации:").getValue();
       String sumTime = summaryTimeField("Дата и время регистрации:").getValue();
       findVisibleButton("Сохранить").click();
       button("Закрыть").click();
       //todo старайся в методах экшнах не испольовать селенид локаторы. для определения локаторов у тебя есть другие места в структуре
       $$(By.xpath("//div[.='"+ sumDate +" "+sumTime+"']")).filter(visible).get(0).shouldBe(visible);


   }




}
