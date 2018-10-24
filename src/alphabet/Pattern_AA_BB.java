package alphabet;
/*
Enter the number
5
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
*/

import java.util.Scanner;

public class Pattern_AA_BB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
			for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}sc.close();
		}
}
