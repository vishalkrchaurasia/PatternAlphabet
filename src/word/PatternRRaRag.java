package word;
/*
R 
R a 
R a g 
R a g h 
R a g h u 

*/
public class PatternRRaRag {

	public static void main(String[] args) {
		
		String s="Raghu";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
}
}
