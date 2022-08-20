package Array;

import java.util.Scanner;

public class part4 {
	public static void main(String[] args) {
		// 배열을 이용하여 키를 입력받고 평균/최장신/최단신을 구분하세요

		String ArrName[] = { "민수", "영희", "길동", "현수", "진수" };
		int arr[] = new int[5];
		int totalheight = 0;
		int maxheight = 0;
		int maxheightIndex = 0;
		int minheightIndex = 0;
		int minheight = 0;	
		Scanner sc = new Scanner(System.in);

		System.out.println("5명의 아이의 키를 순서대로 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();// 어떻게하면 입력받은 0 값이 minheight로 선언할수있을까
			totalheight += arr[i];
			minheight = arr[0];
			if (maxheight < arr[i]) {
				maxheight = arr[i];
				maxheightIndex = i;
//				maxheightIndex = arr.length;  인덱스 값에 어떻게 max숫자를 넣나 고민을 했는데 i를 사용하면 가능하다.
			} else if (minheight > arr[i]) {
				minheight = arr[i];
				minheightIndex = i;
			}
		}
		System.out.println("가장 큰 키는 " + maxheight + "\t학생이름은" + ArrName[maxheightIndex]);
		System.out.println("가장 작은키는 " + minheight + "\t학생이름은" + ArrName[minheightIndex]);
		System.out.println("총합 키는" + totalheight);
		System.out.println("평균 키는" + (totalheight / arr.length));
	}
}
