import java.util.*;
public class TicTacToe 
{
public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	//记录步数；
	int countx=0;
	int counto=0;
	int row=0;
	int column=0;
	char [][]situation=new char[3][3];
	pattern(situation);//打印格子；
	while(countx<5&&counto<5)
	{ 
		System.out.println("enter the row(0,1,2)for player x:");
		row=input.nextInt();
		column=input.nextInt();
		situation[row][column]='x';
		countx++;
		System.out.println("enter the row(0,1,2)for player o:");
		row=input.nextInt();
		column=input.nextInt();
		situation[row][column]='o';
		counto++;
		if(countx>=3||counto>=3)
		{
			if(check(situation)!=0)
			{
				if(check(situation)==1)
					{
					pattern(situation);
					System.out.println(" game over ! x win!!");
					break;
					}
				else
					if(check(situation)==-1)
					{   
						pattern(situation);
						System.out.println(" game over ! x win!!");
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
	System.out.println("-----------------");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("|");
			if(arr[i][j]=='x'||arr[i][j]=='o')
			{ 
				String temp=arr[i][j]+"";
				System.out.printf("%4s",temp);
			}
			else
				System.out.printf("%4s","");
		}
		System.out.print("|");
		System.out.println();
		System.out.println("-----------------");
	}
	
}
public static int check(char [][]arr)//return 1 for x win,-1 for o win;
{
	int row=rowCheck(arr);
	int column=columnCheck(arr);
	int diagonal=diagonalCheck(arr);
	if(row==1||column==1||diagonal==1)
		return 1;
	else
		if(row==-1||column==-1||diagonal==-1)
			return -1;
		else
			return 0;
	
}
public static int columnCheck(char[][]arr)//return 1 for x win,-1 for o win;
{
	int countx=0;
	int counto=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(arr[j][i]=='x')
				countx++;
		if(arr[j][i]=='o')
			counto++;
		if(countx==3)
			return 1;
		if(counto==3)
			return -1;	
		}
		countx=0;
		counto=0;
	}
	
	return 0;
	
}
public static int rowCheck(char[][]arr)//return 1 for x win,-1 for o win;
{int countx=0;
int counto=0;
for(int i=0;i<arr[0].length;i++)
{
	for(int j=0;j<3;j++)
{
	if(arr[i][j]=='x')
		countx++;
if(arr[i][j]=='o')
	counto++;
if(countx==3)
	return 1;
if(counto==3)
	return -1;
}	
	countx=0;
	counto=0;
}
return 0;
}
public static int diagonalCheck(char[][]arr)//return 1 for x win,-1 for o win;
{
    int countx=0;
	int counto=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i][i]=='x')
			countx++;
		if(arr[i][i]=='o')
			counto++;
	}
	if(countx==3)
		return 1;
	if(counto==3)
		return -1;
	else
		return 0;
}
}
