package practice;
//ManyClass ¾àÀÚ
public class MC {

 public static void sum(int left, int right) {
	 System.out.println(left+right);
 
 }
 public static int div(int left,int right) {
	 int a = left/right;
	System.out.println(a);
	 return a;
 }
	public static void main(String[] args) {
	sum(10,20);
	div(30,10);
	}

}
