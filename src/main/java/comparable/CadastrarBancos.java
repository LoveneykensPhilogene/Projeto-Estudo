package comparable;

import java.util.*;

public class CadastrarBancos {
    public static void main(String []args) {
        //instacia
       Banco b1=new Banco("Bradesco",1234);
        Banco b2=new Banco("Itaú",4213);
        Banco b3=new Banco("NUbank",1001);
        Banco b4=new Banco("Caixa",1660);
        Banco b5=new Banco("Banco do Brasil",2345);
        Banco b6=new Banco("Viacredi",1101);
        //cria um array list
        List<Banco> bancos = new ArrayList<>();
        bancos.add(b1);
        bancos.add(b2);
        bancos.add(b3);
        bancos.add(b4);
        bancos.add(b5);
        bancos.add(b6);
        System.out.println(bancos);
        // retorna a ordem natural-Agencia
        bancos.sort(Comparator.comparingInt(Banco::getAgencia));
        System.out.println(bancos);
        // retorna a ordem natural-Agencia
        bancos.sort((primeira,segunda)->primeira.getAgencia()- segunda.getAgencia());
        System.out.println(bancos);
        // retorna a ordem reverse-Agencia
        bancos.sort((primeira,segunda)-> segunda.getAgencia()- primeira.getAgencia());
        System.out.println(bancos);
        //retorna a ordem natural-agencia
       bancos.sort(Banco::compareTo);
        System.out.println(bancos);
        //cria um mapa
        /*
        TreeMap<String,Integer>mapb1= b1.adicionaMpa();
        TreeMap<String,Integer>mapb2= b2.adicionaMpa();
        TreeMap<String,Integer>mapb3= b3.adicionaMpa();
        TreeMap<String,Integer>mapb4= b4.adicionaMpa();
        TreeMap<String,Integer>mapb5= b5.adicionaMpa();
        TreeMap<String,Integer>mapb6= b6.adicionaMpa();
        TreeMap<String,Integer>bancoMap=new TreeMap<>();
        bancoMap.putAll(mapb1);
        bancoMap.putAll(mapb2);
        bancoMap.putAll(mapb3);
        bancoMap.putAll(mapb4);
        bancoMap.putAll(mapb5);
        bancoMap.putAll(mapb6);
         System.out.println(bancoMap);
          */
        TreeMap<String,Integer>bancoMap=new TreeMap<>();
        bancoMap.put(b1.getNome(), b1.getAgencia());
        bancoMap.put(b2.getNome(), b2.getAgencia());
        bancoMap.put(b3.getNome(), b3.getAgencia());
        bancoMap.put(b4.getNome(), b4.getAgencia());
        bancoMap.put(b5.getNome(), b5.getAgencia());
        bancoMap.put(b6.getNome(), b6.getAgencia());
        System.out.println(bancoMap);
        for (Map.Entry<String,Integer>brancoMapAtual:bancoMap.entrySet()){
            System.out.println(brancoMapAtual);
        }
        //cria TreeSet
        TreeSet<Banco>bancosSet=new TreeSet<>();
        bancosSet.add(b1);
        bancosSet.add(b2);
        bancosSet.add(b3);
        bancosSet.add(b4);
        bancosSet.add(b5);
        bancosSet.add(b6);
        System.out.println(bancosSet);
        for (Banco bancosSetAtual:bancosSet){
            System.out.println(bancosSetAtual);

        }


         }
}
