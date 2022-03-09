package practice;

public class ArrayEx {
	public static void main(String args[]) {
		/*
		 * 타입[] 변수이름; 배열선언 (배열을 다루기 위한 참조변수) 변수이름 = new타입[길이]; 배열생성 (실제 저장공간 생성)
		 * 타입[]변수이름 = new타입 [길이]; 선언과 생성을 동시에!
		 * 
		 */

		int arr1[] = { 3, 6, 9 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1.length);
		}

	}
}
