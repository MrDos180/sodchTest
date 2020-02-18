package ru.elements.pps;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.elements.Buttons;
import ru.elements.Inputs;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class ChecksPage {
    @Step("Сохранить.Кнопка")
    public static SelenideElement SaveButton()
    {return Buttons.findButtonPps("Результаты:","Сохранить");}


    @Step("Наряды проверки")
    public static SelenideElement ChecksInput()
    {return Inputs.findInput("Наряды проверки:");}

    @Step("Добавить.Кнопка")
    public static SelenideElement ChecksAddButton()
    {return Buttons.findButtonPps("Наряды проверки:","Добавить");}


    @Step("Сохранить.Зеленая кнопка")
    public static SelenideElement SaveGreenButton()
    {return Buttons.findVisibleButton("Сохранить");}

    @Step("Закрыть.Кнопка")
    public static SelenideElement CloseButton()
    {return Buttons.findVisibleButton("Закрыть");}

    @Step("Постовая ведомость за указанную дату уже сформирована. Всплывающие сообщение")
    public static SelenideElement StatementMessage()
    {return Inputs.findDiv("Постовая ведомость за указанную дату уже сформирована");}


    @Step("Всплывающие сообщение")
    public static SelenideElement PpsSaveMessage()
    {return $(By.xpath("//div[contains(@id,'toast')]"));}

}


