public class Jupiter 
{
Jupiter()
{
System.out.println("Default constructor");
}
Jupiter(float num,int total)
{
System.out.println(num + "," +  total );
}
Jupiter(int num,int total)
{
System.out.println(num);
}
Jupiter(int total,float num)
{
System.out.println(total);
}
public static void main(String[]args)
{
new Jupiter();
new Jupiter(9.8f,4562);
new Jupiter(1234,5678);
new Jupiter(4562,9.8f);
}
}


