import java.util.*;
public class CoinFrontAndBack {

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number you want to display(0~511):");
		int number=input.nextInt();
		int copy=number;
		int[]coins=new int[9];
		int i=0;
		while(copy!=0&&i<9)
		{
			coins[i++]=copy%2;
			copy/=2;
		}
		for( i=0;i<9;i++)
		{
			System.out.print(coins[i]+" ");
			if(i%3==2)
				System.out.println();
		}
		input.close();
	}

}
