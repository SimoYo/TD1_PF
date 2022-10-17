package td1.arbres;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Chaine c1=new Chaine("c1");
        Chaine c2=new Chaine("c2");
        Chaine c3=new Chaine("c3");
        Chaine c4=new Chaine("c4");
        Chaine c5=new Chaine("c5");

        Arbre<Chaine> f1 = new Feuille<>(c1);
        Arbre<Chaine> f2 = new Feuille<>(c2);
        Arbre<Chaine> f3 = new Feuille<>(c3);
        Arbre<Chaine> f4 = new Feuille<>(c4);
        Arbre<Chaine> f5 = new Feuille<>(c5);

        List<Arbre<Chaine>> l1 = new ArrayList<>();
        List<Arbre<Chaine>> l2 = new ArrayList<>();
        l1.add(f2);
        l2.add(f3);
        Arbre<Chaine> noeud=new Noeud<>(l2);

    }
}