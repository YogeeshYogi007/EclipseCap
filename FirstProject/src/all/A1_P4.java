package all;

public class A1_P4 {

	public static void main(String[] args)
	{
		int i=60, j=70, k=10;
		if( i>=60 )
		{
			System.out.println("Passed   "+i);
		}
		else if(j>=60)
		{
			System.out.println("Passed   "+i);
		}
		else if(k>=60)
		{
			System.out.println("Passed   "+i);
		}
		else if(i<=60)
		{
			System.out.println("failed"+i);
			
		}
		else if(j<=60)
		{
			System.out.println("failed"+i);
			
		}
		else if(k<=60)
		{
			System.out.println("failed"+j);
		}
		else if(i+j==60)
		{
			System.out.println("Promoted"+i+j);
		}
		else if(j+k==60)
		{
			System.out.println("Promoted"+j+k);
		}		
		else if(i+k==60)
		{
			System.out.println("Promoted"+i+k);
		}
		
		
	}

}
