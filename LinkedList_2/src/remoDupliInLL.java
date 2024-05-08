import java.util.*;
import java.util.LinkedList;

public class remoDupliInLL {

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
        if(tail== null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.data == node.next.data){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public static void main(String[] args){
        remoDupliInLL list = new remoDupliInLL();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(4);
        list.print();
        list.duplicates();
        list.print();

    }
}
