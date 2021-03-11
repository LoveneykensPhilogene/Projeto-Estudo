package javaOptional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String []args){
        //optional.of
        Optional<String> optionalString=Optional.of("valor presente");
        System.out.println("Valor optional que está presente");
        optionalString.ifPresentOrElse(System.out::println,
                ()->System.out.println("Valor não esta presente"));
        //optional.ofNullabl
        Optional<String> optionalNull=Optional.ofNullable(null);
        System.out.println("Valor optional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println,
                ()->System.out.println("null= não esta presente"));
        //optional.Empty
        Optional<String> optionalEmpty=Optional.empty();
        System.out.println("Valor optional que não está presente");
        optionalEmpty.ifPresentOrElse(System.out::println,
                ()->System.out.println("empty= não esta presente"));
        //optional.of - erro
        /*Optional<String> optionalOfErro=Optional.of(null);
        System.out.println("Valor optional que lança erro NullPointerException");
        optionalString.ifPresentOrElse(System.out::println,
               ()->System.out.println("erro= não esta presente"));
               */








    }
}
