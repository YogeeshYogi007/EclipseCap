package com.cg.lambda;

public class Client {
	
	 
	public static void main(String[] args) {
		//Lambda expression is only applicable for functional interfaces
		/*
		 * Replica r= ()->System.out.println("addition of numbers is"); r.add();
		 */
		//Addition of two numbers using Lambda
//		  Replica r1=(int a,int b)-> { System.out.println(a+b); };
//		  r1.add1(10, 20);
		//Method having return type	
//		Replica r3= ()->{
//			return 10;
//			};
		
//		Replica r4=(int a,int b,double c)->{
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
//		};
//		r4.cube(10, 204, 500);
		//Lambda on Runnable[I]
//		Runnable r1=() -> System.out.println("hello world");
//		r1.run();
		
		Thread t1=new Thread(()->System.out.println("hii"));
		t1.run();
		
		Thread t2=new Thread(()->{
			System.out.println("1");
			System.out.println("q");
			System.out.println("c");
		});
		t2.run();
	}

}
