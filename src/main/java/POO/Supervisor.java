package POO;

public class Supervisor extends Funcionario{
    final double porcentagemSupervisor=(0.05/100);
    public Double valorImposto(double valor){
       valor*=porcentagemSupervisor;
        return valor;

    }
}
