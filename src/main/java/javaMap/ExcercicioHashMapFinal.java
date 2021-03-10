package javaMap;
//HashMap

import java.util.HashMap;
import java.util.Map;

public class ExcercicioHashMapFinal {
    public static  void main(String []args){
        //instancia
        Map<String,String>estadosBrasil=new HashMap<>();
        //adiciona os 26 estados
        estadosBrasil.put("Ac","Acre");
        estadosBrasil.put("AL","Alagoas");
        estadosBrasil.put("AP","Amapá");
        estadosBrasil.put("AM","Amazonia");
        estadosBrasil.put("BA","Bahia");
        estadosBrasil.put("CE","Ceará");
        estadosBrasil.put("ES","Espirito Santo");
        estadosBrasil.put("GO","Goiás");
        estadosBrasil.put("MA","Maranhão");
        estadosBrasil.put("MT","Mato Grosso");
        estadosBrasil.put("MS","Mato Grosso do Sul");
        estadosBrasil.put("MG","Minas Gerais");
        estadosBrasil.put("PA","Pará");
        estadosBrasil.put("PB","Paraiba");
        estadosBrasil.put("PR","Paraná");
        estadosBrasil.put("PE","Pernambuco");
        estadosBrasil.put("PI","Piauí");
        estadosBrasil.put("RJ","Rio de Janeiro");
        estadosBrasil.put("RN","Rio grande do Norte");
        estadosBrasil.put("RS","Rio Grande do Sul");
        estadosBrasil.put("RO","Rondônia");
        estadosBrasil.put("RR","Roraima");
        estadosBrasil.put("SC","Santa Catarina");
        estadosBrasil.put("SP","São Paulo");
        estadosBrasil.put("SE","Sergipe");
        estadosBrasil.put("TO","Tocantins");
        //remove o estado de minas Gerais
        boolean removeMinasGerais=estadosBrasil.remove("MG","Minas Gerais");
        System.out.println(estadosBrasil);
        //adiciona o distrito federal
        estadosBrasil.put("DF","Distrito Federal");
        System.out.println(estadosBrasil);
        //verifica o tamanho da mapa
        int tamanho=estadosBrasil.size();
        System.out.println("O tamanho do mapa é : "+tamanho);
        //remove o estado mato grosso do sul
        boolean removeMatoGrossoSul=estadosBrasil.remove("MS","Mato Grosso do Sul");
        System.out.println(estadosBrasil);
        //navega no Mapa
        System.out.println("\n=== A lista dos estados ===\n");
        for (Map.Entry<String,String>estadosAtuais:estadosBrasil.entrySet()){
            String key=estadosAtuais.getKey();
            String value=estadosAtuais.getValue();
            System.out.println(value+"("+key+")");
        }
        //verifica se estado maranhão está na mapa
        boolean maranhao=estadosBrasil.containsValue("Maranhão");
        System.out.println("Estado Maranhão está na lista? : "+maranhao);






    }
            }
