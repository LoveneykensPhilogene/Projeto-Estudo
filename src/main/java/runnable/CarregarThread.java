package runnable;

public class CarregarThread extends  Thread{
  // implemta o runnable
    @Override
    public void run() {
        super.run();
        System.out.println("Tarefa : "+"ok"+"\n"+"Id : "+getId()+"\n"
                +getName());
        //define o tempo de processamento
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
