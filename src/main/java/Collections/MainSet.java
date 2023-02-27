package Collections;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class MainSet {

    public static void main(String[] args) {

        Set<Integer> hset = new HashSet<>();
        hset.add(25);
        hset.add(5);
        hset.add(5);
        hset.add(5);
        hset.add(12);

        System.out.println(hset);

        Set<Integer> tSet = new TreeSet<>();

        tSet.add(25);
        tSet.add(5);
        tSet.add(5);
        tSet.add(5);
        tSet.add(12);
        System.out.println(tSet);
    }
}
