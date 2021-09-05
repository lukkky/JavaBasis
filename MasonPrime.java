
public class MasonPrime {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
int number=2;
int p=0;
int count=0;
while(p<=31)
{
	if(PalindromeAndPrime.isPrime(number))
	{
		p=ableBeDivided(number);
		if(p>0&&p<=31)
		{count++;
		if(count%10==0)
			System.out.println(number+" ");
		else
			System.out.print(number+" ");
		}
	}
	number++;
}
	}
public static int ableBeDivided(int number)
{int count=0;
if (number%2==0)
	return -1;
else
	{number--;
	while(number!=0)
	{
		number/=2;
		count++;
		if(number==1)
			return count;
		if(number%2!=0)
			return -1;
	}
	}
return count;
}
}
