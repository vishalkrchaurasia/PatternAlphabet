package letter;
/*
Enter the number
5
 *   *
 * *  
 *    
 * *  
 *   *

*/
import java.util.Scanner;

public class PatternKStar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n/2+1;j<=n;j++)
			{
				if(i==j||i+j==n+1||j==n/2+1)
				System.out.print(" *");
				else
					System.out.print("  ");
			
				}
			System.out.println();
		}sc.close();
}
}