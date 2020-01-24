package ru.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreatingDate {
    public static String currentDay() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
       return dateFormat.format(date);

    }
    public static String dateMinusDay(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(date) ;
    }

}
