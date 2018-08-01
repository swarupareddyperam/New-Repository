/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

/* Name of the class has to be "Main" only if  class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int e,b;
		Scanner sc=new Scanner(System.in);
		e=sc.nextInt();
		b=sc.nextInt();
		int p=(int)Math.pow(e,b);
		System.out.println(p);
		
	}
}
