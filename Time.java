public class Time 
{
Time()
{
System.out.println("Default constructor");
}
Time(float num,int total)
{
System.out.println(num + "," +  total );
}
Time(int num,int total)
{
System.out.println(num);
}
Time(int total,float num)
{
System.out.println(total);
}
public static void main(String[]args)
{
new Time();
new Time(9.8f,4562);
new Time(1234,5678);
new Time(4562,9.8f);
}
}


