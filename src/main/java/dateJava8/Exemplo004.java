package dateJava8;

import java.time.LocalDateTime;

//LocalDateTime
public class Exemplo004 {
    public static void main(String[]args){
        //retorna a data e hora de hoje
        LocalDateTime atual=LocalDateTime.now();
        System.out.println("A datae hora atual : "+atual);
        LocalDateTime dateTimeAtualizada=atual.plusDays(1).plusHours(4).plusMinutes(60).plusSeconds(60);
        System.out.println("A data atualizada : "+dateTimeAtualizada);

    }
}
