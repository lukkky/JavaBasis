import java.util.*;
public class ValidPassWord {
public static void main(String[]args)
{
	Scanner input =new Scanner(System.in);
	System.out.print("enter the password:");
	String passWord=input.nextLine();
	int numberOfDigit=0;
	char ch=' ';
	if(passWord.length()<8)
	{
		System.out.print("invalid password.the length of the password has to be"
				+"more than 8.");
		return;
	}
	for(int i=0;i<passWord.length();i++)
	{
		ch=passWord.charAt(i);
		if(!Character.isLetterOrDigit(ch))
			{
			System.out.print("invalid password."
					+ ",contains character expect for number and alpha.");
			return;
			}
		else
			if(Character.isDigit(ch))
				numberOfDigit++;
				
		
	}
	if(numberOfDigit<2)
	{
		System.out.print("invalid password."
				+ ",the number of digits less than 2.");
		return;	
	}
	else
	{
		System.out.print("valid password.");
	}
}
}
