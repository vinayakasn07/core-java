public class Calculator
{
	public static void main(String[]args)
	{
int[] add={17,20,35,40,50,65,70,89};
int[] sub={11,21,31,44,55,67,79,88};
int[] mul={1,2,3,4,5,6,7,8};
 int[] div={101,201,301,401,501,601,701,801};
int[] mod={100,200,300,400,500,600,700,800};

for (int i=add.length-1; i>=0; i--)
{
System.out.println(add[i]);
}

for (int i=(add.length-1)/2; i<add.length; i++)
{
System.out.println(add[i]);
}

for (int i=(add.length-1)/2; i>=0; i--)
{
System.out.println(add[i]);
}

for (int i=0; i<add.length; i++)
{
if(add[i]%2==0)
{
System.out.println(add[i]);
}
}

for (int i=0; i<add.length; i++)
{
if(add[i]%2!=0)
{
System.out.println(add[i]);
}
}

int sum=0;
for (int i=0; i<add.length;i++)
{
sum=sum+add[i];
}
System.out.println(sum);
}
}

-----------------------------------------------------------------------------------------------



for (int i=sub.length-1; i>=0; i--)
{
System.out.println(sub[i]);
}

for (int i=(sub.length-1)/2; i<sub.length; i++)
{
System.out.println(sub[i]);
}

for (int i=(sub.length-1)/2; i>=0; i--)
{
System.out.println(sub[i]);
}

for (int i=0; i<sub.length; i++)
{
if(sub[i]%2==0)
{
System.out.println(sub[i]);
}
}

for (int i=0; i<sub.length; i++)
{
if(sub[i]%2!=0)
{
System.out.println(sub[i]);
}
}

int sum=0;
for (int i=0; i<sub.length;i++)
{
sum=sum+sub[i];
}
System.out.println(sum);
}
}
---------------------------------------------------------------------


for (int i=mul.length-1; i>=0; i--)
{
System.out.println(mul[i]);
}

for (int i=(mul.length-1)/2; i<mul.length; i++)
{
System.out.println(mul[i]);
}

for (int i=(mul.length-1)/2; i>=0; i--)
{
System.out.println(mul[i]);
}

for (int i=0; i<mul.length; i++)
{
if(mul[i]%2==0)
{
System.out.println(mul[i]);
}
}

for (int i=0; i<mul.length; i++)
{
if(mul[i]%2!=0)
{
System.out.println(mul[i]);
}
}

int sum=0;
for (int i=0; i<mul.length;i++)
{
sum=sum+mul[i];
}
System.out.println(sum);
}
}
---------------------------------------------------------------



for (int i=div.length-1; i>=0; i--)
{
System.out.println(div[i]);
}

for (int i=(div.length-1)/2; i<div.length; i++)
{
System.out.println(div[i]);
}

for (int i=(div.length-1)/2; i>=0; i--)
{
System.out.println(div[i]);
}

for (int i=0; i<div.length; i++)
{
if(div[i]%2==0)
{
System.out.println(div[i]);
}
}

for (int i=0; i<div.length; i++)
{
if(div[i]%2!=0)
{
System.out.println(div[i]);
}
}

int sum=0;
for (int i=0; i<div.length;i++)
{
sum=sum+div[i];
}
System.out.println(sum);
}
}
---------------------------------------------------------------


for (int i=mod.length-1; i>=0; i--)
{
System.out.println(mod[i]);
}

for (int i=(mod.length-1)/2; i<mod.length; i++)
{
System.out.println(mod[i]);
}

for (int i=(mod.length-1)/2; i>=0; i--)
{
System.out.println(mod[i]);
}

for (int i=0; i<mod.length; i++)
{
if(mod[i]%2==0)
{
System.out.println(mod[i]);
}
}

for (int i=0; i<mod.length; i++)
{
if(mod[i]%2!=0)
{
System.out.println(mod[i]);
}
}

int sum=0;
for (int i=0; i<mod.length;i++)
{
sum=sum+mod[i];
}
System.out.println(sum);
}
}
