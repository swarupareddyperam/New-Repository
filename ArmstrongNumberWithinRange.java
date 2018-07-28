import java.util.Scanner; 
public class ArmstrongNumberWithinRange 
{ 
               public static void main(String args[]) 
            { 
               Scanner s=new Scanner(System.in); 
               System.out.print("Enter the Range :"); 
               int range=s.nextInt(); 
               int a,b,c,sum,count=0; 
               b=1; 
               while(b<=range) 
                    { 
                        sum=0; 
                        c=b; 
                        while(c>0) 
                             { 
                                a=c%10; 
                                sum=sum+(a*a*a); 
                                c=c/10; 
                             } 
                         if(sum==b) 
                       { 
                         System.out.println(b+" is a Armstrong Number"); 
                         count=count+1; 
                       } 
                          b++; 
                     } 
System.out.println("Total Armstrong Number Present With in that Range is "+count); 
                } 
} 
