/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeNumb
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int low=20,high=50,i,flag=0;
		while(low<high)
		{
			flag=0;
			for(i=2;i<=low/2;++i)
			{
				if(low%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(" "+low);
			}
			++low;
		}
	}
}
