package dateJava8;

import java.time.LocalDate;
import java.time.LocalTime;

//LocalTime
public class Exemplo003 {
    public static void main(String[]args){
     //retorna a hora
        LocalTime horaHoje=LocalTime.now();
        System.out.println("A hora atual : "+horaHoje);
        //retorna uma hora a menos
        LocalTime horaAnterior=horaHoje.minusHours(1);
        System.out.println("A hora anterior : "+horaAnterior);
    }
}
