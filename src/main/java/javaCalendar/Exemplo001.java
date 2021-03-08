package javaCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Exemplo001 {
    public static void main(String []args){
        //instancia
        Calendar calendar=Calendar.getInstance() ;
        System.out.println("A data Atual : "+calendar.getTime());

        //Adiciona dados (dias) dentro do calencar
        calendar.add(Calendar.DATE,-15);
    System.out.println("15 dia atrás : "+calendar.getTime());
        //Adiciona meses
        calendar.add(Calendar.MONTH,4);
        System.out.println("4 meses depois : "+calendar.getTime());
        //Adiona anos
        calendar.add(Calendar.YEAR,4);
        System.out.println("4 anos depois : "+calendar.getTime());


    }
}
