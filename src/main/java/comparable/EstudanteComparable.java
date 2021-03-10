package comparable;

import java.util.Set;
import java.util.TreeMap;

public class EstudanteComparable implements Comparable <EstudanteComparable>{
    private final String nome;
    private final Integer idade;
    private TreeMap<String,Integer>l;
    private Set<EstudanteComparable> set;

    public TreeMap<String,Integer> map(String nome,Integer idade){
        l=new TreeMap<>();
        l.put(getNome(),getIdade());
        return l;
    }

    public EstudanteComparable(){
        this.nome=getNome();
        this.idade=getIdade();
    }

        public EstudanteComparable(String nome, Integer idade) {
        this.nome = nome;
        this.idade=idade;
    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    @Override
    public String toString() {
       return nome+"-"+ idade;
  }

    @Override
    public int compareTo(EstudanteComparable o) {
        return getIdade()-o.getIdade();
    }

}
