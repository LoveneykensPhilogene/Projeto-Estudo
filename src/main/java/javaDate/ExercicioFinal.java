package javaDate;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.function.LongBinaryOperator;

public class ExercicioFinal {
    public static void main(String[]args){
        //instancia
        @Deprecated
        Date meudataNascimento=new Date(94,02,10);
        //retorna timeMillis do tipo long
        Long timeMillisNascimento= meudataNascimento.getTime();
        //passa valor do tipo long como parametro
        Date novoNascimento=new Date(timeMillisNascimento);
         //cria um novo objeto
        @Deprecated
        Date novaData=new Date(110,04,15);
        //verifica se a data é anterior
        boolean dataAnterior=novaData.after(novoNascimento);
        //verifica se a data é posterior
        boolean dataPosterior=novaData.before(novoNascimento);
        //imprime ou mostra
        System.out.println("timeInMillis : "+timeMillisNascimento);
        System.out.println("O objeto Date : "+novoNascimento);
        System.out.println("Minha data de nascimento é Anterior : "+dataAnterior);
        System.out.println("Minha data de nascimento é posterior : "+dataPosterior);







    }
}
