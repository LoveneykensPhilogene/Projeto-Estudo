package javaOptional;

import java.util.Optional;

public class ExeemploOptional {
    public static void main(String []args) {
        //optional.of
        Optional<String> optionalString = Optional.of("valor presente");
        //boolean isEmpty
        System.out.println(optionalString.isEmpty());
        //Boolean isPresent
        System.out.println(optionalString.isPresent());
        //imprime
        optionalString.ifPresent(System.out::println);
        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Não tem valor"));
        //condição if
        if (optionalString.isPresent()) {
            String valor = "Existe um valor";
            System.out.println(valor);
        }
        optionalString.map((valor) -> valor.concat(" : $$$$")).ifPresent(System.out::println);
        optionalString.orElseThrow(IllegalAccessError::new);
    }
}
