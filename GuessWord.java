import java.util.*;
public class GuessWord {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		String [] words= {"love","and","peace","for","forever"};
		System.out.println("now the game start.");
		int []posArr=new int[5];
		for(int i=0;i<5;i++)//��¼ÿ�ε����ֵ��
		posArr[i]=6;
		char answer=' ';
		String answerString=" ";
		int correct=0;
		char goOn='y';
		String goOnString=" ";
		int j=0;
		while(goOn=='y')//��ʼ��ҡ��Ҫ�����ĵ���
		{System.out.print("(Guess) enter a letter in word ");
			int pos=(int)(Math.random()*100)%5;//ҡ��
			//����Ƿ���֮ǰ��posֵ�ظ���
			int n=0;
			while(pos==posArr[n++]&&n<5)
			{
					pos=(int)(Math.random()*100)%5;
			}
			for(int i=0;i<words[pos].length();i++)//�������
			{
				if(i==0)
					System.out.print(words[pos].charAt(0));
				else
					System.out.print("*");
			}
			System.out.println();
			int[]index=new int[words[pos].length()];
			while(j<(words[pos].length()-1))
			{
				System.out.println("enter the letter:");
		answerString=input.next();//��ȡ������ĸ
		answer=answerString.charAt(0);
		boolean flag=false;//�ж϶�Ӧλ��Ԫ���Ƿ���ȷ�����ģ�
		System.out.println("now the words  is:");
		for(int k=1;k<words[pos].length();k++)//��¼��ȷ�Ĵ��±꣬���������е��������
		{
			if(answer==words[pos].charAt(k))
				{
				index[correct]=k;
				correct++;
				}
		}
		for(int k=0;k<words[pos].length();k++)//����д�֮��ͼ����
		{
			for(int m=0;m<index.length;m++)
			{
				if(k==index[m])
					{System.out.print(words[pos].charAt(k));
					flag=true;//�ڼ�¼λ�õ����������ҵ��˶�Ӧ���±ꣻ
					break;
					}
			}
			if(!flag)
				System.out.print("*");
			flag=false;
		}
		System.out.println();
		if(correct==words[pos].length()-1)
		{
			System.out.println("you've guessed out the whole word!congraculation!");
			break;
		}
		j++;
		}
			if(correct!=words[pos].length())
				{System.out.println("you do not guess the whole word\n"
			+"the corrcet answer is:"+words[pos]);
				}
			System.out.println("guess another word? enter y for yes,n for no");
			goOnString=input.next();
			goOn=goOnString.charAt(0);
			correct=0;
		}
		input.close();
	}

}
