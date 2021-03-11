package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String []args){
        //Cria a a coleção de jogadores
        List<String>jogadores=new ArrayList<>();
        //adiciona elemento na coleção de jogadores
        jogadores.add("Ronaldinho");
        jogadores.add("Ronaldo");
        jogadores.add("Cristiano");
        jogadores.add("Kaka");
        jogadores.add("Pelé");
        jogadores.add("Messi");
        // Retorna a contagem de elementos do stream
        System.out.println("Quantidade de elementos contem na lista : "+jogadores.stream().count());
        // Retorna o elemento com maior numero de letras
        System.out.println("Elemento com maior numero de letra : "
                +jogadores.stream().max(Comparator.comparing(String::length)));
        // Retorna o elemento com menor numero de letras
        System.out.println("Elemento com menor numero de letra : "
                +jogadores.stream().min(Comparator.comparing(String::length)));
        // Retorna os elementos que tem a letra R no nome
        System.out.println("Jogador com letra R no nome : "
                +jogadores.stream().filter(
                (jogador)->jogador.toLowerCase()
                                .contains("r")).collect(Collectors.toList()));
        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Nova coleção, com os nomes concatenados a quantidade de letra: "
        +jogadores.stream().map((jogador)->jogador.concat("-")
                        .concat(String.valueOf(jogador.length()))
                ).collect(Collectors.toList()));
        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("os 3 primeiros elementos da coleção : "+
                jogadores.stream().limit(3).collect(Collectors.toList()));
        // Retorna somente os 3 primeiros elementos da coleção-delimiter
        System.out.println("os 3 primeiros elementos da coleção : "+
                jogadores.stream().limit(3).collect(Collectors.joining("-")));
        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("retorna os mesmos elementos : "+jogadores.stream()
                .peek(System.out::println).collect(Collectors.toList()));
        /*
        System.out.println("retorna os mesmos elementos : "+jogadores.stream()
                .peek(System.out::println).collect(Collectors.joining(
                        String.valueOf(jogadores)
                )));
                */
        // Exibe cada elemento no console sem retornar outra coleção
        System.out.print("Retorna os elementos novamente: ");
       jogadores.stream().forEach(System.out::println);
        // Retorna true se todos os elementos possuem a letra s no nome
        System.out.println("Tem algum elemento com s no nome? "
                + jogadores.stream().allMatch(
                (elemento) -> elemento.contains("S")));
        // Retorna true se algum os elementos possuem a letra a minúscula no nome
        System.out.println("Tem algum elemento com a minúscula no nome? " + jogadores.stream().anyMatch(
                (elemento) -> elemento.contains("a")));

        // Retorna true se nenhum elemento possue a letra a minúscula no nome
        System.out.println("Não tem nenhum elemento com a minúscula no nome? " + jogadores.stream().noneMatch(
                (elemento) -> elemento.contains("a")));
        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.print("Retorna o primeiro elemento da coleção: ");
        jogadores.stream().findFirst().ifPresent(System.out::println);

        // Exemplo de operação encadeada
        System.out.print("Operaçõa encadeada: ");
        System.out.println(jogadores.stream()
                .peek(System.out::println)
                .map(jogador ->
                        jogador.concat(" - ").concat(String.valueOf(jogador.length()))
                )
                .peek(System.out::println)
                .filter((jogador) ->
                        jogador.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
//                         .collect(Collectors.joining(", ")));
//                         .collect(Collectors.toSet()));
//                         .collect(Collectors.groupingBy(
//                         jogador -> jogador.substring(jogador.indexOf("-") + 1)))
//                             );









    }
}
