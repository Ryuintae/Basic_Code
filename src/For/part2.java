package For;

public class part2 {
//출력예) 	1 1 1 1 1      
//		    2 2 2 2 2  
//	        3 3 3 3 3    
//		    4 4 4 4 4  
//	        5 5 5 5 5
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for(int j = i; j<=i+5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
