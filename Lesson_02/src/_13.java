import java.util.Arrays;

public class _13 {
    public static void main(String[] args) {
        int rs = romanToInt("MCMXCIV");
        System.out.println(rs);
    }
    public static int romanToInt(String s) {
        int[] arr= romanToArray(s);
        System.out.println(Arrays.toString(arr));
        int sum =0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(i - 1 >= 0 && arr[i] > arr[i-1]){
                sum += arr[i] - arr[i-1];
                i--;
            }else{
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int[] romanToArray(String s){
        int n = s.length();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            switch (s.charAt(i)){
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
        }
        return arr;
    }
}
