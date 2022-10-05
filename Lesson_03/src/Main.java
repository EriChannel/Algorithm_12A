import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,7,6);

        Collections.sort(list);
        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
    }
}