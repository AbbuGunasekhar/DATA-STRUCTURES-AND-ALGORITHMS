class StackA<T>
{
    T []data;
    int top;
    int length;
    StackA(T[] data)
    {
        this.data=data;
        top=-1;
        length=data.length;
    } 

    void push(T val)
    {
        if(top>=length-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        

        top=top+1;
        data[top]=val;
    }
    T pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
             return null;
        }
       

        T peek=data[top];
        data[top]=null;
        this.top=this.top-1;
        return peek;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    void print()
    {
       for(int i=top;i>=0;i--)
       System.out.print(data[i]+" ");

       System.out.println();
    }
}


public class stack_using_arrays {
    public static void main(String[] args) {
        Integer arr[]=new Integer[5];
        StackA<Integer> st=new StackA<Integer>(arr);
      
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.print();
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.print();

    }
}
