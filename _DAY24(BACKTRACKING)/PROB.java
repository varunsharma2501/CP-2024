// reverse linked list


Node prev=null;
Node curr=head;

while(head!=null){
    Node next=curr.next;      
    curr.next=prev;
    prev=curr;
    curr=next;
}

return prev;