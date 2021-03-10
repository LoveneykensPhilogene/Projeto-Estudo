package comparator;

import comparable.EstudanteComparable;

import java.util.Comparator;

public class EstudanteComparator implements Comparator<EstudanteComparable> {

    @Override
    public int compare(EstudanteComparable o1, EstudanteComparable o2) {
        return  o2.getIdade()- o1.getIdade();
    }
}
