public class Trainer
{
public static void main(String[]args)
{
teachesExcellent(true);
teachesExcellent(5400);
teachesExcellent((byte)2);
teachesExcellent(true,5400,(byte)2);
teachesExcellent(5400,true,(byte)2);
teachesExcellent(true,(byte)2,5400);
teachesExcellent(90,5400);
teachesExcellent(2,90,5400);
teachesExcellent(2,90,5400,5400000);
}

static void teachesExcellent(boolean a)
{
System.out.println(a);
}

static void teachesExcellent(int b)
{
System.out.println(b);
}

static void teachesExcellent(byte c)
{
System.out.println(c);
}

static void teachesExcellent(boolean a, int b,byte c)
{
System.out.println(a);
}

static void teachesExcellent(int a, boolean b,byte c)
{
System.out.println(c);
}

static void teachesExcellent(boolean a,byte b,int c)
{
System.out.println(a);
}

static void teachesExcellent(int a,int b)
{
System.out.println(a);
}

static void teachesExcellent(int a,int b,int c)
{
System.out.println(c);
}

static void teachesExcellent(int a,int b,int c,int d)
{
System.out.println(d);
}

}
