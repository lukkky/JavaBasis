import java.util.*;
public class FindLargestBlock 
{
	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
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
		int flag=0;//��������1ʱΪ0����1��ʱ����1;
		int m=matrix.length;
		int column=0;
		int row=0;
		int rowTemp=0;
		int columnTemp=0;
		int c=0,e=0;
		int count=0;//��¼��Ӧ�Ӿ����Ԫ�صĸ�����
		for(int i=1;i<m;i++)//���Ʒ����С
		{//i��С�ӷ����Ѱ��
			for(int k=0;k<m-1;k++)//�������ƶ�
			{
				for(int d=0;d<m-1;d++)//�������ƶ���
				{ 
					//һ���ӷ���ıȽ�
				    for(c=0,row=c+k;c<=i&&(c+k)<m;c++)//�����������ƶ�,row��¼��ʼ��������
					{
				    	//һ�еıȽ�
						for(e=0,column=e+d;e<=i&&(e+d)<m;e++ )//�����������ƶ���column��¼
							//��ʼ�������ꣻ
						{
							rowTemp=c+k;
							columnTemp=d+e;
							if(matrix[rowTemp][columnTemp]!=1)
							{
								flag=0;
								break;//����������ѭ��
							}
							else
								{
								flag=1;
								count++;
								}
						}
						if(flag==0)
						break;//��������������һ��Ԫ�ز�����1��������ǰ�ӷ���
					}
				    int iTemp=(i+1)*(i+1);
				    if(flag==1&&count==iTemp)//����ҵ�һ���ӷ������������������ǰ���ƶ����Ƶ��ӷ����ѭ����
				    	//˳���¼����������ͷԪ�ص�����Ͷ�Ӧ����Ĵ�С��
					{
						result[0]=row;
						result[1]=column;
						result[2]=i;
						count=0;//count����
						break;
					}
				}
				 if(flag==1)//i��С�ķ��������ҵ���һ����������ǰ���ƶ���
				    	{
					       break;
				    	}
			}
			//������һ����С�����Ѱ�ң�
		}
	return result;
	}

}
