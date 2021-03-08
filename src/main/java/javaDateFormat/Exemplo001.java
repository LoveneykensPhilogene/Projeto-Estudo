package javaDateFormat;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {
        //instanciar
        Date date = new Date();
        //retorna a data padrao
        String dataFormat = DateFormat.getInstance().format(date);
        System.out.println(dataFormat);
        //padrao Long e Short
        dataFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
        System.out.println(dataFormat);
        //retorna tipo long
        dataFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(date);
        System.out.println(dataFormat);


    }
}