import java.util.*;
public class BabylonSqrt {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input =new Scanner(System.in);
		System.out.print("enter the value:");
		int value=input.nextInt();
	double nextGuess=1;
	double lastGuess=0;
	while(Math.abs(lastGuess-nextGuess)>1e-4)
	{	lastGuess=nextGuess;
		nextGuess=(lastGuess+value/lastGuess)/2;
	}
	System.out.print("the sqrt of n is:"+nextGuess);
	input.close();
	}

}
