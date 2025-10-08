import java.util.*;
public class array {
    public static void main(String[] args) {
        int arr[];
        arr=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(args));// give input while running ex: java array 1 2 3 "guna"
    }
    
}
/*Output:

 PS D:\JAVA DSA NPTEL\DATA-STRUCTURES-AND-ALGORITHMS\week-3> javac array.java     
PS D:\JAVA DSA NPTEL\DATA-STRUCTURES-AND-ALGORITHMS\week-3> java array 1 2 3 "guna"
[1, 2, 3, 4]
[1, 2, 3, guna]
 */
