import java.util.*;
public class PalindromeAndPrime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		/*System.out.print("enter the number:");
		// TODO 自动生成的方法存根
		int number=input.nextInt();
		System.out.print("the number "+(palindromeAndPrime(number)?"is":"is not")
			+" prime palindrome.");
		input.close();*/
		int numberOfPrimeAndPalindrome=0;
	
		int number=2;
		while(numberOfPrimeAndPalindrome<100)
		{
		if(palindromeAndPrime(number))
			{
			numberOfPrimeAndPalindrome++;
			if(numberOfPrimeAndPalindrome%10==0)
				System.out.println(number+" ");
			else
				System.out.print(number+" ");
			}
		number++;
		}
		input.close();
	}
	public static boolean palindromeAndPrime(int number)
	{
		boolean flag=Palindrome.isPalindrome(number);
		if(flag)
			return isPrime(number);
		else
			return false;
			
	}
	public static boolean isPrime(int number)
	{
		for(int i=2;i<=(int)Math.pow(number,0.5);i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	}

}
