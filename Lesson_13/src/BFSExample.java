import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSExample {
    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,1,0},
                {1,0,1,1,1},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,1,0,1,0}
        };

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        queue.add(0);
        daDuyet.add(0);

        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + "\t");

            for(int i = 0; i < graph.length; i++){
                if(graph[u][i] == 1 && !daDuyet.contains(i)){
                    queue.add(i);
                    daDuyet.add(i);
                }
            }
        }
    }
}
