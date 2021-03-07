package javaDate;

import java.util.Calendar;
import java.util.Date;
import java.util.function.LongBinaryOperator;

public class ExercicioFinal {
    public static void main(String[]args){
        //instancia
       // Calendar calendar=new Calendar(2010,HAITI);

        @Deprecated
        Date meudataNascimento=new Date(94,03,10);
        Long currentgetTime= meudataNascimento.getTime();
        Date dateNovo=new Date(currentgetTime);
        @Deprecated
        Date novoDate=new Date(+2010,05,15);
        Long currentNovoDate= novoDate.getTime();
        Date novaDateAtual=new Date(currentNovoDate);
        System.out.println(dateNovo);
        System.out.println(currentgetTime);
        System.out.println(novaDateAtual);





    }
}
