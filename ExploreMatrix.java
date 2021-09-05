import java.util.*;
public class ExploreMatrix 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the rank of the squre matrix:");
		int rank=input.nextInt();
		int[][]matrix=new int[rank][rank];
		for(int i=0;i<rank;i++)//fill matrix randomly with 1 and 0;
			for(int j=0;j<rank;j++)
			{
				matrix[i][j]=(int)(Math.random()*100)%2;
			}
		for(int i=0;i<rank;i++)//show the matrix
		{	
			for(int j=0;j<rank;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
		int[][][]sameInRows=sameInRows(matrix);
		int[][][]sameInColumns=sameInColumns(matrix);
		int[][][]sameInDiagonals=sameInDiagonals(matrix);
		show(sameInRows,sameInColumns,sameInDiagonals);
		input.close();
	}
	public static int[][][] sameInRows(int[][]matrix)//头部填充1，表示1，0表示0；
	//把行的个数一起传回去；
	{
		int [][][]index=new int[3][][];
		index[0]=new int[2][1];//放0，1的个数；
		index[1]=new int[1][matrix.length];//放全是1的row
		index[2]=new int[1][matrix.length];//放全是0的row
		boolean flag0=false;
		boolean flag1=false;
		int count1=0;
		int count0=0;
		//记录对应的行数；
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)//检查1
			{
				if(matrix[i][j]!=1)
					{				
					flag1=false;
					break;
					}
				else
					flag1=true;
			}
			if(flag1)
			{
				index[1][0][count1++]=i;
				flag1=false;
			}
			for(int j=0;j<matrix.length;j++)//检查0；
			{
				if(matrix[i][j]!=0)
					{				
					flag0=false;
					break;
					}
				else
					flag0=true;
			}
			if(flag0)
			{
				index[2][0][count1++]=i;
				flag0=false;
			}
		}
		//记录row个数；
		index[0][0][0]=count1;
		index[0][1][0]=count0;
		return index;
		
	}
	public static int[][][] sameInColumns(int[][]matrix)
	{
		int [][][]index=new int[3][][];
		index[0]=new int[2][1];//放0，1的个数；
		index[1]=new int[1][matrix.length];//放全是1的row
		index[2]=new int[1][matrix.length];//放全是0的row
		boolean flag0=false;
		boolean flag1=false;
		int count1=0;
		int count0=0;
		//记录对应的行数；
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)//检查1
			{
				if(matrix[j][i]!=1)
					{
					
					flag1=false;
					break;
					}
				else
					flag1=true;
			}
			if(flag1)
			{
				index[1][0][count1++]=i;
				flag1=false;
			}
			for(int j=0;j<matrix.length;j++)//检查0；
			{
				if(matrix[j][i]!=0)
					{
				
					flag0=false;
					break;
					}
				else
					flag0=true;
			}
			if(flag0)
			{
				index[2][0][count1++]=i;
				flag0=false;
			}
		}
		//记录row个数；
		index[0][0][0]=count1;
		index[0][1][0]=count0;
		return index;
		
	}
	public static int[][][] sameInDiagonals(int[][]matrix)
	{

		int [][][]index=new int[3][][];
		index[0]=new int[2][1];//放0，1的个数；
		index[1]=new int[1][matrix.length];//放全是1的row
		index[2]=new int[1][matrix.length];//放全是0的row
		boolean flag0=false;
		boolean flag1=false;
		int count1=0;
		int count0=0;
		for(int k=0;k<matrix.length;k++)
		{
			for(int i=2;i<matrix.length;i++)//检查1
		
		{
			for(int j=0;j<i&&(k+j)<matrix.length;j++)
			{
				if(matrix[j+k][j]!=1)
				{
					flag1=false;
					break;
				}
				else
				flag1=true;
			}
			if(flag1)
			{
				index[1][0][count1++]=i;
				flag1=false;
			}
			for(int j=0;j<i;j++)
			{
				if(matrix[j+k][j]!=0)
				{
					flag0=false;
					break;
				}
				else
				flag0=true;
			}
			if(flag0)
			{
				index[2][0][count0++]=i;
				flag0=false;
			}
		}
		}
	index[0][0][0]=count0;
	index[0][1][0]=count1;
	return index;
	}
	public static void show(int[][][]sameInRows,int[][][]sameInColumns,int[][][]sameInDiagonals)
	{if(sameInRows[0][0][0]!=0)
		{System.out.print("all 0s in rows ");
		for(int i=0;i<sameInRows[0][0][0];i++)
			System.out.print(sameInRows[2][1][i]);
		System.out.println();}
	if(sameInRows[0][1][0]!=0)
		{System.out.print("all 1s in rows ");
		for(int i=0;i<sameInRows[0][1][0];i++)
			System.out.print(sameInRows[1][1][i]);
		System.out.println();}
		if(sameInRows[0][1][0]==0&&sameInRows[0][0][0]==0)
			System.out.println("no numbers on a row.");
		if(sameInColumns[0][0][0]!=0)
		{System.out.print("all 0s in columns ");
		for(int i=0;i<sameInColumns[0][0][0];i++)
			System.out.print(sameInColumns[2][1][i]);
		System.out.println();}
		if(sameInColumns[0][1][0]!=0)
		{System.out.print("all 1s in columns ");
		for(int i=0;i<sameInColumns[0][1][0];i++)
			System.out.print(sameInColumns[1][1][i]);
		System.out.println();}
		if(sameInColumns[0][0][0]==0&&sameInColumns[0][1][0]==0)
			System.out.println("no same numbers in a columns.");
		if(sameInDiagonals[0][0][0]!=0)
		{System.out.print("all 0s in diagonals ");
		for(int i=0;i<sameInDiagonals[0][0][0];i++)
			System.out.print(sameInDiagonals[2][1][i]);
		System.out.println();}
		if(sameInDiagonals[0][1][0]!=0)
		{System.out.print("all 1s in diagonals ");
		for(int i=0;i<sameInDiagonals[0][1][0];i++)
			System.out.print(sameInDiagonals[1][1][i]);
		System.out.println();}
		if(sameInDiagonals[0][0][0]==0&&sameInDiagonals[0][1][0]==0)
			System.out.println("no same numbers in a diagonal.");
		
	}
}
