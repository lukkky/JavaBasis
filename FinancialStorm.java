import java.util.*;
public class FinancialStorm {
	public static void main(String[]args)
	{
		System.out.println("enter number of the banks:");
		Scanner input=new Scanner(System.in);
		int bankNum=input.nextInt();
		System.out.println("enter the limit property of a bank:");
		double limit=input.nextInt();
		double[][][][]banks=new double[bankNum][3][][];
		input(banks);
		int[]finalIndex=new int[banks.length];
		check1(banks,limit,finalIndex);
	    int count=0;
	    for(int i=0;i<finalIndex.length;i++)
	    	if(finalIndex[i]!=0)
	    		count++;
	    if(count>=1)
	    {
	    	System.out.print("unsafe banks ");
	    	if(count>1)
	    	System.out.print("are ");
	    if(count==1)
	    	System.out.print("is");
	    for(int i=0;i<finalIndex.length;i++)
	    {
	    	if(finalIndex[i]!=0)
	    		System.out.print(i+" ");    		
	    }
	    }
	    else
	    	System.out.print("there is no unsafe bank.");   
	    input.close();
	}
	public static void input(double[][][][]banks)
	{
		Scanner input=new Scanner(System.in);
	for(int i=0;i<banks.length;i++)
	{
		banks[i][0]=new double[1][1];
		banks[i][1]=new double[1][1];
		banks[i][2]=new double[banks.length][1];//放置欠款银行行号和其欠款；
	}
	//要把行号对应的欠款进行初始化什么的进行初始化，之后要以！=0作为判断条件；
	for(int i=0;i<banks.length;i++)//开始输入；
	{
		for(int j=0;j<banks[i].length;j++)
		{
			if(j==0)
				{
				System.out.println("enter the balance of the "+i+" bank.");
				banks[i][0][0][0]=input.nextDouble();//输入余额；
				}
			else
				if(j==1)
			{
				System.out.println("the number of banks "+i+" bank borrowed money to:");
				banks[i][1][0][0]=input.nextDouble();//输入欠债的银行个数；
			}
			else
			{
				if(banks[i][1][0][0]!=0)//有欠债银行,输入对应的银行和欠款；
			{ 
				for(int k=0;k<banks[i][1][0][0];k++)
				{
					System.out.println("enter the id of the bank");
      				int id=input.nextInt();
      				System.out.println("enter the money it bought.");
				    banks[i][2][id][0]=input.nextDouble();
				}
			}
			else
			{
				System.out.println("there is not any banks in debt;");
			}
			}
		}
	}
	input.close();
	}
	public static void check1(double[][][][]banks,double limit,int []index)
	{
		double sum=0;
		double balance=0;
		for(int i=0;i<banks.length;i++)
		{
			for(int j=0;j<banks[i][2].length;j++)
			{
				sum+=banks[i][2][j][0];		
			}
			balance=banks[i][0][0][0];
			if((sum+balance)<limit)
            {
           	 if(index[i]==0)
           	 { index[i]=1;//占坑（1表示占坑），要是之前占过就不动；
           	 check(banks,i,limit,index);
           	 }
            }
			sum=0;
		}
	}
	public static int[]check(double[][][][]banks,int id,double limit,int[]index)
	{
		for(int i=0;i<banks.length;i++)//抹除id银行借款；
			if(banks[i][2][id][0]!=0)
				{
				banks[i][2][id][0]=0;
				}
		check1(banks,limit,index);//重新判断；
		return index;
	}

}
