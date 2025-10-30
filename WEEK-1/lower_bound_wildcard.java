import java.util.*;
public class lower_bound_wildcard {
    public static void main(String[] args) {
        List<Integer> arr1=Arrays.asList(1,3,5,7);
        List<Number> arr2=Arrays.asList(10,20,3.5);
        System.out.println("Integer Array");
        printBoth(arr1);
        System.out.println("Number Array");
        printBoth(arr2);
    }
//  List<Object>,
//  List<Number>, and
//  List<Integer>
// are all valid arguments for printBoth().

    static void printBoth(List<? super Integer> arr)
    {
        System.out.println(arr);
    }
}
