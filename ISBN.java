import java.util.*;
public class ISBN {
public static void main(String []args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the first 9 digits of an ISBN as integer:");
	int integer0=input.nextInt();
	int integer=integer0;
	int sum=0;
	int digit=0;
	int i=1;
	int cunt=0;
	while(integer!=0)
	{
		digit=integer%10;
		sum+=digit*i;
		integer=integer/10;
		i++;
		cunt++;
	}
	if(cunt==8)
	{if(sum==10)
		System.out.println("the ISBN is 0"+integer0+"X");
	else
		{System.out.print("the ISBN is 0"+integer0);
		System.out.print(sum%11);
		}
	}
	else
	{	if(sum==10)
			System.out.println("the ISBN is 0"+integer0+"X");
		else
			{System.out.print("the ISBN is 0"+integer0);
			System.out.print(sum%11);
			}
	}
	
	input.close();
}
}
