package word;
/*
R a g h u 
R a g h 
R a g 
R a 
R 

*/
public class PatternRagRaR {

	public static void main(String[] args) {
		String st="Raghu";
		for(int i=st.length()-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
		}
}
