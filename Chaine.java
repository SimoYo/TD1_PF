package td1.arbres;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {


    private String val;

    public Chaine(String val) {
        this.val=val;
    }
    @Override
    public Chaine sommer(Chaine val) {
        return new Chaine(this.val+val.getVal());
    }

    public String getVal(){
        return this.val;
    }


    @Override
    public int compareTo(Chaine o) {
        return this.val.compareTo(o.val);
    }
}
