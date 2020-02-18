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
//todo старайся комментировать все куски, иначе потом запутаешься
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

    public static String findRrcButton (String input){
        return "//button[.='" + input + "']";
    }
    public static String findDivByText(String input) {
        return "//div[text()='" + input + "']";
    }
    // Ищет верний элемент на странице
    public static String findDivPps (String input) { return "//div[.='" + input + "']/following-sibling::div";}
    // Ищет второй элемент на странице
    public static String findSecondDivPps (String input){return "//div[.='" + input + "']/ancestor::fieldset";}
    // Ищет input на странице
    public static String findInputPps (String input){return "//div[.='" + input + "']//input";}
    // Ищет A с открытой вкладкой
    public static String findAOpen (String input)
    {
        return "//a[.='" + input + "' and contains(@class,'x-tab-active')]";
    }
    //div[.='Причина отсутствия:']//ancestor::div//span[.='Сохранить']
    // Находит Div через ancestor
    public static String findDivAncestor (String input){return "//div[.='" + input + "']//ancestor::div" ; }

}
