import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFSExample {
    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,1,0},
                {1,0,1,1,1},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,1,0,1,0}
        };
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();

        //B1: Chọn đỉnh đầu là đỉnh 0
        stack.add(0);
        //B2: Đánh dấu đã duyệt đỉnh đầu
        daDuyet.add(0);

        while (!stack.isEmpty()){
            int u = stack.pop();
            System.out.print(u +"\t");

            //Tìm đỉnh kề với đỉnh u chưa được duyệt
            for(int i = 0; i < graph.length; i++){
                if(graph[u][i] == 1 && !daDuyet.contains(i)){
                    stack.add(i);
                    daDuyet.add(i);
                }
            }


        }


    }
}
