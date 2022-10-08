import java.util.Arrays;

public class _344 {
    public static void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0; i < n/2; i++){
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n-i-1] = temp;
        }
    }
    public static void reverseString(char[] s, int i, int j){
        //Điều kiên dừng
        if(j <= i){
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverseString(s, i+1, j-1);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e','l','l','o'};
        reverseString(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));
    }
}
