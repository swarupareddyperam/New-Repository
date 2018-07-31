/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Arraymin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//int a[];
		int i,min,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		
			a[i]=sc.nextInt();
		}
		
		min=a[0];
		for(i=1;i<n;i++)
		{
		
		if(a[i]<min)
		{
			min=a[i];
		}
		
		}
		System.out.println(min);
	
		
		
	}
}
