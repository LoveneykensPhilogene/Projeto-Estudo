package POO;

public class Gerente extends Funcionario{
    final double porcentagemGerente=(0.1/100);
    public Double valorImposto(double valor){
        valor*=porcentagemGerente;
        return valor;

    }
}
