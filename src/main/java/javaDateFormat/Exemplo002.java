package javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo002 {
    public static void main(String[]args){
        //instancia
        Date data=new Date();
        //instancia
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yy");
        //retorna a data formatada
        String dataFormata=simpleDateFormat.format(data);
        System.out.println(dataFormata);

    }
}
