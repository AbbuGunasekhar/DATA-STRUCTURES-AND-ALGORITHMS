import java.util.*;
public class no_bound {
    public static void main(String[] args) {
        List<Integer> arr1=Arrays.asList(1,2,3,4);
        List<Double> arr2=Arrays.asList(10.5,45.5,3.333);

     print(arr1);
    }
    //Accepts Number,Integer,Float,Double,Byte
    static void print(List<?> arr)
    {
        System.err.println(arr);
    }
}
