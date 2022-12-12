package all;
import java.util.Scanner;
public class A1_P1 {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int i=sc.nextInt();
		int num1= i/100;
		int num2=(i%100)/10;
		int num3=i%10;
		int num4=num1*num1*num1 + num2*num2*num2 + num3*num3*num3;
		if(i==num4)
		{
			System.out.println("The number you Entered is an ArmStrong Number");
		}
		else 
		{
			System.out.println("The number you Entered is not an ArmStrong Number");
		}
	}

}