
public class DoubleDicce {
	public static void main(String[]args)
	{ 
	int temp=0;
	int correctCount=0;
	System.out.print("now the game start.");
	int count=0;
	int i=0;
	while(i<10000)
	{
		while(count<2)
	{
	int number1=castDice();
	int number2=castDice();
	count++;
	System.out.println("you rolled "+number1+" "+number2);
	if(count==2)//���� temp��һ���Ƕ���Ͷ���Ӽ�飻
	{
		if(temp==(number1+number2))
	
		{
		System.out.print("you win!!");
		correctCount++;
		break;
		};
	}
	else//��һ�ε����
	{if((number1+number2)==2||(number1+number2)==3||(number1+number2)==12)
	{System.out.print("you lose .");
	break;
	}
	else
		if((number1+number2)==7||(number1+number2)==11)
			{
			System.out.print("you win!!");
			correctCount++;
			}
		else
		{
		temp=number1+number2;
		continue;
		}
	}
	}
		i++;
	}
	
	}
	public static int castDice()//Ͷ���ӣ�
	{
		int number=1+(int)Math.random()*6;
		return number;
	}
	
	}
	

