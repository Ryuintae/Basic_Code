package practice;

import java.util.Scanner;

public class forex {
	public static void main(String args[]) {
		// n부터 출력되고 1이 마지막에 나타나게 하기
		// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner in = new Scanner(System.in);

		int n =in.nextInt();
		for(int i = n; i>=1;--i) {
			System.out.println(i);
		}
	
	}

}