import java.util.*;//����ó�
public class CheckCardNumber {
public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	long number=input.nextLong();
	isVaild(number);
	input.close();
}
public static void isVaild(long number)
{
	String longString=""+number;
	int temp1=getSumOfOdd(longString);
	int temp2= getSumOfDoubleNumber(longString);
	if((temp1+temp2)%10==0)System.out.print("valid card number.");
	else
	System.out.print("invalid card number.");
			
}
public static int getSumOfOdd(String number)//��������λ�ĺ�
{
	int temp1=0;
	for(int i=0;i<number.length();i+=2)
	{
		temp1+=(int)(number.charAt(i)-'0');
	}
	return temp1;
}
public static int getSumOfDoubleNumber(String number)//����ÿλ��double
{
	number=number.trim();
	char charTemp=' ';
	int intTemp=0;
	int tempSum=0;
	for(int i=0;i<number.length();i++)
	{
		charTemp=number.charAt(i);
		intTemp=(int)(charTemp-'0');
		intTemp*=intTemp;
		if(intTemp>=10)
		{
		int temp1=intTemp%10;
		intTemp/=10;
		tempSum+=(temp1+intTemp);
		}
		else
			tempSum+=intTemp;
	}
	return tempSum;
}
}

