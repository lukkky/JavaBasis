import java.util.*;
public class UniqueNumber {
public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	int []uniqueArr=new int[10];
	for(int i=0;i<10;i++)
	{
		System.out.println("enter the "+(i+1)+" number:");
		int number=input.nextInt();
		if(uniqueArr[number]==0)
			uniqueArr[number]++;
	}
	for(int i=0;i<10;i++)
	{
		if(uniqueArr[i]!=0)
			System.out.print(i+" ");
	}
	input.close();
}
}
