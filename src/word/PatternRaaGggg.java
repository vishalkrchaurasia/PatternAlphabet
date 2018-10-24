package word;
/*
R 
a a 
g g g 
h h h h 
u u u u u 

*/
public class PatternRaaGggg {

	public static void main(String[] args) {
		String s="Raghu";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}
}
}