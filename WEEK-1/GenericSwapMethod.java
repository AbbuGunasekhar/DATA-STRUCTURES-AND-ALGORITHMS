class GenericSwap
{
    static<T> void swap(T a,T b)
    {
        T temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a="+a+" and b="+b);
    }
    public static void main(String args[])
    {
        Integer a=5;
        Integer b=10;

        System.out.println("Before Swap a="+a+" and b="+b);
        swap(a,b);
        
        String s1="hi";
        String s2="hello";
        System.out.println();
        System.out.println("Before Swap a="+s1+" and b="+s2);
        swap(s1,s2);
        
    }
}