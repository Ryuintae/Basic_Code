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
		 * �迭�� ũ�⸦ ��� legnth �Լ� ���� int arr[] = new int[3]; arr[0] = 10; arr[1] = 20;
		 * arr[2] = 30; for(int i = 0; i<arr.length; i++) { System.out.println(arr[i]);
		 * } System.out.println(arr.length);
		 * 
		 */
		String[] name = { "james", "Cathy", "Kenny", "Martin", "Crystal" };
		int[] height = new int[name.length];

		Scanner scanner = new Scanner(System.in);

		int total = 0;
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "�� ������ �Է��ϼ���! ");
			height[i] = scanner.nextInt(); // ����� �����ŭ ������� ���� �Է�
			total += height[i]; // total������ �Է¹��� ���� ����
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "�� Ű�� " + height[i] + "�Դϴ�."); // ������� �Է¹���
		} // ���� ���
		System.out.println("������ �հ� : " + total);
		System.out.println("��� ���� : " + (total / name.length));

	}
}
