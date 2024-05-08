public class LinkedList {

        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;


        //Add first in linked list
        public void addFirst(int data){
            //Step1 = Create a new Node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode; //if linked list is empty.
                return;
            }
            //step2 = newNode next = head.
            newNode.next = head; // link
            //step3 = head = NewNode
            head = newNode;
        }

        //Add Last in linked list
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //display a linked list
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


        //Add in middle of a linked list
        public void add(int data, int idx){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;
            while(i< idx-1){
                temp = temp.next;
                i++;
            }
            //i = idx-1; temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // insert using recursion

    public void insertRec(int data, int idx){
            head= insertRec(data,idx,head);
    }
    public Node insertRec(int data, int idx, Node node){
            if(idx == 0){
                Node temp = new Node(data);

                return temp;
            }

            node.next = insertRec(data,idx-1,node.next);
            return node;
    }


        //Remove from first in linked list
        public int removeFirst(){
            if(size == 0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        //Remove from last in linked list
        public int removeLast(){
            if(size == 0){
                System.out.println("Ll is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            //prev: i=size-2
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public static void main(String[] args){
            LinkedList ll = new LinkedList();
            ll.addLast(2);
            ll.addLast(1);
            ll.addLast(3);
            ll.addLast(4);
//            ll.add(9,0);
            ll.print();
            ll.insertRec(88,2);
            ll.print();
//            ll.removeFirst();
//            System.out.println("after removing first node:");
//            ll.print();
//            ll.removeLast();
//            System.out.println("after removing last node:");
//            ll.print();
//            System.out.println("Size of Fianl ll "+ll.size);
        }
    }


