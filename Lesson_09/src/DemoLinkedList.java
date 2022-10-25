public class DemoLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        printNode(n1);

        printNode(n2);

        Node n0 = addAtHead(0, n1);
        printNode(n0);

        n0 = addAtTail(4, n0);
        printNode(n0);

        n0 = addAtIndex(5, n0, 5);
        printNode(n0);
    }

    public static void printNode(Node headNode){
        if(headNode == null){
            System.out.println("LinkedList rỗng");
        }else{
            Node temp = headNode;
            while (temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print(" -> ");
                }else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addAtHead(int value, Node headNode){
        Node newNode = new Node(value);
        if(headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addAtTail(int value, Node headNode){
        Node newNode = new Node(value);
        //Tìm node n3
        if(headNode == null){
            return newNode;
        }else{
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addAtIndex(int value, Node headNode, int index){
        if(index == 0){
            return addAtHead(value, headNode);
        }else{
            Node newNode = new Node(value);
            Node temp = headNode;
            int count = 0;
            while(temp != null){
                count++;
                if(count == index){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
        return headNode;
    }
}
