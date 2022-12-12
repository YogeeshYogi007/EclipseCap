package assignment2;

public class Manager extends Employee {

	@Override
	public void Totalsalary(double T) {
		T+=incentive();
		System.out.println(T);
		System.out.println("Here is your incentive:"+incentive());
		
	}
	public double incentive() {
		
		return 10000.00;
	}
}
