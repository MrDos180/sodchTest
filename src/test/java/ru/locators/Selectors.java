package ru.locators;


public class Selectors {
    // ищет Div
    public static String findDiv(String input) {
        return "//div[.='" + input + "']";
    }
    // Ищет элемент ввода
    public static String findInput(String input) {
        return "//div[.='" + input + "']//input";
    }

    public static String findInputbyLabel (String input){
        return  "//label[.='"+input+"']//following-sibling::div//input";
    }
    public static String findInputbyDiv (String input){
        return  "//div[.='"+input+"']//following-sibling::div//input";
    }
    // ищет Label по тексту
    public static String findLabel (String input){
        return  "//label[.='"+input+"']";
    }
    // ищет Span потексту
    public static String findSpan(String input)
    {
        return "//span[.='"+input+"']";
    }

    public static String findTextAreaByDiv(String input) {return "//div[.='"+input+"']//textarea";}
    public static String findTextArea(String input)
    {
        return  "//span[.='"+input+":']//ancestor::div//textarea";
    }
    public static String findPlaceholder (String input)
    {
        return "//input[@placeholder='"+input+"']";
    }
    // Ищет эелемент A
    public static String findA (String input)
    {
        return "//a[.='"+input+"']";
    }
    // Ищет Span по тексту
    public static String findSpantext (String input)
    {
        return "//span[text()='" + input + "']";
    }


}
