package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationException extends Exception {
	int i=10,j=0;

	public UnsupportedOperationException(int i, int j) {
		if (j==0) {
			System.out.println("UnsupportedOperationException");
		}
	}
}






	


