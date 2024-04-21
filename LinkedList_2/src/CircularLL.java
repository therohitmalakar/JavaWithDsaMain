public class CircularLL {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.print("HEAD");
    }

    public static void main(String[] args){
        CircularLL list = new CircularLL();
        list.insertAtLast(1);
        list.insertAtLast(45);
        list.insertAtLast(50);
        list.insertAtLast(23);
        list.insertAtLast(8);
        list.print();
    }
}
