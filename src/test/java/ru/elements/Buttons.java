package ru.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.locators.Selectors;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Buttons {


    public static SelenideElement button (String name) {
        return  $(By.xpath(Selectors.findSpan(name)));
    }
    public static SelenideElement kuspButton (String name) {
        return   $(By.xpath(Selectors.findLabel(name)));
    }
    public static SelenideElement findVisibleButton (String name) {
        return   $$(By.xpath(Selectors.findSpantext(name))).filter(Condition.visible).get(0);
    }

    public static SelenideElement roleCheckbox (String name){
        return  $(By.xpath("//div[.='"+name+"']//ancestor::tr//div[@class='x-grid-row-checker']"));
    }



}
