import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector v=new Vector(2);

        v.add("hii");
        v.add(10);
         System.out.println(v.capacity());
        v.add('c');
        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
