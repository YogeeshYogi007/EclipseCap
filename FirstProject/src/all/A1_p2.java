package all;
public class A1_p2 {

	public static void main(String[] args) 
	{
		System.out.println("Armstrong Number is : ");
		for (int i=100; i<=999; i++ )
		{
			int num1=i/100;
			int num2=(i%100)/10;
			int num3=i%10;
			int num4=((int) Math.pow(num1,3))+( (int) Math.pow(num2,3))+((int) Math.pow(num3, 3));
			//System.out.println(num4);
		
		if(i==num4)
		{
			System.out.println(+i);
		}
		

	}

	}
}

