class Gen{
   // Works only with object arrays (e.g., Integer[], String[]).
    static <T>void array(T e[])
    {
        System.out.println("Elemets are:");
        for(T i:e)
        System.out.println(i);
    }

    //More flexible and Type Safe
    static <T>void varargs(T ...e)
    {
        System.out.println("No Elemets are:"+e.length);
        for(T i:e)
        System.out.println(i);
    }
    
    //Treates Every value as object loss type safety
    static <T>void obj(Object ...o)
    {
        for(Object i:o)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        //1.Using Array
        Integer arr1[]={10,20};
       Integer arr2[]={30,10,5};
       System.out.println("Using Array");
        array(arr1);
        array(arr2);

        //2.varargs using ellipses
        System.out.println("varargs using ellipses");
        varargs(1,2,3);
        varargs("Hi","Hello");

        System.out.println("Using Object Class");
        //3.Using Object
        obj(1,"String",3,true);

    }

}