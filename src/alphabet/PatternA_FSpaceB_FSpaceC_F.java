package alphabet;
/*
Enter the number
5
  A B C D E 
    B C D E 
      C D E 
        D E 
          E 

*/
import java.util.Scanner;

public class PatternA_FSpaceB_FSpaceC_F {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			int k=64+i;
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((char)k+" ");
				k++;
			}
			System.out.println();
		}
		sc.close();

	}

}
