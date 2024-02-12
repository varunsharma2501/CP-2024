// package _DAY12;
https://leetcode.com/problems/binary-tree-preorder-traversal/description/
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
https://leetcode.com/problems/binary-tree-postorder-traversal
https://leetcode.com/problems/binary-tree-level-order-traversal/description/
https://leetcode.com/problems/binary-tree-right-side-view
https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

// it is always possible to convert a recursive code to an iterative code by using stack because in recursion also we are storing the function calls in a stack
import java.util.*;
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
public class _2iterativeTraversal {
    public void preorder(node root,Stack<Integer> st){
        if(root==null){
            return;
        }

        System.out.println(root.data);

        
    }

    public void inorder(node root){
        Stack<
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        preorder(root,st);
 }   
}
