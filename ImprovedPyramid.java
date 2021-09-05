
public class ImprovedPyramid {
	public static void main(String[]args)
	{
		for(int i=0;i<8;i++)
		{
			for(int k=1;k<8-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j--)
			{
				System.out.print(Math.pow(2,j)+" ");
			}
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(Math.pow(2,j)+" ");
			}for(int k=1;k<8-i-1;k++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
