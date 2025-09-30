public class Generic_Class_With_Array<T> {
    T []t;
    Generic_Class_With_Array(T[] t)
    {
        this.t=t;
    }
    void print()
    {
        for(T i:t)
        System.out.print(i+" ");
        System.out.println();
    }
    void reverse()
    {
        int j=t.length-1;
        for(int i=0;i<j;i++)
        {
            T temp=t[i];
            t[i]=t[j];
            t[j]=temp;
            i++;
            j--;
        }
    }
    
}

class Main 
{
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        Generic_Class_With_Array<Integer> obj1=new Generic_Class_With_Array<Integer>(arr);
        obj1.print();
        obj1.reverse();
        System.out.print("After Reverse:");
        obj1.print();

        String str[]={"HI","hello","how are you"};
        Generic_Class_With_Array<String> obj2=new Generic_Class_With_Array<String>(str);
        obj2.print();
        obj2.reverse();
        System.out.print("After Reverse:");
        obj2.print();
    }
}