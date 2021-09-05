import java.util.*;
public class AntiPalindrome
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int numberOfAntiPrimeAndPalindrome=0;
	
		int number=2;
		while(numberOfAntiPrimeAndPalindrome<100)
		{
		if(antiPalindromeAndPrime(number))
			{
			numberOfAntiPrimeAndPalindrome++;
			if(numberOfAntiPrimeAndPalindrome%10==0)
				System.out.println(number+" ");
			else
				System.out.print(number+" ");
			}
		number++;
		}
		input.close();
	}
	public static boolean antiPalindromeAndPrime(int number)
	{
		boolean flag=Palindrome.isPalindrome(number);
		if(!flag)
			return PalindromeAndPrime.isPrime(number);
		else
			return false;
			
	}
}
	


