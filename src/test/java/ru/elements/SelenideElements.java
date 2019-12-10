package ru.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import ru.locators.Buttons;
import ru.locators.Selectors;
import ru.locators.Span;

import static com.codeborne.selenide.Selenide.$;

public class SelenideElements {

    public static SelenideElement loginField () {
        return $(By.xpath(Selectors.findInput("Логин:")));
    }

    public static SelenideElement passwordField () {
        return $(By.xpath(Selectors.findInput("Пароль:")));
    }

    public static SelenideElement enterButton () {
        return  $(By.xpath(Selectors.findSpan("Войти")));
    }

    public static SelenideElement saveButton () {
        return $(By.xpath(Selectors.findSpan("Сохранить")));
    }

    public static SelenideElement surnameField () {
        return $(By.xpath(Selectors.findInput("Фамилия:")));
    }

    public static SelenideElement nameField () {
        return $(By.xpath(Selectors.findInput("Имя:")));
    }

    public static SelenideElement thirdnameField () {
        return $(By.xpath(Selectors.findInput("Отчество:")));
    }

    public static SelenideElement fabulaField () {
        return $(By.xpath("//span[.='Первичная фабула']//following::textarea"));
    }

    public static SelenideElement incidentField () {
        return $(By.xpath("//input[@placeholder='Форма поступления']"));
    }

    public static SelenideElement kuspNumber () {
        return $(By.xpath(Selectors.findInput("№:")));
    }

    public static SelenideElement closeButton () {
        return $(By.xpath(Selectors.findSpan("Закрыть")));
    }

    public static SelenideElement createKuspButton () {
        return   $(By.xpath(Selectors.findLabel("Создать КУСП")));
    }

    public static SelenideElement journalButton () {
        return   $(By.xpath(Selectors.findLabel("Журнал")));
    }

    public static SelenideElement createSummaryButton () {
        return   $(By.xpath(Selectors.findSpan("Создать")));
    }

    public static SelenideElement incidentSummaryField () {
        return   $(By.xpath(Selectors.findInput("Вид преступления")));
    }

    public static SelenideElement saveSummaryButton () {
        return   $(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-btn-green-btn-medium']"));
    }

    public static SelenideElement closeSummaryButton () {
        return   $(By.xpath("//span[.='Закрыть']//following::span"));
    }

    public static SelenideElement summaryFabulaField () {
        return  $(By.xpath(Selectors.findTextArea("Вид преступления")));
    }
/*
    public static SelenideElement summaryDateField () {
        return Label.summaryDateTimefield("Дата и время регистрации",0);
    }

    public static SelenideElement summaryTimeField () {
        return Label.summaryDateTimefield("Дата и время регистрации",1);
    }
*/



}
