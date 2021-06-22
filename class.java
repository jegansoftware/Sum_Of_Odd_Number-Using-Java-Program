//File name must be named as "SumofOddNumber.java".
package Mark;
import java.util.Scanner;

public class SumofOddNumber {
	
	private int i;
	private int j;
	private int sum=0;
	
	private int Number;
	
	public int geti()
	{
		return i;
	}
	
	public int getj()
	{
		return j;
	}
	
	public int getsum()
	{
		return sum;
	}
	
	public int Number()
	{
		return Number;
	}

	
	public void read()
	{
		System.out.printf("\nEnter Number");
		Scanner odd=new Scanner(System.in);
		Number=odd.nextInt();
		odd=null;
	}
	
	public void calculate()
	{
		for(i=1,j=1;i<=Number;j+=2,i++)
		{
			sum+=j;
		}
	}
	
	public void  display()
	{
		System.out.printf("Total :%d",sum);
	}
	
}
