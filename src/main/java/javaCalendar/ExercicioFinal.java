package javaCalendar;

import java.util.Calendar;
import java.util.Date;

     public class ExercicioFinal {
     public static void main(String[]args){
         //declara uma variavel
         int qtdDias;
         //instancia
       Calendar calendar=Calendar.getInstance();
        System.out.println("====="+" Dia do vencimento "+"=====\n"+calendar.getTime());
        //adiciona 10 dias após da data de vencimento
       calendar.add(Calendar.DATE,10);
       //retorna o valor do campo
        int valorDia=calendar.get(calendar.SATURDAY);
        //aumenta dois dias a mais se valorDia é igual a 7
         if(valorDia==7){
             calendar.roll(calendar.DATE, 2);System.out.println("====="+" Dia úteis "+"===== \n"+calendar.getTime());
             qtdDias =10+2;
             System.out.println("Quantidade de dias restantes para pagar a fatura : "+qtdDias+" Dias");

        }
         //aumenta um dia a mais se valorDia é igual a 1
        else if (valorDia==1){
            calendar.roll(calendar.DATE, 1);
            System.out.println("====="+" Dia úteis "+"===== \n"+calendar.getTime());
            qtdDias =10+1;
            System.out.println("Quantidade de dias restantes para pagar a fatura : "+qtdDias+" Dias");

        }
        else{
            System.out.println(" Último dia para pagar fatura : "+calendar.getTime());
             qtdDias =10;
             System.out.println("Quantidade de dias restantes para pagar a fatura : "+qtdDias+" Dias");
        }
    }
}
