/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only f the class is public. */
class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int low,high,i,flag=0;
		Scanner sc=new Scanner(System.in);
		low=sc.nextInt();
		high=sc.nextInt();
		while(low<high)
		{
			flag=0;
			if(low%2!=0)
			{
				flag=0;
				System.out.print(" "+low);
				
			}
			++low;
		}
	}
}
