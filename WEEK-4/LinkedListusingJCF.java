
import java.util.*;
public class LinkedListusingJCF {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeLast();
        list.add(2,15);
        System.out.println(list);
         System.out.println(list.get(1));
    }
}
