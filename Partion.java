import java.util.*;
public class Partion {

	public static void main(String[] args) 
	{
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number of the elements:");
		int number=input.nextInt();
		int[]list=new int[number];
		System.out.print("now enter the elements of the list:");
		for(int i=0;i<number;i++)
		{
			list[i]=input.nextInt();
		}
		System.out.print("the index of the first element is:"+findIndex(list));
		input.close();
	}
public static int findIndex(int[]arr)
{
	int value=arr[0];
	int i=0;
	int j=arr.length-1;
	int index=0;
	while(j>i)
	{
		if(arr[i]<value)
		{
			if(arr[j]>=value)//��ͷͬʱ���У������С����ͷ��
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
				i++;
				index=i;
				continue;
			}
			else
			{
				j--;
				continue;
			}
		}
		else
			if(arr[j]>=value)//�����һͷ��
		{
			i++;
		continue;	
		}
		else
		{
			j--;
			i++;
		}
	}
	arr[0]=arr[index];
	arr[index]=value;
	return index;
}
}
