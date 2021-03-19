package POO.carroService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
    public String nome;
    public String sobreNome;
    public int idade;

    public Pessoa(){}
    public Pessoa(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome : "
                + nome+"\n"+
                "sobreNome : " + sobreNome +"\n"+
                "idade : " + idade+"\n" ;
    }
}
