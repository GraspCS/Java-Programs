class StaticMethod {
	int x;
	static int y;

	void display() {
		System.out.println("\nInstance method display()\n");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	static void print() {
		System.out.println("\n\nClass/static method print()\n");
		System.out.println("y = " + y);
		// System.out.println("x = " + x);
	}
}

class Main {
	public static void main(String args[]) {
		StaticMethod sm1 = new StaticMethod();
		StaticMethod sm2 = new StaticMethod();

		sm1.x = 22;
		sm2.x = 44;

		StaticMethod.y = 55;

		sm1.display();
		sm2.display();

		StaticMethod.print();
	}
}