
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
    public void printlist()
    {
        Node curr=head.next;
        while(curr!=null)
        {
            System.err.println(curr.data);
            curr=curr.next;
        }
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
     public int deletAtFirst()
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
        list.insertAtFront(10);
        list.insertAtFront(20);
        list.insertAtEnd(30);
        list.insertAtAnyPos(15,1);
        list.printlist();
    }
}