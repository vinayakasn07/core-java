public class Number 
{
Number()
{
System.out.println("Default constructor");
}
Number(float num,int total)
{
System.out.println(num + "," +  total );
}
Number(int num,int total)
{
System.out.println(num);
}
Number(int total,float num)
{
System.out.println(total);
}
public static void main(String[]args)
{
new Number();
new Number(9.8f,4562);
new Number(1234,5678);
new Number(4562,9.8f);
}
}


