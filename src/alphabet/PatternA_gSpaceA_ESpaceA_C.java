package alphabet;
/*Enter the Number
5
A B C D E F G H I 
  A B C D E F G 
    A B C D E 
      A B C 
        A 
*/
import java.util.Scanner;

public class PatternA_gSpaceA_ESpaceA_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
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
