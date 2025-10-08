
import java.util.*;
public class toArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(10);
        arr.add(20);

        Integer a[]=new Integer[3];

        a=arr.toArray(a);
        System.err.println(Arrays.toString(a));
    }
}
