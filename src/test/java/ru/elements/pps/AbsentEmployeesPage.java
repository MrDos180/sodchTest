package ru.elements.pps;

import com.codeborne.selenide.SelenideElement;
import ru.elements.Buttons;
import ru.elements.Inputs;
import ru.yandex.qatools.allure.annotations.Step;

public class AbsentEmployeesPage {
    @Step("Отсутствуют всего")
    public static SelenideElement MissingTotal()
    {return Inputs.findInput("Отсутствуют всего:");}

    @Step("В отпуске")
    public static SelenideElement InVacation()
    {return Inputs.findInput("В отпуске:");}

    @Step("Выходные")
    public static SelenideElement Weekends()
    {return Inputs.findInput("Выходные:");}

    @Step("Больные")
    public static SelenideElement Sick()
    {return Inputs.findInput("Больные:");}

    @Step("Командировка:")
    public static SelenideElement BuisnessTrip()
    {return Inputs.findInput("Командировка:");}

    @Step("По другим причинам:")
    public static SelenideElement OtherReasons()
    {return Inputs.findInput("По другим причинам:");}

    @Step("Добавить.Кнопка")
    public static SelenideElement AddButton()
    {return Buttons.findVisibleButton("Добавить");}

    @Step("Имя")
    public static SelenideElement Name()
    {return Inputs.findInput("Имя:");}

    @Step("Имя")
    public static SelenideElement Surame()
    {return Inputs.findInput("Фамилия:");}

    @Step("Имя")
    public static SelenideElement MiddleName()
    {return Inputs.findInput("Отчество:");}

    @Step("Должность")
    public static SelenideElement Position()
    {return Inputs.findInput("Должность:");}

    @Step("Звание")
    public static SelenideElement Title()
    {return Inputs.findInput("Звание:");}

    @Step("Причина отсутствия")
    public static SelenideElement ReasonAbsence()
    {return Inputs.findInput("Причина отсутствия:");}

    @Step("Сохранить.Кнопка")
    public static SelenideElement SaveButton()
    {return Buttons.findButtonPps("Причина отсутствия:","Сохранить");}
}
