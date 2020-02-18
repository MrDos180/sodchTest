package ru.elements.pps;

import com.codeborne.selenide.SelenideElement;
import ru.elements.Buttons;
import ru.elements.Inputs;
import ru.yandex.qatools.allure.annotations.Step;

public class BriefingPage {
    @Step("Сохранить.Кнопка")
    public static SelenideElement SaveButton()
    {return Buttons.findButtonPps("Дата и время:","Сохранить");}

    @Step("Тема")
    public static SelenideElement Topic()
    {return Inputs.findInput("Тема:");}

    @Step("Общая")
    public static SelenideElement General()
    {return Inputs.findTextarea("Общая:");}

    @Step("Специальная")
    public static SelenideElement Special()
    {return Inputs.findTextarea("Специальная:");}

    @Step("Дата и время")
    public static SelenideElement DataTime()
    {return Inputs.findInput("Дата и время:");}
}
