
class StackL{
    JLinkedList top;
    StackL()
    {
        top=new JLinkedList();
    }
    void push(int data)
    {
        top.insertAtEnd(data);
    }
    int pop()
    {
       return  top.deletAtEnd();
    }
    void print()
    {
        top.printlist();
    }
}

public class stack_using_linkedlist {
    public static void main(String[] args) {
        StackL st=new StackL();
        st.push(10);
        st.push(20);
        st.push(30);
        
        System.out.println("Initial Stack:");
        st.print();

        System.out.println("Popped: "+st.pop());

        System.out.println("Final Stack:");
        st.print();
    }
}
