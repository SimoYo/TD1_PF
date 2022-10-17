package td1.arbres;

public interface IPaire<T,U> {

    T fst();
    U snd();
    <V> IPaire <V,U> changeFst(V v);
    <V> IPaire <T,V> changeSnd(V v);

}
