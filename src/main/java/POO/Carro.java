package POO;

import java.util.List;

public class Carro {
    public String marca;
    public String cor;
   public Pessoa p;

    public Carro(){
        this.marca=marca;
        this.cor=cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
   public String adicionar(){
       this.p.getNome();
       this.p.getSobreNome();
       this.p.getIdade();
       return p.getNome()+p.getSobreNome()+p.getIdade();
    }
}
