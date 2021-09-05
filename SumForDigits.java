import java.util.Scanner;
public class SumForDigits 
{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the integer:");
		int value=input.nextInt();
		int n=value;
		int digit=0;
		int sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum+=digit;
			n=n/10;
		}
		System.out.print("the sum of the digits of the value is"+sum);
		input.close();
	}

}
