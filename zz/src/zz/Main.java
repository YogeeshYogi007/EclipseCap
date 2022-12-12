package zz;

import java.util.ArrayList;
import java.util.Arrays;

class MyException extends Exception { 
	public MyException(String message) {
super(message);
	}
}

class Main {

ArrayList<String> data= new ArrayList<>(Arrays.asList("datal", "data2", "data3")); 
public void checkLanguage(String language) throws MyException {

if (data.contains(language)) { 
	throw new MyException(language);
}
else {

data.add(language);

System.out.println(language);

}
}

public static void main(String[] args) {

Main obj= new Main();

try {

obj.checkLanguage("datal");

obj.checkLanguage("data4"); } 
catch (MyException e) {

System.out.println("Error");
}}}
