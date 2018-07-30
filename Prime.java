/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,flag=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter n value ");
		n=sc.nextInt();
		for(i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
