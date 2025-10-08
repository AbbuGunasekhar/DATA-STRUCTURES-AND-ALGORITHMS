import java.util.*;
enum Days
{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
enum Winner
{
    First(10),Second(20),Third(30);
    int data;

    Winner(int data)
    {
        this.data=data;
    }
    int getData()
    {
        return data;
    }
}
class Main
{
    public static void main(String[] args) {
        EnumSet<Days> alldays=EnumSet.allOf(Days.class);
        System.out.println("ALL DAYS"+alldays);
        EnumSet<Days> weekend=EnumSet.of(Days.Saturday,Days.Sunday);
        System.out.println("WEEKEND DAYS:"+weekend);
        EnumSet<Days> set=EnumSet.complementOf(weekend);
        System.out.println("Working DAYS:"+set);
        EnumSet<Days> mid=EnumSet.range(Days.Tuesday, Days.Friday);
        System.out.println("MID WEEK:"+mid);
        System.out.println("Ordinal for Enum Friday:"+Days.Friday.ordinal());

        System.out.println("2nd winner data:"+Winner.Second.getData());
    }
}