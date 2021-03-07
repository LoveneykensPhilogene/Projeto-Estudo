package javaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo005 {
    public static void main(String[]arg){
        //Exemplo001
        Date exemplo001=new Date();
        System.out.println(exemplo001);
        //exemplo002
        Long exemplo002CurrentTimeMillis=System.currentTimeMillis();
        Date exemplo002Date=new Date(exemplo002CurrentTimeMillis);
        System.out.println(exemplo002CurrentTimeMillis);
        //exemplo003
        boolean exemplo003IsAfter=exemplo001.after(exemplo002Date);
        boolean exemplo003IsBefore=exemplo002Date.before(exemplo001);
        System.out.println(exemplo003IsAfter);
        System.out.println(exemplo003IsBefore);
        //exemplo004
        boolean exemplo004IsEquals=exemplo001.equals(exemplo002Date);
        System.out.println(exemplo004IsEquals);
        int exemplo004IsCompare=exemplo002Date.compareTo(exemplo001);
        System.out.println(exemplo004IsCompare);
        //declara uma variavel do tipo instant
        Instant instant=exemplo002Date.toInstant();
         System.out.println(instant);




    }
}
