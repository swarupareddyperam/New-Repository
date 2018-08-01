/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if  class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//System.out.println("Enter n value");
		temp=n;
	               while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
			if(temp==sum)
			{
			System.out.println("yes");
	                       	}
	  	           else
	               	{
			System.out.println("no");
			
	                    	}
	}
}
