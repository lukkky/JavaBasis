import java.util.Scanner;
public class Interest 
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the save and the interest rate:");
		double interestRate=input.nextDouble();
		double sum=0;
		for(int i=0;i<6;i++)
		{
			sum=(100+sum)*(1+interestRate/100.0);
		}
		System.out.print("the total momey after 6 months is:"+sum);
		input.close();
	}
}
