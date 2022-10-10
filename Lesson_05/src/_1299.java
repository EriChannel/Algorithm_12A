import java.util.Arrays;

public class _1299 {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int lastElement = arr[n-1];
        result[n-1] = -1;
        for(int i = n - 2; i >= 0; i--){
            result[i] = lastElement;
            if(lastElement < arr[i]){
                lastElement = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
