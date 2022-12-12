package all;
import java.util.Scanner;


public class A1_P7 {

	public static void main(String[] args) 
	{
		int l=0, flag=0;
		System.out.println("Enter the total Numbers you want in your Array: ");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		int[] a = new int [i];
		System.out.println("Enter the value of each Number:  ");
		Scanner sc1= new Scanner(System.in);
		for (int j=0; j<i; j++)
		{
			a[i]=sc1.nextInt();
		}
		System.out.println("Enter the Number in array you want to search in their position: ");
		Scanner sc2= new Scanner(System.in);
		int k=sc2.nextInt();
		for ( l=0; l<i; l++)
		{
			if(a[l]==k)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
		if (flag==1)
		{
			System.out.println((l+1));
		}
		else
		{
			System.out.println("Not Found");
		}
		

	}

}
