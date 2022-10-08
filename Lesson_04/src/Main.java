public class Main {
    public static void main(String[] args) {
        //recursion();
        long start = System.nanoTime();
        //System.out.println(giaiThua(5));

        System.out.println(factorial(5));
        long end = System.nanoTime();

        System.out.println(end - start);
    }

    public static void recursion(){
        System.out.println("Đệ quy");
        recursion();
    }

    public static int giaiThua(int n){
        int result = 1;
        if(n == 0 || n == 1){
            return result;
        }else{
            for(int i = 2; i <= n; i++){
                result *= i;
            }
        }
        return result;
    }

    public static int factorial(int n){
        //Điều kiện dừng
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}