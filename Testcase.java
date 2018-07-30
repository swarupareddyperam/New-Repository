import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Testcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a value");
		n=sc.nextInt();
		if(n>0)
		       System.out.println("Positive");
		else if(n==0)
			System.out.println("Zero");
		else 
		        System.out.println("Negative");
		
	}
}




