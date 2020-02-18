package ru.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreatingDate {



    public static String date(int day) {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, day);
            Date date = cal.getTime();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            return dateFormat.format(date);

    }




}
