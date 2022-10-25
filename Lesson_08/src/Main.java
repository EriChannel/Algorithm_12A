public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,6,5,9};
        System.out.println(arr[4]);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 9){
                System.out.println(i);
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                //swap
               for(int k = 0;k < 5; k++){
                   System.out.println(i);
               }
            }
        }
    }
}