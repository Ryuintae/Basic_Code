package practice;

import java.util.Scanner;

public class sumfor {
	public static void main(String[] args) {
		/*
		 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� n (1 �� n �� 10,000)�� �־�����. 1����
		 * n���� ���� ����Ѵ�
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = i + n;
		}
		System.out.println(sum);
	}

}
