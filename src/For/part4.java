package For;

public class part4 {
	public static void main(String[] args) {
//출력예) 	 2 * 1 =  2          3 * 1 =  3          4 * 1 =  4
//	    2 * 2 =  4          3 * 2 =  6          4 * 2 =  8
//          2 * 9 = 18          3 * 9 = 27          4 * 9 = 36
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}

	}
}
