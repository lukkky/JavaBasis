import java.util.*;
public class FindLargestBlock 
{
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("enter the rank of the matrix:");
		int rank=input.nextInt();
		int [][]matrix=new int[rank][rank];
		System.out.print("enter the element(0/1)in the matrix:");
		for(int i=0;i<rank;i++)
			for(int j=0;j<rank;j++)
			{
				matrix[i][j]=input.nextInt();
			}
		show(matrix);
		int[]result=findLargestBlock(matrix);
		if(result[2]!=0)
			System.out.print("the coordinate of the first element in lagrgest"
					+" is "+"("+result[0]+","+result[1]+"),the rank is "+(result[2]+1));
		input.close();
	}
	public static void show(int[][]matrix)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
	    }
	}
	public static int[] findLargestBlock(int[][]matrix)
	{
		int[]result=new int[3];
		int flag=0;//当不等于1时为0，是1的时候是1;
		int m=matrix.length;
		int column=0;
		int row=0;
		int rowTemp=0;
		int columnTemp=0;
		int c=0,e=0;
		int count=0;//记录对应子矩阵的元素的个数；
		for(int i=1;i<m;i++)//控制方阵大小
		{//i大小子方阵的寻找
			for(int k=0;k<m-1;k++)//控制行移动
			{
				for(int d=0;d<m-1;d++)//控制列移动；
				{ 
					//一个子方阵的比较
				    for(c=0,row=c+k;c<=i&&(c+k)<m;c++)//控制行坐标移动,row记录开始的行坐标
					{
				    	//一列的比较
						for(e=0,column=e+d;e<=i&&(e+d)<m;e++ )//控制列坐标移动，column记录
							//开始的列坐标；
						{
							rowTemp=c+k;
							columnTemp=d+e;
							if(matrix[rowTemp][columnTemp]!=1)
							{
								flag=0;
								break;//跳出列坐标循环
							}
							else
								{
								flag=1;
								count++;
								}
						}
						if(flag==0)
						break;//如果列里面出现了一个元素不等于1，跳出当前子方阵；
					}
				    int iTemp=(i+1)*(i+1);
				    if(flag==1&&count==iTemp)//如果找到一个子方阵符合条件，跳出当前列移动控制的子方阵的循环；
				    	//顺便记录下现在子阵头元素的坐标和对应子阵的大小；
					{
						result[0]=row;
						result[1]=column;
						result[2]=i;
						count=0;//count置零
						break;
					}
				}
				 if(flag==1)//i大小的方阵里面找到了一个，跳出当前行移动；
				    	{
					       break;
				    	}
			}
			//进入下一个大小矩阵的寻找；
		}
	return result;
	}

}
