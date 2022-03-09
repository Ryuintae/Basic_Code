//package work;

public class Parent {
	int age = 45;
	String name = "Parent";

	public Parent() {
		System.out.println("Parent default Constructor");
	}

	public Parent(int _age, String _name) {
		age = _age;
		name = _name;
		System.out.println("Parent Constructor");
	}

	public void showInfo() {
		System.out.println("Name : " + name + ", age :" + age);

	}

	class Child extends Parent {
		public Child(int _age, String _name) {
			System.out.println("child constructor");
		}
	}

	public class Main {

		public static void main(String[] args) {
			Parent a = new Parent();
			a.showInfo(10,"what");
			
		}

	}
}