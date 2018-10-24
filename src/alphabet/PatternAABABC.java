package alphabet;
/*
Enter the number
5
A
AB
ABC
ABCD
ABCDE

*/
import java.util.Scanner;

public class PatternAABABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}sc.close();
}
}
