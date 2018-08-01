/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Factorial
{
	 static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int fact=1,n;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter");
		n=sc.nextInt();	
		fact=factorial(n);
		System.out.println(fact);
		
		
			}
}
