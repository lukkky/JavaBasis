
public class TwinPrimeNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int number=5;
		while(number<1000)
		{
			if(PalindromeAndPrime.isPrime(number))
				if(PalindromeAndPrime.isPrime(number+2))
					System.out.println("( "+number+" , "+(number+2)+" )");
			number++;
		}
	}

}
