public class diamOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int ldiam = diameter(root.left);
        int lheight = height(root.left);
        int rdiam = diameter(root.right);
        int rHeight = height(root.right);
        int selfDiam = lheight  + rHeight + 1;

        return Math.max(selfDiam, Math.max(ldiam, rdiam));
    }

    //Approach 2 TC - O(n)

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

        return new Info(diam,ht);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(diameter2(root).diam);
    }
}
