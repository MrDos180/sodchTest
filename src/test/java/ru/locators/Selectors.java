package ru.locators;


public class Selectors {
    // ищеь Div
    public static String findDiv(String input) {
        return "//div[.='" + input + "']";
    }
    // Ищет элемент по Title
    public static String findInput(String input) {
        return "//div[.='" + input + "']//input";
    }

    public static String findInputbyLabel (String input){
        return  "//label[.='"+input+"']//following-sibling::div//input";
    }
    // ищет Label по тексту
    public static String findLabel (String input){
        return  "//label[.='"+input+"']";
    }
    // ищет Span потексту
    public static String findSpan(String input)
    {
        return ".//span[.='"+input+"']";
    }

    public static String findTextArea(String input)
    {
        return  "//span[.='"+input+":']//ancestor::div//textarea";
    }
    public static String findPlaceholder (String input)
    {
        return "//input[@placeholder='"+input+"']";
    }
    public static String findA (String input)
    {
        return "//a[.='"+input+"']";
    }
    public static String findSpantext (String input)
    {
        return "//span[text()='" + input + "']";
    }


}
