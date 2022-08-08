package Array;

public class part3 {
	public static void main(String[] args) {

		// 배열의 요소중에서 제일 큰 값과 제일 작은 값을 찾는다.

//		가장 중요한 점!!! 배열의 인덱스값을 변수로 사용할수있다.
//		가장 중요한 점!!! 배열의 인덱스값을 변수로 사용할수있다.
//		가장 중요한 점!!! 배열의 인덱스값을 변수로 사용할수있다.
		int[] num = { 10, 20, 30, 40, 50, 2 };
		int max = num[0]; //** 만약 int max = 0 , min = 0; 으로 선언했다면 최소값은 무조건 0이였을것이다.
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			} else if (min > num[i]) {
				min = num[i];
			}

		}
		System.out.println("최대값은\t" + max);
		System.out.println("최소값은\t" + min);
	}
}
