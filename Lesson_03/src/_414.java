import java.util.Arrays;

public class _414 {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }else if(n == 2){
            return Math.max(nums[0], nums[1]);
        }else{
            Arrays.sort(nums);

        }

    }
}
