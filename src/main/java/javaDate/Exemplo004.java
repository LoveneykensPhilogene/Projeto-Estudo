package javaDate;

import java.util.Date;

public class Exemplo004 {
  public static void main(String[]args){
    //intanciando objetos
    // passando uma data passada
    Date datapassada=new Date(1614960086169L);
    //passando uma data recente
    Date dataRecente=new Date(1615959856181L);
    System.out.println("A data é : "+dataRecente);
     //passando uma data no futuro
      Date dataFuturo=new Date(1615959856181L);
      System.out.println("A data é : "+dataRecente);

      //comparando se as datas são iguais
    boolean isEquals=datapassada.equals(dataRecente);
        System.out.println("A data passada é igual a data recente : "+isEquals);
      boolean isEqualsNovo=dataRecente.equals(dataFuturo);
      System.out.println("A data Recente é igual a data Futuro : "+isEqualsNovo);

     //comparando se a dataPassada é anterior a dataFuturo
    boolean isBefore=datapassada.before(dataFuturo);
        System.out.println("A data passada é anterior : "+isBefore);
        //comparando uma data com a outra
      int compareCase1=datapassada.compareTo(dataRecente);
      int compareCase2=dataRecente.compareTo(datapassada);
      int compareCase3=dataFuturo.compareTo(dataRecente);
      System.out.println("CompreCa1 : "+compareCase1);
      System.out.println("CompreCa2 : "+compareCase2);
      System.out.println("CompreCa3 : "+compareCase3);







  }
}
