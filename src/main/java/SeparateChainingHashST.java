import edu.princeton.cs.algs4.SequentialSearchST;

import java.util.ArrayList;
import java.util.List;

public class SeparateChainingHashST <Key, Value>{
    private int N;
    private int M;
    private SequentialSearchST<Key, Value>[] st;
    public SeparateChainingHashST(){
        this(997);
    }
    public SeparateChainingHashST(int M)
    {
        this.M = M;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
        for (int i = 0; i < M; i++)
            st[i]=new SequentialSearchST();
    }
    private int hash(Key key){
        return (key.hashCode()& 0x7fffffff)%M;
    }
    public void put(Key key, Value val) {
        st[hash(key)].put(key, val);
    }
    public Iterable<Key> keys(){
        // Just placeholder for now
        List<Key> l = new ArrayList<Key>();
        return l;
    }

}
