import java.util.*;
public class MergeList {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("input the first list.");
		System.out.println("the number of elements:");
		int number1=input.nextInt();
		int[]arr1=new int[number1];
		System.out.println("now enter the elements.");
		for(int i=0;i<number1;i++)
			arr1[i]=input.nextInt();
		Arrays.sort(arr1);
		System.out.println("input the second list.");
		System.out.println("the number of elements:");
		int number2=input.nextInt();
		int[]arr2=new int[number2];
		System.out.println("now enter the elements.");
		for(int i=0;i<number1;i++)
			arr1[i]=input.nextInt();
		Arrays.sort(arr2);
	int []newArr=merge(arr1,arr2);
	for(int x:newArr)
		System.out.print(x+" ");
	input.close();
	}
	public static int[] merge(int[]arr1,int[]arr2)
	{int index1=0,index2=0;
	int index=0;
		int []newArr=new int[arr1.length+arr2.length];
		int min=Math.min(arr1.length, arr2.length);
		
		for(;index1<min&&index2<min;)
		{
			if(arr1[index1]<arr2[index2])
				newArr[index++]=arr1[index1++];
			else
				newArr[index++]=arr2[index2++];
		}
		for(int i=index2;i<arr2.length;i++)
			newArr[index++]=arr2[index2];
		for(int i=index1;i<arr1.length;i++)
			newArr[index++]=arr1[index1];
		return newArr;
	}

}
