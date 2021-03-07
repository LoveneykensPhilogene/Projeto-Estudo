package Estudo;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Strings {
    public String n;
    public static void main(String[]args) {
        String nome = "José";
        String sobreNome = "paul";
        //concatena nome e sobreNome na variavel nomeCompleto
        final String nomeCompleto = nome + " " + sobreNome;
        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(nomeCompleto);
        //instancia String
        String string = new String();
        //instancia Strings
        Strings n1 = new Strings();
        n1.n = "Minha String";
        // string="Minha string";
        string = n1.n;
        System.out.println(string);
        // retorna um tipo boolean
        boolean posicao = string.isEmpty();
        System.out.println(posicao);
        //verifique a posição do M na variavel string
        int indice = string.indexOf("M");
        System.out.println(indice);
        //Retorna o valor do n2
        String n2 = string.toString();
        System.out.println(" valor do ns" + n2);

        int b=1;
        if(b==0) {
            try {
                System.out.println("Yes");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro");

            }
        }
            else{
                JOptionPane.showMessageDialog(null,"A variavel nao e igual o valor digitado");
            System.out.println();
            }
        //Cria um list
        List<String> li=new ArrayList<>();
        li.add(string);
        li.add(nome);
        li.add(nomeCompleto);
        li.add(n1.n);
        li.add(n2);
        //li.add(b);

        System.out.println(li);
        //posição
       System.out.println(li.indexOf("Minha String"));
       //substitui
       li.set(3,"Ola");
        //ordena
        Collections.sort(li);
        System.out.println(li);
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de java".split("Aula"));
        System.out.println("Aula".concat("de java"));
        System.out.println("12345 asda qw".replaceAll("[0-9]","[#]"));

    }

}
