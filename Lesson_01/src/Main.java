import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1,2,3,4,5};
//        int x = 6;
//
//        int[] new_array = new int[6];
//        //int x = 6;
//        new_array[0] = x;
//
//        for (int index=1; index<new_array.length; ++index) {
//            new_array[index] = array[index-1];
//        }
//
//        for (int index=0; index<new_array.length; ++index) {
//            System.out.print(new_array[index] + " ");
//        }
//        System.out.println();
//
//        int[] array2 = insertFirst(array, x);
//        System.out.println(Arrays.toString(array2));
//
//        Arrays.sort(array2);
//        System.out.println(Arrays.toString(array2));
//
//        int[] array3 = insertLast(array2, x);
//        System.out.println(Arrays.toString(array3));

        int arr[] = {5,7,1,9,3,2};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));



    }

    public static int[] insertFirst(int[] arr1, int x){
        int[] arr2 = new int[arr1.length + 1];
        arr2[0] = x;

        for(int i = 0; i < arr1.length; i++){
            arr2[i+1] = arr1[i];
        }
        return arr2;
    }

    public static int[] insertLast(int[] array1, int x){
        int[] array2 = new int[array1.length + 1];
        for(int i = 0; i < array2.length; i++){
            if(i == array2.length-1){
                array2[i] = x;
            }else {
                array2[i] = array1[i];
            }
        }
        return array2;
    }

//    public static int[] insert(int[] array1, int x, int position){
//
//    }

    public static int[] addArr(int[] nums, int n, int k) {
        // check k
        if (k >= nums.length + 1 || k < 0)
            return null;
        int result[] = new int[nums.length + 1];
        result[k] = n;
        for (int i = 0; i < nums.length; i++) {
            if (i < k)
                result[i] = nums[i];
            else
                result[i + 1] = nums[i];
        }
        return result;
    }

}