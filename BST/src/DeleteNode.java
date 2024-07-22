import java.util.ArrayList;

public class DeleteNode {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node findInorderSuccesor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else {
            //case-1 leaf node
            if (root.left == null && root.right == null) {
                return root.right;
            }

            //case-2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case-3 both child
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
            return root;
    }

    //Print in range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if (root.data < k1) {
            printInRange(root.left,k1,k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    //path frm root to leaf

    public static void printPath(ArrayList<Integer>path){
        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void rootToleaf(Node root, ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootToleaf(root.left,path);
        rootToleaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args){
        int[] values = {8,5,3,1,4,6,10,11,14};
         Node root = null;

        for(int i=0; i< values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

//        root= delete(root, 10);
//        System.out.println();
//        inorder(root);
       // printInRange(root,5,12);
        rootToleaf(root,new ArrayList<>());
    }
}
