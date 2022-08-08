package Array;

import java.util.Iterator;
import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
//		  문제) 5개 정수를 입력받은 후 차례로 출력하는 프로그램
//		  입력 예) 5 10 9 3 2 
//		  출력 예) 5 10 9 3 2
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요");
		int[] arr = new int[5]; 
		//***** arr은 주소값을 가지고있는 변수이고 
		//***** int형의 길이를 5개를 가지는 배열을 만드는 뜻이다. 길이와 인덱스의 길이는 달라서 4까지밖에 출력이 안된다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 인덱스에 바로 값을 입력 받을 수 있다.
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
