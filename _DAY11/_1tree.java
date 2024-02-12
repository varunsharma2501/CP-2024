// package _DAY11;

class node{
    int data;
    node left;
    node right;
    node(int x){
        data=x;
        left=null;
        right=null;
    }
}
public class _1tree {
    public static int Count(node root){
        if(root==null){
            return 0;
        }

        return 1+Count(root.left)+Count(root.right);
    }

    public static int CountLeaf(node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }

        return CountLeaf(root.left)+CountLeaf(root.right);
    }
    public static void main(String[] args) {
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
        root.left.right=new node(50);
        root.right.left=new node(60);
        root.right.right=new node(70);
        System.out.println(Count(root));
        System.out.println(CountLeaf(root));
    }

}
