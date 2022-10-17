package td1.arbres;

import java.util.Set;

public interface Arbre3 {
    public interface Arbre { // à généraliser
        int taille();
        boolean contient(final Integer val);
        Set<Integer> valeurs();
    }
}
