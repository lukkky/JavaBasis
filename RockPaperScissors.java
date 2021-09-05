import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner input=new Scanner(System.in);
int numberPerson=0;
int numberComputer=0;
int correctPerson=0;
int correctComputer=0;
System.out.println("now the game start,enter the number ,rock for 0,paper for 1,scissor for2");
while(correctPerson<2&correctComputer<2)
{
numberPerson=input.nextInt();
numberComputer=(int)Math.random()*4;
if(numberPerson>numberComputer)
{
	correctPerson++;
}
else
	if(numberPerson<numberComputer)
		correctComputer++;
}
if(correctPerson>=2)
	System.out.print("you win!!");
else
	System.out.print("you fail,sad!");
input.close();
	}

}
