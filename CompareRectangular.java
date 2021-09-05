import java.util.Scanner;
public class CompareRectangular {
public static void main(String[]args)
{
	System.out.println("enter the cordinates of the 1th point,width and the height:");
	Scanner input=new Scanner(System.in);
	double x1=input.nextDouble();
	double y1=input.nextDouble();
	double w1=input.nextDouble();
	double h1=input.nextDouble();
	System.out.println("enter the cordinates of the 2th point,width and the height:");
	double x2=input.nextDouble();
	double y2=input.nextDouble();
	double w2=input.nextDouble();
	double h2=input.nextDouble();
	if(w1>w2&&h1>h2)
	{
		if((Math.abs(x2-x1)<(w1/2))&&(Math.abs(y2-y1)<h1/2))
			System.out.print("r2 is in r1");
		else
			System.out.print("r2 overlaps r1");
			
	}
	else
		System.out.print("r2 overlaps r1");
	input.close();
}
}
