import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public static int[] sort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIdx = i;

            //tìm index của phần tử nhỏ nhất
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            System.out.printf("swap arr[%d] với arr[%d]", minIdx, i);
            System.out.println();

            //đổi vị trí
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        int[] sortArr = sort(arr);
        System.out.println(Arrays.toString(sortArr));

    }
}
