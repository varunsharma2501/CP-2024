// package _DAY12;
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
public class _1traversals {
    
    public static void preorder(node root){
        if(root==null){
           return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(node root){
        if(root==null){
           return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(node root){
        if(root==null){
           return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
}
