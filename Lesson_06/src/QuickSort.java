import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr= {25,30,45,6,11,90,50};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int iL, int iR){
        if(iL >= iR){
            return;
        }

        int iM = (iL + iR)/2;
        int key = arr[iM];
        System.out.println("key: " + key);

        //Phân bố mảng theo key, lấy ra chốt
        int pivot = partition(arr, iL, iR, key);
        System.out.println("chốt: " +pivot);

        //Chia đôi mảng theo chốt
        sort(arr, iL, pivot - 1);
        sort(arr, pivot, iR);
    }

    public static int partition(int[] arr,int iLeft, int iRight, int key){
        int iL = iLeft;
        int iR = iRight;

        while (iL <= iR){
            while (arr[iL] < key){
                iL++;
            }
            while (arr[iR] > key){
                iR--;
            }

            //Đổi chỗ phần tử không đúng vị trí
            if(iL <= iR){
                System.out.println("swap " + iL + " - " + iR);
                System.out.println("swap " + arr[iL] + " - " + arr[iR]);
                int temp = arr[iL];
                arr[iL] = arr[iR];
                arr[iR] = temp;
                iL++;
                iR--;
            }
            System.out.println(Arrays.toString(arr));
        }
        return iL;
    }
}
