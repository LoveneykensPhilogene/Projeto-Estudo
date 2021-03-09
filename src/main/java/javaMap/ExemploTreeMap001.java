package javaMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap001 {
    public static void main(String[]args){
        //instancia
        TreeMap<String,String>estados=new TreeMap<>();
        estados.put("PB","Paraiba");
        estados.put("SE","Sergipe");
        estados.put("BA","Bahia");
        estados.put("AC","Acre");
        estados.put("GO","Goiás");
        System.out.println(estados);
        //retorna a primeiro Estado
        String primeiroEstado= estados.firstKey();
        System.out.println(primeiroEstado );
        //retorna utilmo estado
        String utilmoEstado=estados.lastKey();
        System.out.println(utilmoEstado );
        //retorna a Estado abaixo
        String estadoLower=estados.lowerKey("SE");
        System.out.println(estadoLower);
        //retorna a estado acima
        String estadoHigher=estados.higherKey("SE");
        System.out.println(estadoHigher);
        //imprime
        System.out.println(estados);
        //imprime e remove
        Map.Entry<String,String>removePrimeiroEstado=estados.pollFirstEntry();
        System.out.println(removePrimeiroEstado.getKey()+"->"+removePrimeiroEstado.getValue());
        Map.Entry<String,String>removeUltimoEstado=estados.pollLastEntry();
        System.out.println(removeUltimoEstado.getKey()+"->"+removeUltimoEstado.getValue());
        //imprime
        System.out.println(estados);
        // percorre
        for(Map.Entry<String,String>estadoAtual:estados.entrySet()){
            System.out.println(estadoAtual.getKey()+"->"+estadoAtual.getValue());
        }
        //percorre com while
        Iterator<String> iterator=estados.keySet().iterator();
        while (iterator.hasNext()){
            String key =iterator.next();
            System.out.println(key+"->"+estados.get(key));
        }
    }
}
