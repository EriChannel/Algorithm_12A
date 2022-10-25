import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
//        int[] arr1 = {6,25,30,45};
//        int[] arr2 = {11,50,90};
//
//        int[] rs = merge(arr1, arr2);
//        System.out.println(Arrays.toString(rs));
        int[] arr= {25,30,45,6,11,90,50};
        int[] rs = sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(rs));
    }

    public static int[] sort(int[] arr, int iL, int iR){
        //Điều kiện dừng
        if(iL == iR){
            int[] singleElement = {arr[iL]};
            return singleElement;
        }

        //Chia mảng
        int iM = (iL + iR)/2;
        int[] arr1 = sort(arr, iL, iM);
        int[] arr2 = sort(arr, iM + 1, iR);

        //Gộp mảng
        int[] result = merge(arr1, arr2);

        return result;
    }

    public static int[] merge(int[] arr1, int[]arr2){
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < n){
            if(i < arr1.length && j < arr2.length){ //arr1 và arr2 không rỗng
                if(arr1[i] <= arr2[j]){
                    result[k] = arr1[i];
                    i++;
                    k++;
                }else{ //arr2[j] < arr1[i]
                    result[k] = arr2[j];
                    j++;
                    k++;
                }
            }else{ //arr1 hoặc arr2 rỗng
                if(i < arr1.length){ //arr1 không rỗng, arr2 rỗng
                    result[k] = arr1[i];
                    i++;
                    k++;
                }else{ //arr1 rỗng, arr2 khác rỗng
                    result[k] = arr2[j];
                    j++;
                    k++;
                }
            }
        }

        return result;
    }
}