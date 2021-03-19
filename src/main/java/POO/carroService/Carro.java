package POO.carroService;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    public String marca;



    public String cor;

    public List<Pessoa> getPessoa() {
        return pessoa;
    }


    public List<Pessoa> pessoa;

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
    public List<Pessoa> adicionar(List<Pessoa>p){
        pessoa=new ArrayList<>();
        pessoa.addAll(p);
        return pessoa;
    }


   /* public void adicionar(List<Pessoa>p){
        pessoa=new ArrayList<>();
        pessoa.addAll(p);
       System.out.println("Marca : "+getMarca());
        for(Pessoa listaDePessoa:pessoa){
            System.out.println(listaDePessoa);
        }
    }*/

        @Override
    public String toString() {

        return "=== Carro === \n" +
                "Marca : "+getMarca()
                +"\n" +"Cor : "+ getCor()+"\n"+
                "--- Lista de pessoas --- \n " +pessoa;
    }

}
