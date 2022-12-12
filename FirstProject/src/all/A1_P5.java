package all;
import java.util.Scanner;

public class A1_P5 {

	public static void main(String[] args) 
	{
		System.out.print("Enter your salary: ");
		Scanner sc= new Scanner(System.in);
		double i=sc.nextInt();
		if(  i<=180000)
		{
			System.out.println("Tax Payable in Percentage is Nill");
		}
		else if( i<=300000)
		{
			double d1=(i-180000)*(0.1);
			 System.out.println("The Total Tax Payable is "+d1);
		}
		else if(i<=500000)
		{
			double d2=(i-300000)*(0.2);
			 System.out.println("The Total Tax Payable is "+d2);
		}
		else if(i<=1000000)
		{
			double d3=(i-500000)*(0.3);
			 System.out.println("The Total Tax Payable is "+d3);
		}
		else if (i>=1000000)
		{
			System.out.println("Amount exceed limited rage");
		}
		
	}

}
