package POO.carroService;

import condicao.repetido.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class completaCarro {
    public static void main(String[]arg) {
        Carro c1 = new Carro();
        c1.setMarca("Gol");
        c1.setCor("Verde");
        Carro c2 = new Carro();
        c2.setMarca("Ford");
        c2.setCor("Azul");
        Carro c3 = new Carro();
        c3.setMarca("Fiat");
        c3.setCor("Preto");
        List<Pessoa>lista1=new ArrayList<>();
        lista1.add(new Pessoa("Jose","Pierre",30));
        lista1.add(new Pessoa("Joze","alcis",35));
        lista1.add(new Pessoa("Carlos","Jean",40));
        lista1.add(new Pessoa("Nici","Parle",50));
        lista1.add(new Pessoa("Nadal","Felix",45));
        lista1.add(new Pessoa("Ricky","Va",55));
        //remove
        lista1.remove(3);
        int qtdPessoasC1=lista1.size();
        int qtdPessoasC2=new ArrayList<>().size();
        int qtdPessoasC3=new ArrayList<>().size();

        ///*

        //listar
        c1.adicionar(lista1);
        /*c2.adicionar(new ArrayList<>());
        c3.adicionar(new ArrayList<>());*/

        //todos os carro cadastrados
        System.out.println(c1+"\n"+"Quantidade de pessoas que estão dentro do carro :"+ qtdPessoasC1);
        System.out.println(c2+"\n"+"Quantidade de pessoas que estão dentro do carro :"+ qtdPessoasC2);
        System.out.println(c3+"\n"+"Quantidade de pessoas que estão dentro do carro :"+ qtdPessoasC3);

        /*
        //retorna limite de pessoa
        System.out.println(lista1.stream()
                .map(c->"Marca : "+c1.getMarca()
                        + "\n"+lista1.get(1)+"Lugar desta pessoa na lista : "
                        +lista1.indexOf(lista1.get(1))+
                        "\n"
               +"Quantidade de pessoas : " +qtdPessoasC1)
                .filter(s -> lista1.get(2).equals(lista1.get(2))).limit(1)
                .collect(Collectors.toList()));*/

            }
    }


