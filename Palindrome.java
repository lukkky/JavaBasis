import java.util.*;//
public class Palindrome {
	public static int reverse(int number)
	{
		String originString=Integer.toString(number);
		String reverseString=" ";
		for(int i=originString.length()-1;i>=0;i--)
		{
			reverseString+=originString.charAt(i);
		}
		reverseString=reverseString.trim();
		int reverseNumber= Integer.parseInt(reverseString);
		return reverseNumber;
	}
	public static boolean isPalindrome(int number)
	{
		int  temp=reverse(number);
		return temp==number;
	}
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number :");
		int number=input.nextInt();
		System.out.print("the number "+(isPalindrome(number)?" is ":"is not")
				+ "palindrome");
		input.close();
	}

}
