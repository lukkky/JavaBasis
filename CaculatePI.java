import java.util.Scanner;
public class CaculatePI {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		double sum=0;
		double temp=0;
		for(int i=1;i<=n;i++)
		{
			temp=2*i-1;
			sum+=Math.pow(-1, i+1)/temp;
		}
System.out.print("the pi is:"+4*sum); 
input.close();
	}

}
