/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayIndex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[];
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i=0;i<10;i++)
		System.out.println(a[i]+" "+i+" ");
	}
}
