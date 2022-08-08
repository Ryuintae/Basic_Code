package Array;

import java.util.Iterator;

public class part2 {
	public static void main(String[] args) {
		/* 총합과 평균 */
//		배열의 모든 요소를 더해서  총합과 평균을 구한다.

		int sum = 0; 
		double avg = 0;
		int[] score = { 100, 88, 100, 100,90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총 합은\t"+sum);
		System.out.println("평균은 " + (avg=(double)sum/(double)score.length));
		}
}
