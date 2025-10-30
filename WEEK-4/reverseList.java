class JLinkedList
{
   static  Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
       Node()
       {
        next=null;
       }
    }
    JLinkedList()
    {
        head=new Node();
    }
    
     void insertAtEnd(int data)
    {
       
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    void printlist()
    {
        Node curr=head.next;
        while(curr!=null)
        {
            System.err.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    void reverse()
    {
        Node curr=head.next,prev=null;
        while(curr!=null)
        {
            Node next=curr.next;

            curr.next=prev;
            prev=curr;

            curr=next;
        }
        head.next=prev;
        // while(prev!=null)
        // {
        //     System.out.println(prev.data);
        //     prev=prev.next;
        // }
    }
   
}
class reverseList
{
    public static void main(String[] args) {
        JLinkedList list=new JLinkedList();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.printlist();
        list.reverse();
       System.out.println("After Reverse:");
       list.printlist();

    }
}