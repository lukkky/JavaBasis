import java.util.*;
public class DiagonalReverseTest {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		char [][]matrix=new char[6][7];
		for(int i=2;i<6;i++)
		{
			matrix[i][8-i]='R';
		}
		pattern(matrix);
	int result=DiagonalsInReverseOrderCheck(matrix);
		if(result==1)
			System.out.println("red win.");
		if(result==-1)
			System.out.println("yellow win.");
		else
			System.out.println("neither of they win.");
		input.close();
		
	}
	public static int DiagonalsInReverseOrderCheck(char[][]matrix)
	{
		int countr=0;
		int county=0;
		int m=6;
		int row=0;
		int column=0;
		for(int k=0;k<m;k++)
		{
			for(int i=6;i>=3;i--)	
		{
			for(int j=0;j<m&&Math.abs(i-j-k)<m+1;j++)//检查一个R方阵；
			{
				column=Math.abs(i-j);
			    row=j+k;
			    if(row==6)
					break;
				if(matrix[row][column]=='R')
				{
					countr++;
				}
				if(countr==4)
					return 1;
			}
			countr=0;
			for(int j=0;j<m&&(i-j-k)<m+1;j++)//检查一个Y方阵；
			{
				column=Math.abs(i-j);
			    row=j+k;
			    if(row==6)
					break;
				if(matrix[row][column]=='Y')
				{
					county++;
				}
				if(county==4)
					return -1;
			}
			county=0;
			
		}
		}
	return 0;
	}
	public static void pattern(char [][]arr)
	{
		System.out.println("------------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("|");
				if(arr[i][j]=='R'||arr[i][j]=='Y')
				{ 
					String temp=arr[i][j]+"";
					System.out.printf("%4s",temp);
				}
				else
					System.out.printf("%4s","");
			}
			System.out.print("|");
			System.out.println();
			System.out.println("------------------------------------");
		}
	}

}
