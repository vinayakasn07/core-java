public class LinkedIn 
{
LinkedIn()
{
System.out.println("Default constructor");
}
LinkedIn(float num,int total)
{
System.out.println(num + "," +  total );
}
LinkedIn(int num,int total)
{
System.out.println(num);
}
LinkedIn(int total,float num)
{
System.out.println(total);
}
public static void main(String[]args)
{
new LinkedIn();
new LinkedIn(9.8f,4562);
new LinkedIn(1234,5678);
new LinkedIn(4562,9.8f);
}
}


