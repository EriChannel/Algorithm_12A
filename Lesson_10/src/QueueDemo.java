import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0 ; i <= 5; i++){
            queue.add(i);
        }

        System.out.println(queue);

        System.out.println("Phần tử đầu tiên: " + queue.peek());
        System.out.println("Phần tử đầu tiên và xóa phần tử đó: " +queue.poll());
        System.out.println(queue);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 5 ; i >= 0; i--){
            priorityQueue.add(i);
        }

        System.out.println(priorityQueue);

//        System.out.println("Phần tử đầu tiên và xóa phần tử đó: " + priorityQueue.poll());
//        System.out.println(queue);
        List<Integer> list = new ArrayList<>();
        int size = priorityQueue.size();
        for(int i = 0; i < size; i++){
            list.add(priorityQueue.poll());
        }

        System.out.println(list);


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(6);
        deque.add(9);
        deque.addFirst(1);
        deque.addLast(10);
        System.out.println(deque);

        System.out.println("Lấy ra phần tử đàu tiên: " +deque.peekFirst());
        System.out.println("Lấy ra phần tử cuối cùng: " + deque.peekLast());
    }
}
