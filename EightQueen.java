
public class EightQueen {

	public static void main(String[] args) 
	{
		// TODO �Զ����ɵķ������
		//ҡ�ţ�
		int [][]queen=new int[8][8];
		int pos=0;
		for(int i=0;i<8;)
		{
		   pos=(int)(Math.random()*100)%8;//pos,�����ԣ�ҡ�ţ�
		   int k=0;
		   boolean flag=true;
		   while(flag)
		   {   
			   while(pos==i)
			   {
				   pos=(int)(Math.random()*100)%8;
			   }
		   for(;k<i;k++)//ѭ������Ƿ��غϣ�
		   {
			   while(queen[k][pos]!=0)
		   {
			   pos=(int)(Math.random()*100)%8;	
			}
		   }
		   if(i!=pos)
		   {
			   queen[i][pos]=1;
			   break;
		   }
		   else
			   continue;
		   }
		   i++;
		}
		//���ͼ��
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(queen[i][j]==0)
					System.out.print("|");
				else
					System.out.print("Q");
			}
			System.out.println();
		}

	}

}
