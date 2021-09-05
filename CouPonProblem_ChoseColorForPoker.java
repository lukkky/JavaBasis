
public class CouPonProblem_ChoseColorForPoker 
{
	public static boolean isDifferent(int[]arr,int value,int count)
	{
		for(int i=0;i<count;i++)
		if(arr[i]==value)
			return false;
		return true;
	}
	public static void main(String[]args)
	{
		int []deck=new int[52];
		for(int i=0;i<52;i++)
		deck[i]=i;
		String[]suits= {"Spades","Hearts","Diamonds","Clubs"};
		String[]ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen"
				,"King"};
		int []intSuits=new int[4];
		int[]intRanks=new int[4];
		for(int i=0;i<deck.length;i++)
		{
			int index=(int)(Math.random()*deck.length);
			int temp=deck[i];
			deck[i]=deck[index];
			deck[index]=temp;
		int count=0;
		int index0=0;//for suits;
		int index1=0;//for ranks;
		while(count<4)
		{
		index0=(int)(Math.random()*100)%4;
		index1=(int)(Math.random()*100)%4;
		if(isDifferent(intSuits,index0,count))
		{
			intSuits[count]=index0;
			intRanks[count]=index1;
			count++;
		}
		
		}
		
	}
		System.out.println("we get 4 cards bellow.");
		for(int i=0;i<4;i++)
		{
			System.out.println(ranks[intRanks[i]]+" of "+suits[intSuits[i]]);
			
		}
	}

}
