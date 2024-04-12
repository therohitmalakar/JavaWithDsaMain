public class PallinLL {
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPallin(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid node
        Node midNode = findMid(head);

        //step 2 reverse second half
        Node curr = midNode;
        Node prev = null;
        while(curr!= null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

            //step 3 check left and right half
            Node right = prev;
            Node left = head;
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
        return true;
        }

        //Floyd's cycle
    public static boolean checkCycle(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
//        PallinLL list = new PallinLL();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(1);
//        list.print();
//        System.out.println(list.checkPallin());
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =head;
        System.out.println(checkCycle());

    }
}

