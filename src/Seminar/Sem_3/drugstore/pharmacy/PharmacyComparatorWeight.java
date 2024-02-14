package src.Seminar.Sem_3.drugstore.pharmacy;

import java.util.Comparator;

public class PharmacyComparatorWeight implements Comparator<PharmacyIterable> {

    @Override
    public int compare(PharmacyIterable o1, PharmacyIterable o2) {
        return Integer.compare((int) o1.getTotalWeight(), (int) o2.getTotalWeight());
    }
}
