/*

* * *  * * *  * * *      *   *  *   *   *   *  * * * * *  *       *  * * *     
*   *  *   *  *          *   *  *   *   * *        *      * *     *  *         
* * *  * * *  *   * * *  * * *  *   *   *          *      *   *   *  *   * * * 
* *    *   *  *   *   *  *   *  *   *   * *        *      *     * *  *   *   * 
*   *  *   *  * * *   *  *   *  * * *   *   *  * * * * *  *       *  * * *   * 

 */
package word;
public class AlphabetWordPattern {

public static void main(String[] args) 
{
	int n=5;
	for(int i=1;i<=n;i++)
	{
		printR(n,i);
		System.out.print(" ");
		printA(n,i);
		System.out.print(" ");
		printG(n,i);
		System.out.print(" ");
		printH(n,i);
		System.out.print(" ");
		printU(n,i);
		System.out.print("  ");
		printk(n,i);
		System.out.print(" ");
		printI(n,i);
		System.out.print(" ");
		printN(n,i);
		System.out.print(" ");
		printG(n,i);
		System.out.println();
	}
	//printR(n);
	//printN(n);
	//printI(n);
	//printH(n);
	//printU(n);
	//printA(n);
	//printG(n);
}

private static void printU(int n,int i)
{
		for (int j = 1; j <=n/2+1; j++) 
		{
		if(j==1||j==n/2+1||i==n)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
}

private static void printH(int n,int i) 
{
	
		for (int j = 1; j <=n/2+1; j++) 
		{
		if(j==1||j==n/2+1||i==n/2+1)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
		
}

private static void printN(int n,int i)
{
		for (int j = 1; j <=n; j++) 
		{
		if(j==1||j==n||i==j)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
}

private static void printI(int n,int i) 
{
	
		for (int j = 1; j <=n; j++) 
		{
		if(i==1||i==n||j==n/2+1)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
}

private static void printR(int n,int i) 
{
	
		for (int j = n/2+1; j <=n; j++) 
		{
		if(j==n/2+1||i==j||i==1||i==n/2+1||j==n&&i<=n/2+1)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
		
}

private static void printk(int n,int i) 
{
	
		for (int j = n/2+1; j <=n; j++) 
		{
		if(j==n/2+1||(i==j||i+j==n+1))
			System.out.print("* ");
			else
			System.out.print("  ");
		}
		
}

private static void printG(int n,int i)
{
	
		for (int j = 1; j <=n; j++) 
		{
 if(j==1||(j==n/2+1||j==n)&&i>=n/2+1||i==n/2+1&&j>=n/2+1
				||(i==1||i==n)&&j<=n/2+1)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
		
}

private static void printA(int n,int i) 
{
	
		for (int j = 1; j <=n/2+1; j++) 
		{
		if((i==1||i==n/2+1)&&j<=n/2+1||j==1||j==n/2+1)
			System.out.print("* ");
			else
			System.out.print("  ");
		}
}
}