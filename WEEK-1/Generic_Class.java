public class Generic_Class<T> {
    T t;
    Generic_Class(T t)
    {
        this.t=t;
    }
    void print()
    {
        System.err.println(t);
    }
}
class Main{
    public static void main(String[] args) {
        Generic_Class<Integer> obj1=new Generic_Class<Integer>(10);
        obj1.print();
        Generic_Class<String> obj2=new Generic_Class<>("Guna");
        obj2.print();
        Generic_Class<Double> obj3=new Generic_Class<Double>(5.4);
        obj3.print();

    }
}