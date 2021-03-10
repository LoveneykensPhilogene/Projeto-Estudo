package comparable;

import java.util.Comparator;

public class BancoCompartaor implements Comparator<Banco> {

    @Override
    public int compare(Banco o1, Banco o2) {
        return o2.getAgencia()- o1.getAgencia();
    }
}
