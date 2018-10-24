package alphabet;
/*
Enter the number
5
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 
*/
import java.util.Scanner;

public class Patterna_y {
	public static void main(String[] args) {
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(k+65)+" ");
				k++;
			}
			System.out.println();
		}
		sc.close();

	}
}