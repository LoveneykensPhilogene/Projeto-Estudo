package runnable;

public class ExemploCarregarThread {
    public static void main(String[] args) {
        //instancia
        CarregarThread carregarThread1=
                new CarregarThread();
        //define o nome do thread
        carregarThread1.setName("Nome : "+"Primeiro");
        //retorna a tarefa
        carregarThread1.start();
        //instancia
        CarregarThread carregarThread2=
                new CarregarThread();
        //define o nome do thread
        carregarThread2.setName("Nome : "+"Segundo");
        //retorna a tarefa
        carregarThread2.start();
    }
}
