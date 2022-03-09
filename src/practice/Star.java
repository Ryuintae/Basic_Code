package practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		/*
		공백을 출력하자.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		
		System.out.println();
		}
		}
		
		
		
	}

}
