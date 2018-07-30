/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,sum=0,temp,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	n=sc.nextInt();
	temp=n;
	
	while(n>0)
	{
		r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if(temp==sum)
	{
		System.out.println("yes");
	}
	else
	{
			System.out.println(" no");
		
	}
	
	}
}
