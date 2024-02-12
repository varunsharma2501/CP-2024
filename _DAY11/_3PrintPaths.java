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

public class _3PrintPaths {

    public static void printAll(node root,int temp[],int cnt){
        // termination condition
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            // print the content of array
            temp[cnt]=root.data;
            for(int i=0;i<=cnt;i++){
                System.out.print(temp[i]+" ");
            }
            System.out.println();
        }

        temp[cnt]=root.data;
        printAll(root.left, temp, cnt+1);
        printAll(root.right, temp, cnt+1);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.left.left.right=new node(6);

        printAll(root, new int[10], 0);
    }
}
