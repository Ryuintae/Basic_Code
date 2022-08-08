package For;

import java.util.Iterator;

public class GuGuGu {
	public static void main(String[] args) {
////		 출력예)	  ********** (5행10열)  
//		       		  **********      
//		    		  **********      
//		      		  ********** 
//		           	  **********
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();
		}
	}
}
