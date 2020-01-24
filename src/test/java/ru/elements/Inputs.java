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
    public static SelenideElement findVisibleInput (String name) {
        return   $$(By.xpath(Selectors.findInput(name))).filter(Condition.visible).get(1);
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

    public static SelenideElement wantedTextField (String name){
        return $(By.xpath(Selectors.findTextAreaByDiv(name)));
    }
    public static SelenideElement sortingField (String name){
        return $$(By.xpath(Selectors.findInput(name))).filter(Condition.visible).get(0);    }

     public static SelenideElement rolesView (String name){
        return $$(By.xpath(Selectors.findInputbyDiv(name))).filter(Condition.visible).get(0);
     }

     public static SelenideElement rolesViewNumber(String name) {
        return $(By.xpath("//li[.='"+name+"']"));
    }
    public static SelenideElement findVisibleDiv (String name){
        return $$(By.xpath(Selectors.findDiv(name))).filter(Condition.visible).get(0);
    }

    public static SelenideElement nubmberOfRolePage () {
        return $$(By.xpath("//input[@name='inputItem']")).filter(Condition.visible).get(0);
    }
    public static SelenideElement nameFilterRole () {
        return $(By.xpath("//div[.='Наименование']//input"));
    }

    public static SelenideElement findDivByTextRrc (String name){
        return $(By.xpath(Selectors.findDivByText(name)));
    }
    public static SelenideElement findRrcList (String name){
        return $(By.xpath("//option[.='"+name+"']"));
    }
    public static SelenideElement findRrcFabula (){
        return $(By.xpath("//textarea[@name='reportContent']"));
    }
}
