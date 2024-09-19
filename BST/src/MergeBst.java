import java.util.ArrayList;

public class MergeBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer>arr){
        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static Node createBst(ArrayList<Integer>arr, int st, int en){
        if(st>en){
            return null;
        }
        int mid = (st+en)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr, st, mid-1);
        root.right = createBst(arr,mid+1,en);
        return root;
    }

    public static Node mergeBst(Node root1, Node root2){
        //step-1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step-2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        //merge
        int i=0 , j=0;
        ArrayList<Integer> finalArr  = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBst(finalArr,0,finalArr.size()-1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBst(root1,root2);
        preorder(root);
    }
}
