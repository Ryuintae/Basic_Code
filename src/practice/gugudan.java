package practice;
import java.util.Scanner;
public class gugudan {

	public static void main(String[] args) {
		//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		//ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
		//������İ� ���� N*1���� N*9���� ����Ѵ�.
		//������İ� ���� N*1���� N*9���� ����Ѵ�.
		//���̷� �氡�氡~
		//���� ���¶����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		for(int i = 1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}

