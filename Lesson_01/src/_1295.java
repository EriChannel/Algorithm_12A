public class _1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int  i : nums){
            if(countDigit(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int countDigit(int number){
//         int count = 0;
//         while(number != 0){
//             number = number/10;
//             count++;
//         }

//         return count;

        String temp = String.valueOf(number);
        return temp.length();
    }
}
