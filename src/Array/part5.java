package Array;

public class part5 {
	public static void main(String[] args) {
		// ���� for���� ������ �迭���̳� �÷����� ó���ϱ⿡ �����ϴ�.
		// ������ �ε����� ����Ҽ��� ���ٴ� ������ �ִ�.
		// for�� �ȿ� Ÿ�� ������ �������ְ� �� ���� �����ؼ� ����Ѵ�.

		int[] arr = { 10, 20, 30 };
		for (int j : arr) {
			System.out.println(j);
		}
		System.out.println("------------------------------");
		int[] score = { 80, 100, 20 };
		int sum = 0;
		for (int k : score) {
			sum += k;
		}
		System.out.println(sum);
	}
}
