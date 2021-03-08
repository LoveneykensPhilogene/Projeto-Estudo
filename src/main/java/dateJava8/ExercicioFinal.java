package dateJava8;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioFinal {
    public static void main(String[]args){
        //retorna a date
        LocalDateTime dateTimeAtual=LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println("A data atual : "+dateTimeAtual);
        //retorna a date atualizada
        LocalDateTime dateTimeAtualizada=dateTimeAtual.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("A data atualualizada : "+dateTimeAtualizada);

    }

}
