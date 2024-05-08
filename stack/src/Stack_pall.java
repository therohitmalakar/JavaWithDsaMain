import java.util.LinkedList;
import java.util.Stack;

public class Stack_pall {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPall(LinkedList<Character> list){
        Stack<Character> s = new Stack<>();
        Node temp = head;


    }

    public static void main(String[] args){
        LinkedList<Character> list = new LinkedList<>();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('b');
        list.addLast('a');
    }
}
