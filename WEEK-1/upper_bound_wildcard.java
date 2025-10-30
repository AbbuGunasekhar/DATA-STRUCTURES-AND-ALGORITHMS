import java.util.*;
public class upper_bound_wildcard {
    public static void main(String[] args) {
        List<Integer> arr1=Arrays.asList(1,2,3,4);
        List<Double> arr2=Arrays.asList(10.5,45.5,3.333);

        System.out.println("Integer Sum:"+sum(arr1));
        System.out.println("Double Sum:"+sum(arr2));
    }
    //Accepts Number,Integer,Float,Double,Byte
    static double sum(List<? extends Number> arr)
    {
        double sum=0;
        for(Number i:arr)
        sum+=i.doubleValue();

        return sum;
    }
}
