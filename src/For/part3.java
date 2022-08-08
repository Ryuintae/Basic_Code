package For;

import java.util.Iterator;

public class part3 {
	public static void main(String[] args) {
//출력예) 	1 2 3 4 5      
//		    1 2 3 4 5   
//	        1 2 3 4 5     
//		    1 2 3 4 5   
//	        1 2 3 4 5 
		// 행을 1부터 5번까지 반복할수 있도록 출력하고
		// 내부 반복문에는 1부터 5까지 출력 후 외부 반복문에 띄어쓰기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}
