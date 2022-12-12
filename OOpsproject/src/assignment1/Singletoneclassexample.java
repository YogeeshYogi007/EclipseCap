package assignment1;

public class Singletoneclassexample {


	public static void main(String[] args) {
		App app=App.getInstance();// only one Instance (app or app1 )is created in single ton class it means the value inside the reference variable will be same
		App app1=App.getInstance();

	}

}
