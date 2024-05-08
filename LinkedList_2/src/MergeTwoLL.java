public class MergeTwoLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

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
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static MergeTwoLL merge(MergeTwoLL first, MergeTwoLL second){

        Node f = first.head;
        Node s = second.head;

        MergeTwoLL ans = new MergeTwoLL();

        while(f != null && s != null){
            if(f.data < s.data){
                ans.addLast(f.data);
                f = f.next;
            }
            else{
                ans.addLast(s.data);
                s = s.next;
            }
        }

        while(f != null){
            ans.addLast(f.data);
            f = f.next;
        }
        while(s != null){
            ans.addLast(s.data);
            s = s.next;
        }
        return ans;
    }
        public static void main(String[] args){
        MergeTwoLL first = new MergeTwoLL();
        MergeTwoLL second = new MergeTwoLL();

            first.addLast(1);
            first.addLast(3);
            first.addLast(5);

            second.addLast(1);
            second.addLast(2);
            second.addLast(9);
            second.addLast(14);


            MergeTwoLL ans = MergeTwoLL.merge(first,second);
            ans.print();

        }
}
