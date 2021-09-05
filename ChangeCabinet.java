
public class ChangeCabinet {

	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
    boolean []cabinet=new boolean[100];
    for(int i=0;i<100;i++)
    	cabinet[i]=true;
    for(int i=0;i<100;i+=2)
    	cabinet[i]=false;
    int count=3;
    while(count<=100)
    {
    	for(int i=count;i<100;i+=count)
    		cabinet[i]=false;
    	count++;
	}
    for(int i=0;i<100;i++)
    	if(cabinet[i])
    		System.out.print(i+" ");
	}

}
