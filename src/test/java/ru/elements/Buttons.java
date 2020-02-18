package ru.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.locators.Selectors;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Buttons {

//todo с таким локатором кнопок ты обосрешься в большом проекте. у тебя дублирующих кнопок может быть много поэтому старайся о таких вещах сразу думать заранее
    public static SelenideElement button (String name) {
        return  $(By.xpath(Selectors.findSpan(name)));
    }
    public static SelenideElement kuspButton (String name) {
        return   $(By.xpath(Selectors.findLabel(name)));
    }
    public static SelenideElement findVisibleButton (String name) {
        return   $$(By.xpath(Selectors.findSpantext(name))).filter(Condition.visible).get(0);
    }
    //todo если ты сделал куски селекторов, почему в локаторах их не используешь?
    public static SelenideElement roleCheckbox (String name){
        return  $$(By.xpath("//div[.='"+name+"']//ancestor::tr//div[@class='x-grid-row-checker']")).filter(Condition.visible).get(0);
    }
    public static SelenideElement planTime (String name){
        return $$(By.xpath("//div[.='"+name+"']//div")).filter(Condition.visible).get(0);
    }
    public static SelenideElement findunvisibleButton (String name) {
        return   $$(By.xpath(Selectors.findSpantext(name))).filter(Condition.visible).get(1);
    }
    public static SelenideElement rrcButton (String name) {
        return $(By.xpath(Selectors.findRrcButton(name)));
    }

    public static SelenideElement rrcVisibleButton (String name) {
        return $$(By.xpath(Selectors.findRrcButton(name))).filter(Condition.visible).get(0);
    }
    // Ищет А с открытой вкладкой в роли pps_duty
    public static SelenideElement findAPps (String name){return $(By.xpath(Selectors.findAOpen(name)));}
    public static SelenideElement findA (String name){return $(By.xpath(Selectors.findA(name)));}

    public static SelenideElement findButtonPps (String name1,String name2){return $$(By.xpath(Selectors.findDivAncestor(name1)+Selectors.findSpan(name2))).filter(Condition.visible).get(0);
    }


}
