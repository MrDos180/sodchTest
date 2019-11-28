package ru.Sodch;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class TestTest {


   public static void loginAction (String sodchUsername, String sodchPassword) {
       $(By.xpath("//div[.='Логин:']//input")).setValue(sodchUsername);
       $(By.xpath("//div[.='Пароль:']//input")).setValue(sodchPassword);
       $(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small']")).click();
       $(By.xpath("//div[@class ='x-component x-box-item x-component-default']")).shouldBe(visible);


   }

   public static void createKusp() {
   $(By.xpath("//div[@class='x-container navigationItem x-container-default x-box-layout-ct']//label[.='Создать КУСП']")).click();
   $(By.xpath("//div[.='Фамилия:']//input")).shouldBe(visible);
   $(By.xpath("//div[.='Фамилия:']//input")).setValue("Иванов");
       $(By.xpath("//div[.='Имя:']//input")).setValue("Иван");
       $(By.xpath("//div[.='Отчество:']//input")).setValue("Иванович");
        $(By.xpath("//textarea[@class='x-form-field x-form-required-field x-form-text x-form-text-default x-form-textarea']")).setValue("тест");
        $(By.xpath("//input[@placeholder='Форма поступления']")).setValue("Анонимное сообщение о террористическом акте");
        $(By.xpath("//span[.='Сохранить']")).click();
        String kusp = $(By.xpath("//div[.='№:']//input")).getValue();



       $(By.xpath("//div[.='КУСП № "+ kusp+" успешно сохранен']")).shouldBe(hidden);
       $(By.xpath("//span[.='Закрыть']")).click();
       $(By.xpath("//div[.='"+kusp+"']")).shouldBe(visible);

   }
}
