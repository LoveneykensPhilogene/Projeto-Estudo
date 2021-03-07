package POO;

import java.util.ArrayList;
import java.util.List;

public class completaCarro {
    public static void main(String[]arg){
        Carro carro= new Carro();
        carro.setMarca("gol");
        carro.setCor("verde");
        Pessoa p= carro.getP();
        carro.setP(new Pessoa("ell","jkk",6));
        Pessoa p1= new Pessoa();
        p1.setNome("k");
        p1.setSobreNome("nnn");
        p1.setIdade(26);
        List<Pessoa> pe=new ArrayList<>();
        pe.add(new Pessoa("l","v",9));
        pe.set(0,p1);
        p1.imp();

      // Pessoa p1= new Pessoa();

        p1.setNome("loo");
        p1.setSobreNome("jean");
        p1.setIdade(25);
       //carro.p.getNome();
        //p.imp();
       // carro.adicionar();
        System.out.println( carro.getMarca());
       System.out.println( pe);

    }

}
