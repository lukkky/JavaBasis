import java.util.Scanner;
public class AverageAndStandardVariance {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter 10 number want to get average and standardvariance form:");
		double sumOfNumber=0;
		double  sumOfNumberSqure=0;
		double  number=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("enter the "+(i+1)+"number:");
			number=input.nextDouble();
			sumOfNumber+=number;
			sumOfNumberSqure+=Math.pow(number, 2);
		}
		System.out.println("the average is:"+sumOfNumber/10+"\n the standardvariance is:");
		double temp=Math.pow((sumOfNumberSqure-(Math.pow(sumOfNumberSqure,0.5)/10)/9),0.5);
		System.out.println(temp);
		input.close();
	}
}
