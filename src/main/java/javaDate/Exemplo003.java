package javaDate;

import java.util.Date;

public class Exemplo003 {
    public  static  void main(String []args){
        //declara uma variavel tipo long
        Long currentTimeMillis=System.currentTimeMillis();
        System.out.println("currentTimeMillis : "+currentTimeMillis);
        //instancia novaData
        Date novaData=new Date(currentTimeMillis);
        System.out.println("A data de hoje : "+novaData);
        //intanciando objetos
        Date datapassada=new Date(currentTimeMillis);
        //passando uma data recente
        Date dataFuturo=new Date(1714959856181L);
        System.out.println("A data é : "+dataFuturo);
        //comparando se a dataPassada é posterior a dataFuturo
        boolean isAfter=datapassada.after(dataFuturo);
        System.out.println("A data passada é posterior : "+isAfter);

        //comparando se a dataPassada é anterior a dataFuturo
        boolean isBefore=datapassada.before(dataFuturo);
        System.out.println("A data passada é anterior : "+isBefore);


    }
}
