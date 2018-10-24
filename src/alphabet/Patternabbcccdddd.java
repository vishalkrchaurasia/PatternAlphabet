package alphabet;
/*
Enter the number
5
A
BB
CCC
DDDD
EEEEE

*/
import java.util.Scanner;

public class Patternabbcccdddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}sc.close();
	}
}
