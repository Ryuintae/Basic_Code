package Array;

public class part5 {
	public static void main(String[] args) {
		// 향상된 for문은 간단한 배열값이나 컬렉션을 처리하기에 용이하다.
		// 하지만 인덱스를 사용할수는 없다는 단점이 있다.
		// for문 안에 타입 변수를 생성해주고 그 값을 대입해서 사용한다.

		int[] arr = { 10, 20, 30 };
		for (int j : arr) {
			System.out.println(j);
		}
		System.out.println("------------------------------");
		int[] score = { 80, 100, 20 };
		int sum = 0;
		for (int k : score) {
			sum += k;
		}
		System.out.println(sum);
	}
}
