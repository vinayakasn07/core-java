public class TypeCasting
{
public static void main(String[]args)
{
byte sum=90;
short num=sum;
int add=num;
long sub=add;
float div=9.8f;
double mul=div;

System.out.println(num);
System.out.println(add);
System.out.println(sub);
System.out.println(mul);

long sum1=9517538462l;
int num1=(int)sum1;
short add1=(short)num1;
byte sub1=(byte)add1;
double div1=9.85632147d;
float mul1=(float)div1;

System.out.println(num1);
System.out.println(add1);
System.out.println(sub1);
System.out.println(mul1);

char alphabet='A';
int number=(int)alphabet;
System.out.println(number);

int number1=122;
char alphabet1=(char)number1;
System.out.println(alphabet1);

}
}




