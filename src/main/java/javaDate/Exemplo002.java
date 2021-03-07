package javaDate;

import java.util.Date;

public class Exemplo002 {
    public  static  void main(String []args){
        //declara uma variavel tipo long

        Long currentTimeMillis=System.currentTimeMillis();
        System.out.println("currentTimeMillis : "+currentTimeMillis);
        //instancia novaData
        Date novaData=new Date(currentTimeMillis);
        System.out.println("A data de hoje : "+novaData);
    }
}
