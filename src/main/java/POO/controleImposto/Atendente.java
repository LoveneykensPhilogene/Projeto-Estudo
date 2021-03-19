package POO.controleImposto;

public class Atendente extends Funcionario {

    final double porcentagemAtendente=(0.05/100);
    public Double valorImposto(double valor){
       valor*=porcentagemAtendente;
        return valor;

    }
}
