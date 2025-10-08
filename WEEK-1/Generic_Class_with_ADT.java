class Student
{
    private String name;
    private int marks;
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public void get()
    {
        System.out.println("Student Name:"+name);
        System.out.println("Student Marks:"+marks);
    }
}
 class Generic_Class_with_ADT<T extends Student>{
    T t;

  //  T arr[]=new T[5]; error: generic array creation
    Generic_Class_with_ADT(T t)
    {
        this.t=t;
    }
    void print()
    {
      t.get();
    }
}
class Main{
    public static void main(String[] args) {
        Student obj=new Student("Durai",100);
       // obj.get();
        Generic_Class_with_ADT<Student> genobj=new Generic_Class_with_ADT<Student>(obj);
        genobj.print();
    }
}