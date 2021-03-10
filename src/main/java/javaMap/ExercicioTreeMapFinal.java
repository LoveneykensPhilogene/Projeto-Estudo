package javaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
//treeMap

public class ExercicioTreeMapFinal {
    public static  void main(String []args) {
        //instancia
        TreeMap<String, String> estadosBrasil = new TreeMap<>();
        //adiciona os 26 estados
        estadosBrasil.put("Ac", "Acre");
        estadosBrasil.put("AL", "Alagoas");
        estadosBrasil.put("AP", "Amapá");
        estadosBrasil.put("AM", "Amazonia");
        estadosBrasil.put("BA", "Bahia");
        estadosBrasil.put("CE", "Ceará");
        estadosBrasil.put("ES", "Espirito Santo");
        estadosBrasil.put("GO", "Goiás");
        estadosBrasil.put("MA", "Maranhão");
        estadosBrasil.put("MT", "Mato Grosso");
        estadosBrasil.put("MS", "Mato Grosso do Sul");
        estadosBrasil.put("MG", "Minas Gerais");
        estadosBrasil.put("PA", "Pará");
        estadosBrasil.put("PB", "Paraiba");
        estadosBrasil.put("PR", "Paraná");
        estadosBrasil.put("PE", "Pernambuco");
        estadosBrasil.put("PI", "Piauí");
        estadosBrasil.put("RJ", "Rio de Janeiro");
        estadosBrasil.put("RN", "Rio grande do Norte");
        estadosBrasil.put("RS", "Rio Grande do Sul");
        estadosBrasil.put("RO", "Rondônia");
        estadosBrasil.put("RR", "Roraima");
        estadosBrasil.put("SC", "Santa Catarina");
        estadosBrasil.put("SP", "São Paulo");
        estadosBrasil.put("SE", "Sergipe");
        estadosBrasil.put("TO", "Tocantins");
        System.out.println(estadosBrasil);
        //remove o estado de minas Gerais
        boolean removeMinasGerais=estadosBrasil.remove("MG","Minas Gerais");
        System.out.println("Mina Gerais está removido? : "+removeMinasGerais);
        //adiciona o distrito federal
        estadosBrasil.put("DF","Distrito Federal");
        System.out.println(estadosBrasil);
        //verifica o tamanho do mapa
        int tamanho=estadosBrasil.size();
        System.out.println(tamanho);
        //remove o estado mato grosso do sul
        boolean removeMatoGrossoSul=estadosBrasil.remove("MS","Mato Grosso do Sul");
        System.out.println("Mato Grosso do Sul está removido? : "+removeMatoGrossoSul);
        //navega no Mapa com for
        System.out.println("\n=== A lista com For ===\n");
        for (Map.Entry<String,String>estadosAtuais:estadosBrasil.entrySet()){
           String key=estadosAtuais.getKey();
           String value=estadosAtuais.getValue();
           System.out.println(value+"("+key+")");
        }
        System.out.println("\n=== A lista com While ===\n");
        //navega no Mapa com while
        Iterator<String> iterator= estadosBrasil.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            String value=key;
         System.out.println(estadosBrasil.get(value)+"("+key+")");

                    }
        System.out.println("\n=== A lista com For ===\n");
        //navegação simple com For
       for(String key:estadosBrasil.keySet()){
           String value=estadosBrasil.get(key);
           System.out.println(value+"("+key+")");

       }

        //verifica se estado maranhão está no mapa
        boolean maranhao=estadosBrasil.containsValue("Maranhão");
        System.out.println("Maranhão está na lista?: "+maranhao);

    }
}
