import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(10));
        System.out.println(hashSet.add(21));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet.add(1));

        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(10);
        linkedHashSet.add(21);
        linkedHashSet.add(14);
        linkedHashSet.add(9);
        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(27);
        treeSet.add(1);
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

    }

}