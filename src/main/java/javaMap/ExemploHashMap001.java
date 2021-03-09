package javaMap;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap001 {
    public static void main(String[]args){
        //instancia
        Map<String,Integer> titulo=new HashMap<>();
        //adiciona os campeões
        titulo.put("Brasil",5);
        titulo.put("Alemanha",4);
        titulo.put("Italia",4);
        titulo.put("Uruguay",2);
        titulo.put("Argentina",2);
        titulo.put("França",2);
        titulo.put("Inglaterra",1);
        titulo.put("Espanha",1);
        titulo.put("Haiti",0);
        System.out.println(titulo);
        //atualiza ovalor para chave Haiti
        titulo.put("Haiti",1);
        System.out.println(titulo);
        //retorna o brasil
        int retornaBrasil=titulo.get("Brasil");
        System.out.println("Quantidade de titulos do Brasil : "+retornaBrasil);
        //Retorna se existe um campão França
        boolean francaCampeao=titulo.containsKey("França");
        System.out.println("A França está na lista dos campeões : "+francaCampeao);
        //remover a França
        int revomeFranca=titulo.remove("França");
        System.out.println("O campeao França foi removido\n"+titulo);
        //retorna se existe campeão França
        boolean francaCampeaoAtual=titulo.containsKey("França");
        System.out.println("A França está na lista dos campeões : "+francaCampeaoAtual);
        //retorna se existe uma seleção hexa campeã
        boolean hexaCampea=titulo.containsValue(6);
        System.out.println("Existe uma seleção hexa campeã : "+hexaCampea);
        //retorna o tamanho do titulo
        int tamanhoTitulo=titulo.size();
        System.out.println("tamanho total é : "+tamanhoTitulo);
        System.out.println("\n=== A lista ===\n");
        for(Map.Entry<String,Integer> tituloAtual:titulo.entrySet()){

            System.out.println(tituloAtual.getKey()
                    +"->"+tituloAtual.getValue());
            }
             System.out.println("\n=== A lista ===\n");
        for (String tituloAtual :titulo.keySet()){

            System.out.println(tituloAtual
                    +"->"+titulo.get(tituloAtual));
        }
        //verifica se a mapa contem a chave Bolivia
        boolean temBolivia= titulo.containsKey("Boliva");
        System.out.println("Exite a chave Bolivia : "+temBolivia);
        //verifica se a mapa contm chave 0
        boolean tem0=titulo.containsValue(0);
        System.out.println("Exite a chave 0 : "+tem0);
        //verifica se está vazio
        boolean isEmpty=titulo.isEmpty();
        System.out.println("Está vazio : "+isEmpty);




    }

}
