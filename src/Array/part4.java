package Array;

import java.util.Scanner;

public class part4 {
	public static void main(String[] args) {
		// �迭�� �̿��Ͽ� Ű�� �Է¹ް� ���/�����/�ִܽ��� �����ϼ���

		String ArrName[] = { "�μ�", "����", "�浿", "����", "����" };
		int arr[] = new int[5];
		int totalheight = 0;
		int maxheight = 0;
		int maxheightIndex = 0;
		int minheightIndex = 0;
		int minheight = 0;	//�� �����ϰ� ������������

		Scanner sc = new Scanner(System.in);

		System.out.println("5���� ������ Ű�� ������� �Է��ϼ���");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();// ����ϸ� �Է¹��� 0 ���� minheight�� �����Ҽ�������
			totalheight += arr[i];
			minheight = arr[0];
			if (maxheight < arr[i]) {
				maxheight = arr[i];
				maxheightIndex = i;
//				maxheightIndex = arr.length;  �ε��� ���� ��� max���ڸ� �ֳ� ����� �ߴµ� i�� ����ϸ� �����ϴ�.
			} else if (minheight > arr[i]) {
				minheight = arr[i];
				minheightIndex = i;
			}
		}
		System.out.println("���� ū Ű�� " + maxheight + "\t�л��̸���" + ArrName[maxheightIndex]);
		System.out.println("���� ����Ű�� " + minheight + "\t�л��̸���" + ArrName[minheightIndex]);
		System.out.println("���� Ű��" + totalheight);
		System.out.println("��� Ű��" + (totalheight / arr.length));
	}
}
