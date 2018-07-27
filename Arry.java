/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Arry
{
	public static void main (String[] args) 
	{
		int n,k,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int i;
		for(i=1;i<n;i++)
		{
			n=sc.nextInt();
		}
		for(i=1;i<k;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum:"+sum);
	}
}
