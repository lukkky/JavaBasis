import java.util.*;
public class ClosestDotPair {

	public static void main(String[] args) //计算处最小距离，然后找两次；
	{
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of points:");
		int number=input.nextInt();
		int [][]points=new int[number][2];
		System.out.println("enter the points:");
		for(int i=0;i<number;i++)
		{
			points[i][0]=input.nextInt();
			points[i][1]=input.nextInt();
		}
		double shortDistance=shortestDistance(points);
		int[][][] pairs=shortestDotPair(points,shortDistance);
		System.out.println("the shortest distance of 2 points is:"+shortDistance);
		System.out.println("there"+((pairs.length>0)?"are":"is")+"points"
				+" bellow:");
		for(int i=0;i<pairs[0][0][0];i++)
		{
			System.out.println("("+pairs[1][i][0]+","+pairs[1][i][1]+")");
		}
		input.close();
	}
	public static double shortestDistance(int[][]points)
	{
		double shortDis=distance(points[0],points[1]);
		for(int i=0;i<points.length;i++)
		{
			for(int j=1;j!=i&&j<points.length;j++)
				if(shortDis>distance(points[i],points[j]))
				{
					shortDis=distance(points[i],points[j]);
				}
		}
		return shortDis;
	}
	public static double distance(int[]point1,int[]point2)
	{
		double temp1=Math.pow(point1[0]-point2[0], 2);
		double temp2=Math.pow(point1[1]-point2[1], 2);
		return Math.pow(temp1+temp2,0.5 );
	}
	public static int[][][] shortestDotPair(int[][]points,double shortDis)//可以
	//搞个三维数组；
	{
		int [][][]dotPairs=new int[2][][];
		dotPairs[0]=new int[1][1];
		dotPairs[1]=new int[points.length][2];
		int count=0;
		for(int i=0;i<points.length;i++)
			for(int j=0;j<i;j++)
				if(shortDis==distance(points[i],points[j]))
				{
					dotPairs[1][count][0]=i;
					dotPairs[1][count][1]=j;
					count++;
				}
		dotPairs[0][0][0]=count;//返回个数；
		return dotPairs;
	}

}
