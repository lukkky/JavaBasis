import java.util.*;
public class CalenndarDiy {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enther the day of the 1th.mon and the year:");
		int firstOfFeb=input.nextInt();
		int year=input.nextInt();//����һ��һ�ŵ���������//д���˰��٣���Ҫ��ö����
		//�������̵���ûѧ��
		int[]month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[]monthName= {" ","january","february","march","april","may","june","july","august","september","october","novenber","decenber"};
		boolean flag=false;//�Ƿ�������ı�־��
		if(year%4==0&&year%100!=0||year%400==0)
		flag=true;
		int days=0;//�ۼ������������Ӧ��mod;
		int mod=1;
		//Ȼ��ʼÿ���·ݶ����һ�飬��Ϊ�����ǿ�ʼ�������ˣ�
	for(int i=1;i<=12;i++)
	{
		System.out.println("\t\t\t"+monthName[i]+year+"\t\t\t");
		System.out.println("Sunday"+"\t"+"Monday"+"\t"+"Tuesday"+"\t"+"Wensday"+"\t"+"Thursday"+"\t"+"Friday"+"\t"+"Saturday");
	for(int k=1;k<i-1;k++)
	{
		days+=month[k];//
	}
		if(i==2&&flag)
			days++;
		int j=0;
		mod=(j+days)%7+firstOfFeb;
		switch(mod)//��������ȷ����Ӧ���ڼ���˳���ӡһ�£�����ǵ�һ���Ӧ����
		{
		case 0:
			System.out.print((j+1)+"\t");
			break;
		case 1:
			System.out.print("\t"+(j+1)+"\t");
			break;
		case 2:
			System.out.print("\t\t"+(j+1)+"\t");
			break;
		case 3:
			
			System.out.print("\t\t\t"+(j+1)+"\t");
			break;
		case 4:
			System.out.print("\t\t\t\t"+(j+1)+"\t");
			break;
		case 5:
			System.out.print("\t\t\t\t\t"+(j+1)+"\t");
			break;
		case 6:
			System.out.println("\t\t\t\t\t\t"+(j+1)+"\t");
			break;
		}
			for( j=1;j<month[i];j++)
			{
		       mod=(j+days+2)%7;
				switch(mod)//��������ȷ����Ӧ���ڼ���˳���ӡһ�£�
				{
				case 0:
					System.out.print((j+1)+"\t");
					break;
				case 1:
					System.out.print((j+1)+"\t");
					break;
				case 2:
					System.out.print((j+1)+"\t");
					break;
				case 3:
					System.out.print((j+1)+"\t");
					break;
				case 4:
					System.out.print((j+1)+"\t\t");
					break;
				case 5:
					System.out.print((j+1)+"\t");
					break;
				case 6:
					System.out.println((j+1)+"\t");
					break;
				}
			
		}
			System.out.println("");
	}
	
	}

}
