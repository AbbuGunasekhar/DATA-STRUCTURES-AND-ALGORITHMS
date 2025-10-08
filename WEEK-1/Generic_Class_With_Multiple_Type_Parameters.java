class Generic_Class<T,V> {
    V v;
    T t;
    Generic_Class(T t,V v)
    {
        this.t=t;
        this.v=v;
    }
    //method over-loading
    void print()
    {
        System.err.println(t);
        System.err.println(v);
    }
    
}
class Main{
    public static void main(String[] args) {
        //double d=9;
      //  Double D=0;
        
        Generic_Class<String,Integer> obj1=new Generic_Class<>("Guna",10);
        obj1.print();
        Generic_Class<Double,Boolean> obj2=new Generic_Class<>(10.4,true);
        obj2.print();
       

    }
}