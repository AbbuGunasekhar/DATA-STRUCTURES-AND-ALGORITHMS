import java.util.*;
public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        arr.add(new Student(540,"Guna"));
        arr.add(new Student(535,"Durai"));
        arr.add(new Student(548, "Hemanadhan"));

        System.err.println("Ascending Order of Roll Number");
        arr.sort(
            (a,b)-> a.roll-b.roll
        );
        for(Student i:arr)
        System.out.println(i.roll+" "+i.name);
        

        System.err.println("Decending Order of Roll Number");
        arr.sort(
            (a,b)-> b.roll-a.roll
        );
        for(Student i:arr)
        System.out.println(i.roll+" "+i.name);
        

         System.err.println("Ascending Order of Name");
        arr.sort(
            (a,b)-> a.name.compareTo(b.name)
        );
        for(Student i:arr)
        System.out.println(i.roll+" "+i.name);
        

        System.err.println("Decending Order of Name");
        arr.sort(
            (a,b)-> b.name.compareTo(a.name)
        );
        arr.forEach(s->System.out.println(s.roll+" "+s.name));

        

    }
}
class Student
{
    int roll;
    String name;
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
}
