package hashset;

import java.util.Date;
import java.util.HashMap;


public class Pair<K,V> extends HashMap{
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}


	K key;
	V value;
	
	public Pair() {
		
	}
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public void print() {
		System.out.println(key);
		System.out.println(value);
	}
		
	
	public static void main(String[] args) {
		Pair<String,String> p=new Pair<String,String>();
		p.setKey("1");
		p.setValue("Hello");
		p.print();
		//date.
		Pair<String,Date> p1=new Pair<>();
		p1.setKey("Today is");
		p1.setValue(new Date());
		p1.print();
		//sp1.setKey(12); //this will not allow other than String data type
		
	}
}
	

