public class _26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){

            if(k == 0 || nums[i] > nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        //System.out.println("k = " +k);
        return k;
    }
}
