public class Telephone 
{
Telephone()
{
System.out.println("Default constructor");
}
Telephone(float num,int total)
{
System.out.println(num + "," +  total );
}
Telephone(int num,int total)
{
System.out.println(num);
}
Telephone(int total,float num)
{
System.out.println(total);
}
public static void main(String[]args)
{
new Telephone();
new Telephone(9.8f,4562);
new Telephone(1234,5678);
new Telephone(4562,9.8f);
}
}


