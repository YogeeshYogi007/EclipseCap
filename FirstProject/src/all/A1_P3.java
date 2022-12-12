package all;
import java.util.Scanner;

public class A1_P3 {

	public static void main(String[] args)
	{
		System.out.println("Enter the principle: ");
		Scanner sc= new Scanner (System.in);
		double Principle=sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter the Total Time in Years: ");
		double Time=sc.nextDouble();
		
		double SI=(Principle*rate*Time)/100;
		System.out.println("The Simple Interest is : "+SI);
		
		double CI= Principle*(Math.pow((1+rate/100), Time ))-Principle;
		System.out.println("The Compound Interest is : "+CI);
				
	}

}
