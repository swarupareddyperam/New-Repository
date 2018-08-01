/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Sorting
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		
		int i,j,temp,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		
			a[i]=sc.nextInt();
		}
		        for (i = 0; i < n - 1; i++) {

		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		        }
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
