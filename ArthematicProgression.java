/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArthematicProgression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    int n,a,d,sum;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    a=sc.nextInt();
	    d=sc.nextInt();
	    //sum=(n*((2*a)+(n-1)*d)/2);
	       sum=(n*(2*a+(n-1)*d)/2);

	    System.out.println(sum);
	}
}
