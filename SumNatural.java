import java.util.*;

import java.lang.*;
				
import java.io.*;
				
				
/* Name of the class has to be "Main" only if the class is public. */
				
class SumNatural				
{
					
public static void main (String[] args) throws java.lang.Exception
					
{
						
int n,sum=0;
						
Scanner sc=new Scanner(System.in);
                        
//System.out.println("Enter n value");
                        
n=sc.nextInt();
  
//int num = 100, sum = 0;

        for(int i = 1; i <= n; ++i)
        {
            // sum = sum + i;
            sum=sum+i;
        }

        System.out.println(sum);
					
}
				
}
