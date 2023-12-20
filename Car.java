public class Car
{
String brandName;
String colour;
int price;
int mileage;
int engineCapacity;
int numberOfAirbags;
int topSpeed;
boolean havingAc;

Car(String brandName,String colour,int price,int mileage,int engineCapacity,int numberOfAirbags,int topSpeed,boolean havingAc)
{
this.brandName=brandName;
this.colour=colour;
this.price=price;
this.mileage=mileage;
this.engineCapacity=engineCapacity;
this.numberOfAirbags=numberOfAirbags;
this.topSpeed=topSpeed;
this.havingAc=havingAc;
}

public static void main(String[]args)
{
Car ref=new Car("Mercedes","Black",4200000,23,1496,7,202,true);
System.out.println(ref.brandName);
System.out.println(ref.colour);
System.out.println(ref.price);
System.out.println(ref.mileage);
System.out.println(ref.engineCapacity);
System.out.println(ref.numberOfAirbags);
System.out.println(ref.topSpeed);
System.out.println(ref.havingAc);
System.out.println("        ");

Car ref1=new Car("BMW","white",5200000,26,1596,9,204,true);
System.out.println(ref1.brandName);
System.out.println(ref1.colour);
System.out.println(ref1.price);
System.out.println(ref1.mileage);
System.out.println(ref1.engineCapacity);
System.out.println(ref1.numberOfAirbags);
System.out.println(ref1.topSpeed);
System.out.println(ref1.havingAc);
System.out.println("        ");

Car ref2=new Car("Rolls Royce","red",10000000,46,1996,8,209,true);
System.out.println(ref2.brandName);
System.out.println(ref2.colour);
System.out.println(ref2.price);
System.out.println(ref2.mileage);
System.out.println(ref2.engineCapacity);
System.out.println(ref2.numberOfAirbags);
System.out.println(ref2.topSpeed);
System.out.println(ref2.havingAc);
System.out.println("        ");


Car ref3=new Car("Audi","white",6200000,30,1896,6,102,true);
System.out.println(ref3.brandName);
System.out.println(ref3.colour);
System.out.println(ref3.price);
System.out.println(ref3.mileage);
System.out.println(ref3.engineCapacity);
System.out.println(ref3.numberOfAirbags);
System.out.println(ref3.topSpeed);
System.out.println(ref3.havingAc);
System.out.println("        ");


Car ref4=new Car("Range Rover","Black",8000000,29,1796,5,211,true);
System.out.println(ref4.brandName);
System.out.println(ref4.colour);
System.out.println(ref4.price);
System.out.println(ref4.mileage);
System.out.println(ref4.engineCapacity);
System.out.println(ref4.numberOfAirbags);
System.out.println(ref4.topSpeed);
System.out.println(ref4.havingAc);
}
}