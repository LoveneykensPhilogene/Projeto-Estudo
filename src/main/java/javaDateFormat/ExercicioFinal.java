package javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinal {
    public static void main(String[]args){
        //intancia
        Date data=new Date();
        //instancia
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyy  hh:mm:ss:mmm");
        String dataformatada=simpleDateFormat.format(data);
        System.out.println("A data está formatada : "+dataformatada);
    }
}
