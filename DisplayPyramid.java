import java.util.Scanner;
public class DisplayPyramid {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter the value:");
		int n=input.nextInt();
for(int i=1;i<=n;i++)
{
	for(int k=0;k<n-i;k++)//空格
	{
		System.out.print(" ");
	}
	for(int j=i;j>0;j--)//输出前半部分数据
	{
		System.out.print(j+" ");
    }
	for(int p=2;p<=i;p++) 
	{
		System.out.print(p+" ");
	}
	for(int k=0;k<n-i-1;k++)
	{
		System.out.print(" ");
	}
	System.out.println("");
	}
input.close();
}

}
