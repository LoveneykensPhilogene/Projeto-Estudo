package javaOptional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String []args){
        //valor inteiro
        System.out.println("### Valor inteiro optional ###");
        OptionalInt.of(14).ifPresent(System.out::println);
        //valor decimal
        System.out.println("### Valor decimal optional ###");
        OptionalDouble.of(14.5).ifPresent(System.out::println);
        //valor Lon
        System.out.println("### Valor long optional ###");
       OptionalLong.of(145L).ifPresent(System.out::println);
    }
}
