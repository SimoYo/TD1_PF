package td1.arbres;

public class Entier implements Sommable<Entier>{


    private Integer val;
    public Entier(Integer val){

    }

    @Override
    public Entier sommer(Entier val) {
        return new Entier(this.val+val.getVal());
    }

    public Integer getVal(){
        return this.val;
    }
}
