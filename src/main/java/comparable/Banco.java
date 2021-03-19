package comparable;


import java.util.TreeMap;
import java.util.TreeSet;

public class Banco implements Comparable<Banco> {
    private String nome;
    private Integer agencia;
    private TreeMap<String,Integer> bancoMap;
    private TreeSet<Banco> bancoSet;
    public Banco(){
        this.nome=nome;
        this.agencia=agencia;
    }
    public Banco(String nome,Integer agencia){
        this.nome=nome;
        this.agencia=agencia;
    }
    TreeMap<String,Integer> adicionaMpa(){
        bancoMap=new TreeMap<>();
        bancoMap.put(getNome(),getAgencia());
        return bancoMap;
    }
    TreeSet<Banco>adicionaSet(){
        bancoSet=new TreeSet<>();
        bancoSet.add(new Banco());
        return bancoSet;

    }

    @Override
    public int compareTo(Banco o) {

        return this.agencia-o.getAgencia();
    }

    public String getNome() {
        return nome;
    }

    public Integer getAgencia() {
        return agencia;
    }

    @Override
    public String toString() {
        return "Nome : "+nome+"\n"
                +"Agencia : "+ agencia+"\n";
    }


}
