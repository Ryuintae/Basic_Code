package practice;

import java.util.Scanner;

public class pr2 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 배열의 크기를 얻는 legnth 함수 예제 int arr[] = new int[3]; arr[0] = 10; arr[1] = 20;
		 * arr[2] = 30; for(int i = 0; i<arr.length; i++) { System.out.println(arr[i]);
		 * } System.out.println(arr.length);
		 * 
		 */
		String[] name = { "james", "Cathy", "Kenny", "Martin", "Crystal" };
		int[] height = new int[name.length];

		Scanner scanner = new Scanner(System.in);

		int total = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요! ");
			height[i] = scanner.nextInt(); // 저장된 사람만큼 순서대로 신장 입력
			total += height[i]; // total변수에 입력받은 신장 저장
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "의 키는 " + height[i] + "입니다."); // 순서대로 입력받은
		} // 신장 출력
		System.out.println("신장의 합계 : " + total);
		System.out.println("평균 신장 : " + (total / name.length));

	}
}
