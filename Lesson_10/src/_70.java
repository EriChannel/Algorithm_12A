import java.util.Stack;

public class _70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
        //climbStairs(5);
    }
    public static int climbStairs(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        if(n < 3){
            return n;
        }

        stack.push(0);
        stack.push(1);
        stack.push(2);

        for (int i = 3; i <= n; i++) {

            int d1 = stack.pop();
            int d2 = stack.pop();

            int d3 = d1 + d2;

            stack.push(d2);
            stack.push(d1);
            stack.push(d3);
        }
        return stack.peek();
    }

}
