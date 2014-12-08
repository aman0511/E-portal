/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test
{
String name;
int roll;
Scanner sc=new Scanner(System.in);

void getDetails()
{
	name=sc.next();
	roll=sc.nextInt();
}

void display()
{
	System.out.println("name is"+name+"roll number"+roll);
}
}

class demo
{
	public static void main(String k[])
	{
		test b[];
	System.out.println("enter the number of students");
	Scanner sc=new Scanner(System.in);
	int c=sc.nextInt();

b=new test[c];
for(int i=0;i<c;i++)
{
	b[i]=new test();
	b[i].getDetails();

}


for(int i=0;i<c;i++)
{
b[i].setDetails();
}
	}
}