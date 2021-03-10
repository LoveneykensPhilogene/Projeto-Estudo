package comparable;

import java.util.Set;
import java.util.TreeMap;
//comparable

public class EstudanteComparable implements Comparable <EstudanteComparable>{
    private final String nome;
    private final Integer idade;
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
