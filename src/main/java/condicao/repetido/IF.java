package condicao.repetido;

public class IF {
    public static void main(String [] args){
        final boolean condicao=true;
         //primeiro methodo
        if(condicao){
            System.out.println("A condição é verdadeira");
        }
        else{
            System.out.println("A condição é false");
        }
        if (condicao){
            System.out.println(" Uma única linha .....");
        }
        //Segundo methodo
        String tenario=condicao ? "É verdade" : "É falsa";
        System.out.println(tenario);
    }
}
