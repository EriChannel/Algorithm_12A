import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//            System.out.println("Lần lặp " + (i+1));
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] sortArray(int[] arr){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        long start = System.nanoTime();
        int[] sortArr = sort(arr);
        long end = System.nanoTime();

        System.out.println(end - start);
        System.out.println(Arrays.toString(sortArr));
    }
}
