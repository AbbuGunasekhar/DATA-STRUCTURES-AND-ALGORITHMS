class SpecificArrayInt {
    int a[];
    SpecificArrayInt(int arr[])
    {
        a=arr;
    }
    void print()
    {
        for(int i:a)
        System.err.println(i);
    }
}
class Main
{
    public static void main(String[] args) {
        SpecificArrayInt obj=new SpecificArrayInt(new int[]{10,20,30,40,50});
        obj.print();
    }
}