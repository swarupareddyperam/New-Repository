import java.util.Scanner;
 class Reve
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse().toString());
	}
}
