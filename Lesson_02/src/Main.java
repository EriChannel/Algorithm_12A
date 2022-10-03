import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Java123";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        //lục thanh ngọc -> Lục Thanh Ngọc

        for (char c : arr) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }

        char c = 65;
        System.out.println(c);

        System.out.println((int) 'a');
        String str = "";
        for (int i = 0; i < 3; i++) {
            str = str + i + " - ";
        }

        System.out.println(str);

        StringBuilder sb = new StringBuilder("ABC");
        sb.append("XYZ");
        System.out.println(sb);
        sb.insert(2, "acb");
        System.out.println(sb);
        sb.replace(2, 5, "xyz");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}