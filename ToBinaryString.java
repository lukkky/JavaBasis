import java.util.Scanner;
public class ToBinaryString {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the nuber you want to transform:");
		int number=input.nextInt();
		String binaryString=" ";
		int digit=0;
		while(number!=0)
		{
			digit=number%2;
			binaryString+=digit+" ";
			number/=2;
		}
		System.out.print("the binary string is:"+binaryString);
		input.close();
	}

}
