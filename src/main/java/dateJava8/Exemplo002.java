package dateJava8;

import java.time.LocalDate;
//LocalDate

public class Exemplo002 {
    public static void main(String[]args){
        //retorna a data de hoje
        LocalDate dataHoje=LocalDate.now();
        System.out.println("Data de hoje : "+dataHoje);
        //retorna a data de omtem
        LocalDate dataOntem=dataHoje.minusDays(1);
        System.out.println("A data de omtem : "+dataOntem);
    }
}
