
public class FutureTuition {

	public static void main(String[] args) {
	double tuition=10000;	
	for(int i=0;i<10;i++)
	{
		tuition*=(1+0.05);
	}
	System.out.println("the tuition after 10 yeras will be "+tuition);
int i=0;
double sum=0;
while(i<4)
{
	sum+=tuition;
	tuition*=(1+0.05);
	i++;
}
System.out.println("the sum of 4 years tuition is:"+sum);
	}
}
