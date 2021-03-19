package condicao.repetido;

import java.util.stream.IntStream;

public class Stream<S> {

    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
            System.out.println(n);
        });
        IntStream.range(0, 3).

                forEach(n ->

                {
                    System.out.println("Número=" + n);
                });
        Integer a[] = {1};
        int b[] = new int[2];
        int c[] = {1, 2};
        Integer d[][] = new Integer[2][2];
        d[0][0] = 1;
        d[0][1] = 2;
        System.out.println("Tamanho do d :" + d.length);
        System.out.println(a[0].equals(1));


    }
}

