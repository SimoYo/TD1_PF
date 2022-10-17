package td1.arbres;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable<T>> implements Arbre<T> {
    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }


    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public T somme() {
        return null;
    }


    @Override
    public T min() {

            T x = fils.get(0).min();
            for(Arbre <T> minimum : fils){
                T var = minimum.min();
                if(x.compareTo(minimum.min()) >0)
                {
                    x=var;
                }
            }
            return x;

    }

    @Override
    public T max() {
        T x = fils.get(0).min();
        for(Arbre <T> maximum : fils){
            T var = maximum.min();
            if(x.compareTo(maximum.max())<0) {
                x=var;
            }
        }
        return x;
    }

    /**
     * un noeud de fils f1 ... fi ... fn est trié ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est trié</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */
    @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;

        for( int i = 0; i < fils.size() - 1; i++){
            Arbre<T> condi1 = fils.get(i);
            if(condi1.max().compareTo(fils.get(i+1).min())>0){
                rtr = false;
            }
        }
        return rtr;
    }

}