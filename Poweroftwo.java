import java.util.*;
import java.lang.*;
import java.io.*;
class Poweroftwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int flag=0,i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	 while(n!=1)
    {
        if(n%2==0)
        {
        flag=1;
        }
        else
        {
            flag=0;
        }
        n=n/2;
    }
    if(flag==1)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }
	}
}
