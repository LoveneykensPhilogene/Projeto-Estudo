package POO.controleImposto;

public class ConsultaImposto{
    public static void main(String[]args) {
        //instancia gerente
        Gerente gerente = new Gerente();
        gerente.setNome("Pablo");
        gerente.setSalario(3500);
        System.out.println();
        //gerente.valorImposto(gerente.getSalario());
        System.out.println("======= " + "Gerente" + " =======" + "\n"
                + "Nome do gerente : " + gerente.getNome() +
                "\n" + "O salario : " + gerente.getSalario());
        System.out.println("Valor do imposto : "
                + gerente.valorImposto(gerente.getSalario()) + "\n");
        //instancia supervisor
        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Jão");
        supervisor.setSalario(2500);

        System.out.println("======= " + "Supervisor" + " =======" + "\n"
                + "O nome do supervisor : " + supervisor.getNome() + "\n"
                + "O salario : " + supervisor.getSalario());
        System.out.println("Valor do imposto : "
                + supervisor.valorImposto(supervisor.getSalario()) + "\n");
        //instancia Atendente
        Atendente atendente = new Atendente();
        atendente.setNome("Victor");
        atendente.setSalario(2000);
        System.out.println("======= " + "Atendente" + " =======" + "\n"
                + "O nome do atendente : " + atendente.getNome() + "\n"
                + "o salario ; " + atendente.getSalario());
        System.out.println("Valor do imposto : "
                + atendente.valorImposto(atendente.getSalario()) + "\n");

        String tabela[][] = {{"Nome", "   Salario ", " Imposto ", "  Funcionario\n"},
                { gerente.getNome() , "     3500.0 ", "   1.0 ", "              Gerente\n"},
                { supervisor.getNome() , "  2500.0 ", "   1.0 ", "           Supervisor\n"},
                { atendente.getNome() , "   2000.0 ", "   1.0 ", "            Atendente\n"}};
        for (int i = 0; i < 4; i++) {
            try {
                for (int j = 0; j < 5; j++) {
                    try {
                        System.out.print(tabela[i][j]);
                    } catch (Exception e1) {
                    }
                }
            } catch (Exception e) {

            }


        }
    }
}
