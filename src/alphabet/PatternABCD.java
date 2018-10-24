package alphabet;
/*
Enter the number
5
    A
   BC
  DEF
 GHIJ
KLMNO

*/
import java.util.Scanner;

public class PatternABCD {

	public static void main(String[] args) {
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)    
		{    
			System.out.print(" ");    
		}    
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(64+k));
			k++;
		}
		System.out.println();
	}sc.close();
}
}
