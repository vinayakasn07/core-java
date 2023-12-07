public class Student
{
public static void main(String[]args)
{
byte value1=rollNumber();
System.out.println(value1);

short value2=registerNumber();
System.out.println(value2);

int value3=marksScored();
System.out.println(value3);

long value4=serialNumber();
System.out.println(value4);

char value5=grade();
System.out.println(value5);

boolean value6=result();
System.out.println(value6);

float value7=marksInDecimal();
System.out.println(value7);

double value8=schoolFees();
System.out.println(value8);


}
static byte rollNumber()
{
byte value=27;
return value;

}

static short registerNumber()
{
short value=12570;
return value;

}

static int marksScored()
{
int value=576;
return value;

}

static long serialNumber()
{
long value=999999;
return value;

}

static char grade()
{
char value='A';
return value;

}

static boolean result()
{
boolean pass=true;
return pass;

}

static float marksInDecimal() 
{
float value=90.1f;
return value;

}

static double schoolFees()
{
double value=50000.00d;
return value;

}

}
