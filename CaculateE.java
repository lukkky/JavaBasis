import java.util.Scanner;
public class CaculateE {
	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	double item=1;
	double sum=1;
	for(int i=1;i<=n;i++)
	{
		item=item/i;
		sum+=item;
	}
	System.out.print("the e is:"+sum); 
	input.close();
	}
}
