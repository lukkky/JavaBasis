
public class CompleteNumber {
	public static void main(String[]args)
	{
		int sum=0;
		String cofactor=" ";
		for(int i=6;i<10000;i++)
		{
			sum=i;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum-=j;
					cofactor=cofactor+j+" ";
					if(sum==0)
					{
						System.out.println("complete  number :"+cofactor);
						break;
					}
				}
			}
			
		}
	}

}
