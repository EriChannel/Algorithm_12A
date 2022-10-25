import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(9);
        System.out.println(stack);

        int size = stack.size();

//        for(int i = 0; i < size; i++){
//            System.out.print(stack.pop() + "\t");
//        }
//        System.out.println();

        System.out.println("Phần tử trên đỉnh và xóa phần tử đó: " +stack.pop());
        System.out.println("Phần tử trên đỉnh: " +stack.peek());
        System.out.println(stack);

        System.out.println("Tìm kiếm: " +stack.search(-7));

    }
}