package alphabet;
/*
Enter the number
5
a b c d e 
a b c d e 
a b c d e 
a b c d e 
a b c d e 
*/

import java.util.Scanner;

public class Pattern_abcde5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
