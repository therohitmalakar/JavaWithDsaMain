public class ZigZag {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp =  temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse right half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextl , nextR;

        //alternate merging
        while(left != null && right != null){
            nextl = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextl;

            left = nextl;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        ZigZag list = new ZigZag();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();
        list.zigZag();
        list.print();
    }
}
