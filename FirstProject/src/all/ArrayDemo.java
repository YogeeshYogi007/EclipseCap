package all;

public class ArrayDemo {
	static int[] yogi = new int [3];
	

	public static void main(String[] args) 
	{
		System.out.println("--- one Dimensional Array ---");
		int[] yogi = {2,4,6,5};
for (int i=0; i<yogi.length; i++)
{
	System.out.println("  "+yogi[i]);
}


System.out.println("--- two Dimensional Array ---");

		//int[][] names = new int[3][5];
		int[][] names = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
				
		for(int j=0; j<names.length; j++)
		{
			for(int k=0; k<names[j].length; k++)
			{
				System.out.println(names[j][k]);
			}
		}
}
}
 