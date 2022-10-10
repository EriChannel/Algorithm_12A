import java.util.Arrays;

public class _704 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;

        while (iLeft <= iRight){
            int iMid = (iLeft + iRight)/2;
            System.out.println(iLeft + " - " + iRight + " - " + iMid);
            if(nums[iMid] == target) {
                return iMid;
            }else if(nums[iMid] < target){
                iLeft = iMid + 1;
            }else{
                iRight = iMid - 1;
            }
        }

        return -1;
    }

    public static int search1(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int search2(int[] nums, int target, int iLeft, int iRight){
        if(iLeft > iRight){
            return -1;
        }
        int iMid = (iLeft + iRight)/2;
        if(nums[iMid] == target){
            return iMid;
        }else if(nums[iMid] > target){
            return search2(nums, target, iLeft, iMid - 1);
        }else{
            return search2(nums, target, iMid + 1, iRight);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,11,14};

        long start = System.nanoTime();
        System.out.println(search2(arr, 11, 0, arr.length-1));
        long end = System.nanoTime();
        System.out.println(end - start);


    }
}
