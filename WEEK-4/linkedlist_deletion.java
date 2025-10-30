public class JLinkedList
{
   static  Node head;
   public class Node
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
   public JLinkedList()
    {
        head=new Node();
    }
    
   public  void insertAtEnd(int data)
    {
       
        Node newNode=new Node(data);
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
   public void printlist()
    {
        Node curr=head.next;
        while(curr!=null)
        {
            System.err.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

   public static int deletAtFirst()
    {
        int x=-1;
        Node temp=head.next;
        if(temp!=null)
        {
            x=temp.data;
            head.next=temp.next;
        }
        return x;
    }
   public int deletAtEnd()
    {
        int data=-1;
        Node curr=head.next,prev=null;
        while(curr!=null && curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        if(prev!=null)
        {
            data=curr.data;
            prev.next=null;
        }

        return data;
    }
   public int deleteKey(int key)
    {
        Node prev=null,temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                prev.next=temp.next;
                return key;
            }

            prev=temp;
            temp=temp.next;
        }
       
        
        return -1;
    }
   
}
class Main
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

        System.out.println( "Deleted Element At Front:"+ list.deletAtFirst());
        System.out.println( "After Deletion At Front");
        list.printlist();

        System.out.println( "Deleted Element At End:"+ list.deletAtEnd());
        System.out.print( "After Deletion At End:");
        list.printlist();

        System.out.println( "Deleted key in the list:"+ list.deleteKey(40));
        System.out.print( "After Deletion of Given Key:");
        list.printlist();
    }
}