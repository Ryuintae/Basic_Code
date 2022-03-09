package practice;

public class pr1 {
public static void main(String args[]) {

	int[]arr1 = new int[3];
	for(int i=0; i<3; i++) {
		System.out.println("arr1[" + i +"] : " + arr1[i] );
	}
	arr1[0] = 3;
	arr1[1] = 6;
	arr1[2] = 9;
	for(int i =0; i<3; i++) {
		System.out.println("arr1[" + i + "] : " + arr1[i]);
	}
	double[] arr2 = new double[3];
	arr2[0] = 1.1;
	arr2[1] = 2.1;
	arr2[2] = 3.1;
	
	for(int i = 0; i<3; i++) {
		System.out.println("arr1[" + i + "] : " + arr2[i]);		
	}
	
	
	



}
}
