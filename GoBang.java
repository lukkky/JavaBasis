import java.util.*;
public class GoBang {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		//记录步数；
		int countr=0;
		int county=0;
		int row=0;
		int column=0;
		char [][]situation=new char[6][7];
		pattern(situation);
		while(county<22&&countr<22)
		{
	    System.out.println("enter the row(0-5)for player Red:");
	    row=input.nextInt();
	    System.out.println("enter the column(0-6)for player Red:");
		column=input.nextInt();
		situation[row][column]='R';
		countr++;
		System.out.println("enter the row(0-5)for player Yellow:");
		row=input.nextInt();
		System.out.println("enter the column(0-6)for player Yellow:");
		column=input.nextInt();
		situation[row][column]='Y';
		county++;
		if(countr>=3||county>=3)
		{
			if(check(situation)!=0)
			{
				if(check(situation)==1)
					{
					pattern(situation);
					System.out.println(" game over ! red win!!");
					break;
					}
				else
					if(check(situation)==-1)
					{   
						pattern(situation);
						System.out.println(" game over ! yellow win!!");
						break;
					}
			}
		}
		pattern(situation);
		}
		input.close();		
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
	public static int check(char [][]arr)//return 1 for x win,-1 for o win;
	{
		int row=rowCheck(arr);
		int column=columnCheck(arr);
		int diagonal=DiagonalsInOrderCheck(arr);
		int diagonalR=DiagonalsInReverseOrderCheck(arr);
		if(row==1||column==1||diagonal==1||diagonalR==1)
			return 1;
		else
			if(row==-1||column==-1||diagonal==-1||diagonalR==-1)
				return -1;
			else
				return 0;
		
	}
	public static int columnCheck(char[][]arr)//return 1 for x win,-1 for o win;
	{
		int countr=0;
		int county=0;
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j][i]=='R')
					countr++;
			if(arr[j][i]=='Y')
				county++;
			if(countr==4)
				return 1;
			if(county==4)
				return -1;	
			}
			countr=0;
			county=0;
		}
		
		return 0;		
	}
	public static int rowCheck(char[][]arr)//return 1 for R win,-1 for Y win;
	{
		int countr=0;
		int county=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]=='R')
					countr++;
			if(arr[i][j]=='Y')
				county++;
			if(countr==4)
				return 1;
			if(county==4)
				return -1;	
			}
			countr=0;
			county=0;
		}
				return 0;
    }
	public static int DiagonalsInOrderCheck(char[][]matrix)
	{
		int countr=0;
		int county=0;
		int m=6;
		for(int i=3;i<m;i++)	//控制矩阵大小
		{
			for(int k=0 ;k<=m-3;k++)//控制行移动
         	{    
			for(int d=0;d<=m-3;d++)//控制列移动
			{
				for(int j=0;j<=i&&(k+j+d)<m;j++)//检查一个R方阵
			{
				if(matrix[j+k+d][j+d]=='R')
				{
					countr++;
				}
				if(countr==4)
					return 1;
			}	
			countr=0;
			for(int j=0;j<=i&&(k+j+d)<m;j++)//检查一个Y方阵；
			{
				if(matrix[j+k+d][j+d]=='Y')
				{
					county++;
				}
				if(county==4)
					return -1;
			}			
			county=0;
		}
		}
		}
	return 0;
	}
	public static int DiagonalsInReverseOrderCheck(char[][]matrix)
	{
		int countr=0;
		int county=0;
		int m=6;
		int row=0;
		int column=0;
	    for(int i=6;i>=3;i--)//控制矩阵大小
		{
	    	for(int k=0;k<=m-3;k++)//控制行移动；
	    		for(int d=0;d<=m-3;d++)//控制列移动
		    {
			for(int j=0;j<m&&Math.abs(i-j+d)<m+1;j++)//检查一个R方阵；
			{
				column=Math.abs(i-j+d);
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
			for(int j=0;j<m&&(i-j+d)<m+1;j++)//检查一个Y方阵；
			{
				column=Math.abs(i-j+d);
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
}

	
