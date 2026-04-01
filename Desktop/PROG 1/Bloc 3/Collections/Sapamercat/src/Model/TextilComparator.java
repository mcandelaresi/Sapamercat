package Model;

import java.util.Comparator;

 // Comparator per ordenar els productes Textil segons la seva composició.

public class TextilComparator implements Comparator<Textil> {

    @Override
    public int compare(Textil t1, Textil t2) {
        // Comparo les composicions alfabèticament
        return t1.getComposicio().compareToIgnoreCase(t2.getComposicio());
    }
}