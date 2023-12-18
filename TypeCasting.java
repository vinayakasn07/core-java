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

long run=9517538462l;
int skip=(int)run;
short jump=(short)skip;
byte swim=(byte)jump;
double act=9.85632147d;
float drive=(float)act;

System.out.println(skip);
System.out.println(jump);
System.out.println(swim);
System.out.println(drive);

char alphabet='A';
int number=(int)alphabet;
System.out.println(number);

int digits=122;
char letters=(char)digits;
System.out.println(letters);

}
}




