package assignment1;

public class App {
	
	private static App app = new App();//1. create a static instance of this class
	
	
	private App() {//2.create a private constructor
		//
	}

	public static App getInstance() {//3. create a static method that will return the instance of that app
		if(null == app)
		{
			app = new App();
			
		}
		return app;
	}
}
