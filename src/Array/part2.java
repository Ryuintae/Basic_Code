package Array;

import java.util.Iterator;

public class part2 {
	public static void main(String[] args) {
		/* ���հ� ��� */
//		�迭�� ��� ��Ҹ� ���ؼ�  ���հ� ����� ���Ѵ�.

		int sum = 0; 
		double avg = 0;
		int[] score = { 100, 88, 100, 100,90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("�� ����\t"+sum);
		System.out.println("����� " + (avg=(double)sum/(double)score.length));
		}
}
