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
		banks[i][2]=new double[banks.length][1];//����Ƿ�������кź���Ƿ�
	}
	//Ҫ���кŶ�Ӧ��Ƿ����г�ʼ��ʲô�Ľ��г�ʼ����֮��Ҫ�ԣ�=0��Ϊ�ж�������
	for(int i=0;i<banks.length;i++)//��ʼ���룻
	{
		for(int j=0;j<banks[i].length;j++)
		{
			if(j==0)
				{
				System.out.println("enter the balance of the "+i+" bank.");
				banks[i][0][0][0]=input.nextDouble();//������
				}
			else
				if(j==1)
			{
				System.out.println("the number of banks "+i+" bank borrowed money to:");
				banks[i][1][0][0]=input.nextDouble();//����Ƿծ�����и�����
			}
			else
			{
				if(banks[i][1][0][0]!=0)//��Ƿծ����,�����Ӧ�����к�Ƿ�
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
           	 { index[i]=1;//ռ�ӣ�1��ʾռ�ӣ���Ҫ��֮ǰռ���Ͳ�����
           	 check(banks,i,limit,index);
           	 }
            }
			sum=0;
		}
	}
	public static int[]check(double[][][][]banks,int id,double limit,int[]index)
	{
		for(int i=0;i<banks.length;i++)//Ĩ��id���н�
			if(banks[i][2][id][0]!=0)
				{
				banks[i][2][id][0]=0;
				}
		check1(banks,limit,index);//�����жϣ�
		return index;
	}

}
