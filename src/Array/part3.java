package Array;

public class part3 {
	public static void main(String[] args) {

		// �迭�� ����߿��� ���� ū ���� ���� ���� ���� ã�´�.

//		���� �߿��� ��!!! �迭�� �ε������� ������ ����Ҽ��ִ�.
//		���� �߿��� ��!!! �迭�� �ε������� ������ ����Ҽ��ִ�.
//		���� �߿��� ��!!! �迭�� �ε������� ������ ����Ҽ��ִ�.
		int[] num = { 10, 20, 30, 40, 50, 2 };
		int max = num[0]; //** ���� int max = 0 , min = 0; ���� �����ߴٸ� �ּҰ��� ������ 0�̿������̴�.
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			} else if (min > num[i]) {
				min = num[i];
			}

		}
		System.out.println("�ִ밪��\t" + max);
		System.out.println("�ּҰ���\t" + min);
	}
}
