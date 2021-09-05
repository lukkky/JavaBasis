import java.util.*;
public class PatternRecongnition {
	public static void main(String[]args)//假定输入的值范围是0~9
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the row of the matrix:");
		int row=input.nextInt();
		System.out.println("enter the column of the matrix:");
		int column=input.nextInt();
		int [][]matrix=new int[row][column];
		System.out.println("now enter th value:");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				matrix[i][j]=input.nextInt();
		show(matrix);
		int result=check(matrix,column,row);
		if(result>=0)
			System.out.println("the marix has 4 "+result);
		else
			System.out.println("the matrix does not has 4 same value.");
		input.close();			
	}
	public static void show(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
			{
			for(int j=0;j<matrix[i].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
			}				
	}
	public static int check(int [][]matrix,int column,int row)
	{
		for(int i=0;i<10;i++)
		{
			if(columnCheck(matrix,i,row,column)==1)
				return i;
			else
				if(rowCheck(matrix,i,row,column)==1)
					return i;
				else
					if(checkDiagonalsInOrder(matrix,i,row,column)==1)
						return i;
					else
						if(checkDiagonalsInReverseOrder(matrix,i,row,column)==1)
						return i;
		}
		return -1;
		
	}
	public static int columnCheck(int[][]arr,int value,int row,int column)//count number for value;
	//找到一组就可以了；找到了返回1，没有返回0；
	{
		int count=0;
		if(column<=3)
			return 0;
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
			if(arr[j][i]==value)
				count++;
			if(count==4)
				return 1;
			}
			count=0;
		}
		
		return 0;
		
	}
	public static int rowCheck(int[][]arr,int value,int row,int column)//count number for value;
	//找到一组就可以了；找到了返回1，没有返回0；
	{
		int count=0;
		if(row<=3)
			return 0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
			if(arr[i][j]==value)
				count++;
			if(count==4)
				return 1;
			}
			count=0;
		}
		
		return 0;
		
	}
	public static int checkDiagonalsInOrder(int[][]matrix,int value,int row,int column)
	{
		int count=0;
		int m=Math.min(row,column);
		if(m<=3)
			return 0;
		for(int k=0;k<m;k++)
		{
			for(int i=3;i<m;i++)	
         	{    
			for(int j=0;j<=i&&(k+j)<m;j++)//检查一个方阵；
			{
				if(matrix[j+k][j]==value)
				{
					count++;
				}
				if(count==4)
					return 1;
			}
			count=0;
		}
		}
	return 0;
	}
	public static int checkDiagonalsInReverseOrder(int[][]matrix,int value,int row,int column)
	{
		int count=0;
		int m=Math.min(column, row);
		if(m<=3)
		return 0;
		for(int k=0;k<m;k++)
		{
			for(int i=m-1;i>=3;i--)	
		{
			for(int j=m-1;j>=0&&(k+j)<m;j--)//检查一个方阵；
			{
				if(matrix[i-j-k][j+k]==value)
				{
					count++;
				}
				if(count==4)
					return 1;
			}
			count=0;
		}
		}
	return 0;
	}
}
