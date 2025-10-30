
public class JLinkedList
{
    Node head;
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
   public void insertAtFront(int data)
    {
       
        Node newNode=new Node(data);
        newNode.next=head.next;
        this.head.next=newNode;
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
            System.err.println(curr.data);
            curr=curr.next;
        }
    }
   public void insertAtAnyPos(int data,int pos)
    {
        
        Node newNode=new Node(data);

         if(pos==1)
        {
         newNode.next=head.next;
         head.next=newNode;   

         return;
        }
        Node curr=head.next;
       
        while(pos>2)
        {
            curr=curr.next;
            pos--;
        }
        Node rem=curr.next;
        curr.next=newNode;
        newNode.next=rem;
    }
}
 class Main
{
    public static void main(String[] args) {
        JLinkedList list=new JLinkedList();
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtEnd(30);
        list.insertAtAnyPos(15,1);
        list.printlist();
    }
}