/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
  int n=998766,count=0;
  while(n!=0)
  {
  n=n/10;
  ++count;
  }
  System.out.println("Number of digits"+count);
	   
	}
}
