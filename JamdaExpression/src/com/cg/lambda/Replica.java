package com.cg.lambda;

/**
 * Functional interface can only have one method only
 * @author yogegh
 * 
 */
@FunctionalInterface
public interface Replica 
{
	//public void add();
	//public void add1(int a, int b);
	//public int addition();
	public void cube(int a,int b,double c);
}
