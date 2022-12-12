package assignment2;

public class Labour extends Employee {

	@Override
	public void Totalsalary(double T) {
		T+=Overtime();
		System.out.println(T);
		System.out.println("Do overtime");
	}
	
	public double Overtime() {
		return 500;
	}
}

