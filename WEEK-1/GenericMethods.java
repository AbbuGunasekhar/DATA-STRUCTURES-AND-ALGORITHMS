class Gen
{
    <T>void generic_method(T val)
    {

        System.out.println("Value: "+val+" Class: "+val.getClass().getName());
    }
    public static void main(String str[])
    {
        Gen obj=new Gen();
        obj.generic_method(9);
        obj.generic_method("hello");
        obj.generic_method(9.5);
    }

}