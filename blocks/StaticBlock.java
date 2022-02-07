class StaticBlockDemo {
	static int x;

	static {
		System.out.println("static block");
		x = 111;
	}

	static void display() {
		System.out.println("x = " + x);
	}
}

class Main {
	public static void main(String args[]) {
		System.out.println("main method");

		StaticBlockDemo.display();
	}
}