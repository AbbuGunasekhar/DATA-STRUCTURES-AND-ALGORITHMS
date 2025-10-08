import java.util.Arrays;
import java.util.Scanner;

class insertion
{
    public static void main(String[] args) {

        int arr[]={1,2,3};
        int a[]=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter Element to insert:");
        int num=sc.nextInt();
        for(int i=a.length-1;i>=1;i--)
        {
            a[i]=arr[i-1];
        }
        a[0]=num;

        System.out.println(Arrays.toString(a));
    }
}