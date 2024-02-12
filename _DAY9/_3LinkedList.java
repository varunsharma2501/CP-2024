class node{
    node next;
    int data;
    node(int x){
        data=x;
        next=null;
    }
}
public class _3LinkedList {

    // insert a node at n position .position starts from 1

    public static node NInsert(node head,int k){
        node n=new node(k);

        if(k==1){
            n.next=head;
            return n;
        }
        node temp=head;
        int i=1;
        while(i<=k-2){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
    }

    public static void traverse(node head){
        node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static node deleteN(node head){
        node curr=head;
        int i=1;
        while(i<=)
    }
    public static void main(String[] args) {
        
    }
}
