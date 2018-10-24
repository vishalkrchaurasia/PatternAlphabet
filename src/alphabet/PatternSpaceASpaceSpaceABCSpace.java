package alphabet;
/*
Enter the Number
5
        A 
      A B C 
    A B C D E 
  A B C D E F G 
A B C D E F G H I 

*/
import java.util.Scanner;

public class PatternSpaceASpaceSpaceABCSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}sc.close();
	}
}
