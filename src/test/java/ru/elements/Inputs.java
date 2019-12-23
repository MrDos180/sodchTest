package ru.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.locators.Selectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Inputs {
    public static SelenideElement findDiv (String name){
        return $(By.xpath(Selectors.findDiv(name)));
    }

    public static SelenideElement fabulaField () {
        return $(By.xpath("//span[.='Первичная фабула']//following::textarea"));
    }
    public static SelenideElement findPlaceholder (String name) {
        return $(By.xpath(Selectors.findPlaceholder(name)));
    }
    public static SelenideElement findInput (String name) {
        return   $(By.xpath(Selectors.findInput(name)));
    }
    public static SelenideElement summaryTextField (String name) {
        return  $$(By.xpath(Selectors.findTextArea(name))).filter(Condition.visible).get(0);
    }

    public static SelenideElement summaryDateField (String name) {
        return $$(By.xpath(Selectors.findInputbyLabel(name))).get(0);
    }

    public static SelenideElement summaryTimeField (String name) {
        return $$(By.xpath(Selectors.findInputbyLabel(name))).get(1);
    }


}
