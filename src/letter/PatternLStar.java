package letter;
/*
Enter the number
5
 *    
 *    
 *    
 *    
 * * *

*/
import java.util.Scanner;

public class PatternLStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n/2+1;j++)
			{
				if(j==1||i==n)
				System.out.print(" *");
				else
					System.out.print("  ");
			
				}
			System.out.println();
		}sc.close();
}
}