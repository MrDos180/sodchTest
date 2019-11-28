package ru.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelenideElements {

    public static SelenideElement loginField () {
        return $(By.xpath("//div[.='Логин:']//input"));
    }

    public static SelenideElement passwordField () {
        return $(By.xpath("//div[.='Пароль:']//input"));
    }
    public static SelenideElement enterButton () {
        return  $(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small']"));
    }


    public static SelenideElement saveButton () {
        return $(By.xpath("//span[.='Сохранить']"));
    }

    public static SelenideElement surnameField () {
        return $(By.xpath("//div[.='Фамилия:']//input"));
    }

    public static SelenideElement nameField () {
        return $(By.xpath("//div[.='Имя:']//input"));
    }

    public static SelenideElement thirdnameField () {
        return $(By.xpath("//div[.='Отчество:']//input"));
    }

    public static SelenideElement fabulaField () {
        return $(By.xpath("//textarea[@class='x-form-field x-form-required-field x-form-text x-form-text-default x-form-textarea']"));
    }

    public static SelenideElement incidentField () {
        return $(By.xpath("//input[@placeholder='Форма поступления']"));
    }

    public static SelenideElement kuspNumber () {
        return $(By.xpath("//div[.='№:']//input"));
    }

    public static SelenideElement closeButton () {
        return  $(By.xpath("//span[.='Закрыть']"));
    }

    public static SelenideElement createKuspButton () {
        return   $(By.xpath("//div[@class='x-container navigationItem x-container-default x-box-layout-ct']//label[.='Создать КУСП']"));
    }



}
