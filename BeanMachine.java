import java.util.*;//输出槽的时候出现问题；我知道怎么解决了，进行数组填充；
public class BeanMachine {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of beans and slots:");
		int numberOfBeans=input.nextInt();
		int numberOfSlots=input.nextInt();
		int possiblity=0;//摇号用的；
		int countRight=0;//数朝右的有几个；
		int []slots=new int[numberOfSlots];
		String []path=new String[numberOfBeans];
		for(int i=0;i<numberOfBeans;i++)
			path[i]=" ";
		for(int i=0;i<numberOfBeans;i++)
		{
			for(int j=0;j<numberOfSlots;j++)
			{
				int temp=(int)(Math.random()*100);
				possiblity=temp%2;//摇号，确定路径
				if(possiblity==1)
					countRight++;
				switch(possiblity)
				{
				case 0:path[i]+="L";break;
				case 1:path[i]+="R";break;
				}
			}
			slots[countRight]++;
			countRight=0;
		}
		for(int i=0;i<numberOfBeans;i++)
		{ 
			System.out.println(path[i]);
		}
		int count=0;
		for(int i=0;i<numberOfSlots;)//输出槽示意图；
		{ 
			if(slots[i]==0)
				System.out.print(" ");
			else
				{System.out.print("0");
				count++;
				slots[i]--;
				if(count==numberOfBeans)
					break;
				}
			i++;
			if(i==numberOfSlots-1)
				{i=0;
				System.out.println();
				}
		}
		input.close();
	}

}
