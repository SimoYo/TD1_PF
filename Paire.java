package td1.arbres;
public class Paire <T,U> implements IPaire <T,U> {

    public T t;
    public U u;

    public Paire(T a, U b){
        this.t=a;
        this.u=b;
    }

    @Override
    public T fst() {return t;}

    @Override
    public U snd() {return u;}

    @Override
    public <V> IPaire <V,U> changeFst(V v) {
        return new Paire<V,U>(v, this.u);
    }

    public <V> IPaire changeSnd(V v) {
        return new Paire<T,V>(this.t, v);
    }

    @Override
    public String toString(){
        return  "(" + this.fst()+ "," + this.snd()+ ")";
    }
}
